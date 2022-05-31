@Task
Feature: verifying the Admin area demo page

Background:
Given User is on login page

@Task1
Scenario: Verifying the Admin area demo page with valid credentials
    When user enters the email and password using dataTable oneD List
             |admin@yourstore.com|
             |admin|
    And user click login button
    Then User get validate the page

@Task2
Scenario: Verifying the Admin area demo page with invalid credentials
    When user enters the email and password using dataTable TwoD Lists
               |admin@yourstore.com|admin123|
               |admin@yourstore.com|admin876|
    And user click login button
    Then User get validate the msg

@Task3
Scenario: Verifying the Admin area demo page with invalid credentials
    When user enters the email and password using dataTable OneD Map
               |email   |admin@yourstore.com|
               |password|admin123|
    And user click login button
    Then User get validate the msg

@Task4
Scenario: Verifying the Admin area demo page with invalid credentials
    When user enters the email and password using dataTable TwoD Maps
                  |email                |password|
                  |praveen@yourstore.com|admin123|
                  |admin@yourstore.com  |admin12|
    And user click login button
    Then User get validate the msg