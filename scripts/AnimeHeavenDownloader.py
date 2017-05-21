import requests,bs4,re,sys,os

#provide first url
url="http://animeheaven.eu/i.php?a=Fate%20Stay%20Night%20-%20Unlimited%20Blade%20Works%202%20Dubbed"
mainsite="http://animeheaven.eu/"

destination="D:\\Anime\\Fate Stay Night - Unlimited Blade Works S2\\"
r=requests.get(url)

try:
    r.raise_for_status()
except:
    print("Error in opening main page. Check internet Connection")
    sys.exit(1)
print("Got access to Main List of episodes")

if not os.path.exists(os.path.dirname(destination)):
    os.makedirs(os.path.dirname(destination))

soup=bs4.BeautifulSoup(r.text,"html.parser")

dpages=soup.select(".infoepbox > a")
#print(dpages)
#now iterate over all episode pages
for i in range(len(dpages)-1,-1,-1):

    r2=requests.get(mainsite+dpages[i].get("href"))

    try:
        r2.raise_for_status()
    except:
        print("Unable to get access to page of episode : "+str(len(dpages)-i))
        continue;



    soup2=bs4.BeautifulSoup(r2.text,"html.parser")

    dlink=soup2.select("script")
    #print(dlink[4])
    #the 5th script contains my link

    mylink=re.compile(r"href='(.*)'")
    downlink=mylink.search(str(dlink[4]))[1]

    print("Starting download of Episode : "+str(len(dpages)-i))
    downloaded=requests.get(downlink)
    try:
        downloaded.raise_for_status()
    except:
        print("Unable to download episode : "+str(len(dpages)-i))
        continue;

    f=open(destination+"Episode "+str(len(dpages)-i)+".mp4","wb")

    for con in downloaded.iter_content(100000):
        f.write(con)
    print("Downloaded episode : "+str(len(dpages)-i))
    f.close()
