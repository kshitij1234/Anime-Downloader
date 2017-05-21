from selenium import webdriver
import time
import requests
import os
import sys
from selenium.webdriver.common.keys import Keys

site = "http://kissanime.ru/Login"
username = sys.argv[1]
password = sys.argv[2]
anime_name = sys.argv[3]

browser = webdriver.Chrome()
browser.get(site)
time.sleep(7)

emailElem = browser.find_element_by_id('username')
emailElem.send_keys(username)
passwordElem = browser.find_element_by_id('password')
passwordElem.send_keys(password)
passwordElem.submit()

time.sleep(3)
search_bar = browser.find_element_by_css_selector("#keyword")
search_bar.send_keys(anime_name+Keys.ENTER)
time.sleep(3)

odd_entry = "tr.odd:nth-child(3) > td:nth-child(1) > a:nth-child(1)"
even_entry = ".listing > tbody:nth-child(1) > tr:nth-child(4) > td:nth-child(1) > a:nth-child(1)"

list_of_shows = []
count = 1

while True:

    try:
        if 1 == count%2:
            item = browser.find_element_by_css_selector(odd_entry)
            list_of_shows.append(item)
            odd_entry = odd_entry[0:17]+str(int(odd_entry[17])+2)+odd_entry[18:]
        else:
            item = browser.find_element_by_css_selector(even_entry)
            list_of_shows.append(item)
            even_entry = even_entry[0:46]+str(int(even_entry[46])+2)+even_entry[47:]
        count += 1
    except:
        print("Got all the items")
        break

print(list_of_shows.__len__())
list_of_shows

# Now to get the list of shows to display to the user

lised_shows = []

for i in range(list_of_shows.__len__()):
    lised_shows.append(list_of_shows[i].get_attribute("innerHTML"))
    print(lised_shows[i])

print(lised_shows.__len__())





