import os
import re
import sys
import time

import requests
from selenium import webdriver
from selenium.webdriver.common.keys import Keys

site = "https://9anime.to/"

# There will be an option between providing the anime name(option "1" ) and the anime episode 1 page (option "2").

anime_name = ""
anime_episode_page = ""
path = sys.argv[3]

if not os.path.exists(os.path.dirname(path)):
    os.makedirs(os.path.dirname(path))

browser = webdriver.Firefox()
browser.set_window_size(1024, 768)
# Now search the anime if anime name is provided

if "1" == sys.argv[1]:

    try:
        browser.get(site)
        time.sleep(5)
        anime_name = sys.argv[2]
        browser.save_screenshot("mainpage.png")
        search = browser.find_element_by_css_selector(".inner > input:nth-child(2)")
        search.click()
        search.send_keys(anime_name + Keys.ENTER)
        time.sleep(5)
        browser.save_screenshot('searchresult.png')
        anime_episode_page = browser.find_element_by_css_selector(
            "div.col-lg-4:nth-child(1) > div:nth-child(1) > a:nth-child(1)")
        anime_episode_page.click()

    except:
        print("Error in searching specified anime")
        sys.exit(1)

else:

    try:
        anime_episode_page = sys.argv[2]
        browser.get(anime_episode_page)
        time.sleep(10)
        browser.execute_script("window.stop();")

    except:
        print(anime_episode_page)
        print("Wrong Page link . Link does not exist")
        sys.exit(2)

        # Now we have reached the page of episode number 1 (or n if used method 2)...Moving Forward

time.sleep(5)

while True:

    download_link = browser.find_element_by_css_selector("a.item")
    link = download_link.get_attribute('href')

    print("Downloading.....")

    try:
        downloaded = requests.get(link)

    except:
        print("Connection Error . Trying to download next episode")
        continue

    d = downloaded.headers["content-disposition"]

    fname = re.findall("filename=(.+)", d)[0]

    f = open(path + fname[1:len(fname)-1], "wb")

    for con in downloaded.iter_content(100000):
        f.write(con)
    print("Downloaded : " + fname)
    f.close()

    # Let us go to the next page and if error occurs that means we have reached the last page and break

    try:
        next = browser.find_element_by_css_selector("div.item.mbtn.next.disabled")
        print("Unable to click")
        break;
    except:
        next = browser.find_element_by_css_selector("div.item.mbtn.next")
        next.click()
        time.sleep(5)
        print("clicked")

print("All possible episodes have been looped through")