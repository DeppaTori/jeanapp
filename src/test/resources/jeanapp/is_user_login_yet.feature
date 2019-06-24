Feature: Is User login yet?
  System want to know when user login

  Scenario: Session is null
    Given Session is "null"
    When System check whether user login yet
    Then  Application should print "false"