Feature: Login into Application

 Scenario: Positive test validation login
 Given intializa the browser with chrome
 And Navigate to "http://QAClickAcademy.com" Site
 And Click on the Login link in home page to land on secure sign in page
 When user enters "test99@gmail.com" and "123456" and logs in
 Then Verify that user successful logged in 

      