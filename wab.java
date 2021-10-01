#importing all the necessary libaries
from selenium import webdriver
from selenium.webdriver.support import expected_conditions as ec
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.by import By
import time
browser = webdriver.Chrome('/usr/bin/chromedriver')
browser.get('https://web.whatsapp.com/')
wait = WebDriverWait(browser, 600)
target = '"Rohan mathur"' #enter contact name here
string = "Message by python!" #target msg
x_arg = ' //span[contains(@title, ' + target +')]'
target = wait.until(ec.presence_of_element_located((By.XPATH, x_arg)))
target.click()
