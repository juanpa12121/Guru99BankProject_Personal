Feature: Successfully login user
  Me as QA Analyst
  I need to login user
  To validate that user log in successfully and show welcome message

  Scenario Outline: Login an existing user successfully
    Given I am on the login page
    When I enter valid credentials
      | id   | password   |
      | <id> | <password> |

    Then I should be logged successfully and I see the welcome message <welcomeMessage>

    Examples:
      | id         | password | welcomeMessage                         |
      | mngr485981 | AhatYsA  | Welcome To Manager's Page of GTPL Bank |
      #| mngr486149 | tAtUpYz  | Welcome To Manager's Page of GTPL Bank |
      #| mngr486167 | dasUzAg  | Welcome To Manager's Page of GTPL Bank |
      #| mngr485965 | mErAhev  | Welcome To Manager's Page of GTPL Bank |
      #| mngr486180 | asuvAta  | Welcome To Manager's Page of GTPL Bank |