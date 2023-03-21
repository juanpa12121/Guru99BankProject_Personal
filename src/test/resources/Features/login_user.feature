Feature: Successfully login user
  Me as QA Analyst
  I need to login user
  To validate that user log in successfully and show welcome message

  Background: Go to Login page
    Given I am on the login page

  Scenario Outline: Login an existing user successfully
    When I enter valid credentials
      | id   | password   |
      | <id> | <password> |

    Then I should be logged successfully and I see the welcome message <welcomeMessage>
    And I validate that list of left elements are displayed

    Examples:
      | id         | password | welcomeMessage                         |
      | mngr485981 | AhatYsA  | Welcome To Manager's Page of GTPL Bank |
      #| mngr486149 | tAtUpYz  | Welcome To Manager's Page of GTPL Bank |
      #| mngr486167 | dasUzAg  | Welcome To Manager's Page of GTPL Bank |
      #| mngr485965 | mErAhev  | Welcome To Manager's Page of GTPL Bank |
      #| mngr486180 | asuvAta  | Welcome To Manager's Page of GTPL Bank |

  Scenario Outline: Try to login an non-existing user
    When I enter non-existent user credentials
      | id   | password   |
      | <id> | <password> |

    Then I should see an alert with the message <alertMessage>

    Examples:
      | id     | password | alertMessage      |
      | juanpa | AhatYsA  | User is not valid |
