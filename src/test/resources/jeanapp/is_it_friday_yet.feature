Feature: Is It Friday yet?
  Everybody wants to know whe it's Friday

  Scenario: Sunday isn't Friday
    Given  today is Sunday
    When i ask whether it's Friday yet
    Then i should be told "Nope"

    Scenario: Friday is Friday
      Given today is Friday
      When i ask whether it's Friday yet
      Then i should be told "TGIF"