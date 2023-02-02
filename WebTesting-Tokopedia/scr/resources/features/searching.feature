@Search
Feature: Searching product on Tokopedia

Scenario Outline: User searching product they wanna buy
  Given user on Tokopedia website
  When user input <product> on search box
  Then user will see total product
  And Scrolling the website
  Examples:
    | product         |
    | "mainan kucing" |
    | "baju perang"   |
