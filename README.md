# Anidpy : Anime-Downloader
I am a huge fan of Anime and honestly who isn't? (except for some really boring people that is!!). Though there exist some really awesome sites to stream anime online, there are times when simply streaming some anime online is not an option - whether it is because of a slow internet connection or because you are leaving your college for the summer vacations. At times like this you need to download entire anime seasons beforehand for later viewing. Since torrents have been banned, and the lack of sites providing bulk downloads, you have no other choice but to download each episode one by one - wasting your precious time which could be spent doing something more poductive.

Fear no more for Anidpy solves all your problems . Anidpy is a pet project I made in Java and Python to automate this tedious task of downloading entire seasons of anime one episode at a time . Without further ado, let us dive into how to use this awesome piece of software - 

*A little Side Note - The project at first also considered using Kissanime website for downloading, but now that they have implemented anti-bot checks to secure their website, it has become very difficult to scrape their website. Also 9anime.to has also become quite unstable these days which makes it difficult to download episodes from there but since it works perfectly most of the time, I have included a scrapper for it.*

## Getting Started
Follow the following steps so that Anidpy can run on your computer
1. Download and install the latest versions of jdk and jre.
1. Download the latest version of Python 3.
1. Open up Command Prompt and type in these commands : (If you are on windows and an error occurs, try opening cmd as administrator)
   1. 'pip install --upgrade pip'
   1. 'pip install requests'
   1. 'pip install bs4'
   1. 'pip install selenium'
1. NOTE THAT THE NEXT TWO STEPS ARE OPTIONAL AND ARE REQUIRED ONLY IF YOU WANT TO USE THE 9nime DOWNLOADER OF Anidpy . (which I highly discourage you from doing if the Animeheaven Downloader works fine for your anime)
   1. Download and install an older version of Mozilla Firefox - Version 45 . 
   1. Download the latest version of geckodriver from [here](https://github.com/mozilla/geckodriver/releases) and include its .exe file in your path . (Easy way for Windows Users - Just paste the .exe file in *C:/Windows* .
1. Now that you have the prerequisites down, clone this repository on your local machine or simply download the zip file . 
1. Now open up src/application/Main.java , preferably in an IDE because it can automatically generate the .class files for you .

You will now see a screen like this : 

![Main Page](https://github.com/kshitij1234/Anime-Downloader/blob/master/screenshots/mainpage.png)

As you can see, you have two options to choose from, let us discuss them in detail.

## Animeheaven Downloader

This one uses bs4 and requests to scrape download links from http://animeheaven.eu/ . I highly recommend using this unless and until you cannot find your desired anime on this site (the database of this site is highly limited, sadly) or you wish to download only a part of the series (say after a certain episode) .

When you click on this button, your screen will look somewhat like this - 

![Front Page - ah](https://github.com/kshitij1234/Anime-Downloader/blob/master/screenshots/animeheavenempty.png)

Now go to http://animeheaven.eu/ and search for your desired anime : 

![Main Page - ah](https://github.com/kshitij1234/Anime-Downloader/blob/master/screenshots/ahmainpage.png)

After typing in your search query you will be redirected to a list like this - 

![Search Result - ah](https://github.com/kshitij1234/Anime-Downloader/blob/master/screenshots/ahsearchresult.png)

Choose the one which you want to download **completely** and click on it - 

![Episode List - ah](https://github.com/kshitij1234/Anime-Downloader/blob/master/screenshots/ahepisodelist.png)

**Copy the URL of this Page** and paste it in the URL Textbox of the software . Also choose a location on your computer where you want all the episodes to be downloaded - 

![Filled Form - ah](https://github.com/kshitij1234/Anime-Downloader/blob/master/screenshots/animeheavenfilled.png)

Now you can start the download . On the right hand side, a table will give you the current status of your download and will prompt you once all episodes have finished downloading . 

![Downloading - ah](https://github.com/kshitij1234/Anime-Downloader/blob/master/screenshots/animeheavendownloading.png)

![Downloaded - ah](https://github.com/kshitij1234/Anime-Downloader/blob/master/screenshots/animeheavendownloaded.png)

**Important - Do not forget to click the refresh button before going ahead with the download of another series.**


## 9Anime Downloader

I cannot stress it enough but I really discourage the use of this downloader unless you really have no other choice ( either the given anime is not present on animeheaven or you need episodes after a certain episode and really mind the presence of those few extra episodes on your precious computer). The reasons for my discouragement are many, including the extra efforts you have to put in to set up this downloader, not to mention the fact that the site https://9anime.to/ has become really unstable these days and also that this downloader opens up a firefox browser window (which you can minimize and **NOT DISTURB!!!!** by the way) which considerably slows down your computer . 

Now inspite of all those discouraging words, if you have made up your mind to actually use this downloader, follow these steps -

The main page of the downloader looks like this - 

![unfilled - na](https://github.com/kshitij1234/Anime-Downloader/blob/master/screenshots/nineanimeempty.png)

Now you have two options - either provide the anime name and the downloader will search for the anime itself and start the download, or provide the link to the 1st Episode (or any Episode) and the downloader will simply continue to download all the episodes from that episode on. I would recommend the second method as search results are unpredictable and it may happen that even if you searched for a particular anime, your downloader actually downloads an entirely different series or season. To ensure that does not happen, make sure that you search beforehand on https://9anime.to/ and confirm that your intended anime comes up as the first search result . 

![mainpage - na](https://github.com/kshitij1234/Anime-Downloader/blob/master/screenshots/nhmainpage.png)

Make sure the first result is what you want :

![result - na](https://github.com/kshitij1234/Anime-Downloader/blob/master/screenshots/nhsearchresult.png)

You can also specify a url similar to the one shown below and even choose a later episode to start the download from:

![episode - na](https://github.com/kshitij1234/Anime-Downloader/blob/master/screenshots/nhepisode.png)

Finally , you can start the dowload . The rest is similiar to Animeheaven Downloader . 

![episode - na](https://github.com/kshitij1234/Anime-Downloader/blob/master/screenshots/nineanimefilled.png)

Once again I highly discourage you from using this 9anime downloader due to its unpredictable nature . 

# Contributing

It would be nice if you could contribute to this project by finding errors, fixing bugs and even adding support for more sites. Looking forward to your pull requests!!

# DISCLAIMER 

*Downloading copyrighted media without the owner’s permission is illegal is some countries. Under no circumstances is this software intended to encourage illegal activity, and there are no guarantees that this information will protect you from any legal action.*
