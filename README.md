# Selenium-Practice
Read in Raw format

Week 10.2 - 10.9
Progess: Went through all of Selenium IDE and WebDriver tutorials and first three tutorials of Advanced WebDriver Stuff. Wrote both tutorial sample tests and personal practice tests which can be found on Selenium-Practice. Also i had a skim over all three projects, Wikia, Mozilla addon, and Jenkins. All three have plenty of Selenium tests code while Mozilla addon uses python in which the interface of Selenium looks a little different but generally I can understand.

Note: 1.Selenium Practice: https://github.com/yiyuli/Selenium-Practice
      2.tutorial website: https://www.guru99.com/selenium-tutorial.html
      3.running tests in another computer could be difficult for now. To run the Selenium IDE tests in SeleniumIDE-Tests directory, install SeleniumIDE and FireFox with Firebug and SeleniumIDE extensions. See https://www.guru99.com/install-selenuim-ide.html
      4.to run the WebDriver tests, I followed the tutorial to use Eclipse IDE and add WebDriver as libraries. See https://www.guru99.com/installing-selenium-webdriver.html
      5.to run RegistrationTest in personalPractice Package, the website has to be logged in before testing because it will direct to real registeration page before user can play with its practice registration page.
      6.in the System.setProperty method in every test, the second argument which is the chrome driver local address has to be change to where you downloaded the chrome driver
      7.to run testNG test, install testNG plugin in Eclipse marketplace

Plan: 1.use Maven to configure dependencies so that dependency files like WebDriver can be downloaded automatically
      2.improve RegistrationTest to automatically sign in and run the test so that beforehand login is not needed
      3.continue to study the tutorial in the next weeks. The plan is to finish it in two weeks. Meanwhile, start to look at open source project using Selenium tests

Week 10.10 - 10.24
Progress: Went through all of advanced webdriver tutorial as well as testNG tutorial. Wrote both tutorial sample tests and personal practice tests which can be found on Selenium-Practice.

Note: 1.in the first week, I didn't initialize git in original Selenium-Practice directory and found the new code cannot be checked out to github from original directory. So I have to delete the previous github repository and commit the whole code to newly created repository from original directory. Sorry for letting you be unable to see the changes from the first week commit. New added java files are mainly about crossbrowser testing, ajax, sessions, cookies, tooltip, testNG, iframe, broken links, phantomJS, HTMLUnit, Screenshot. If you need more details, let me know. Also, this two weeks contain more conceptual stuff and slightly irrevelant knowledge like database testing, Log4j. For those, I just read the tutorial and didn't try too much.
      2.Selenium Practice: https://github.com/yiyuli/Selenium-Practice
      3.tutorial website: https://www.guru99.com/selenium-tutorial.html
      4.to run the Selenium IDE tests in SeleniumIDE-Tests directory, install SeleniumIDE and FireFox with Firebug and SeleniumIDE extensions. See https://www.guru99.com/install-selenuim-ide.html
      5.to run the WebDriver tests, I followed the tutorial to use Eclipse IDE and add WebDriver as libraries. See https://www.guru99.com/installing-selenium-webdriver.html
      6.to run RegistrationTest in personalPractice Package, the website has to be logged in before testing because it will direct to real registeration page before user can play with its practice registration page.
      7.in the System.setProperty method in every test, the second argument which is the chrome driver local address has to be changed to where you downloaded the chrome driver
      8.to run testNG test, install testNG plugin in Eclipse marketplace
      
Plan: Look into code of found open source project Selenium tests, run these tests, collect the result and analyze it. 
