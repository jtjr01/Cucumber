Feature: Friday is Friday
  Everybody wants to it's Friday

  Scenario: Friday is Friday
    Given today is Friday
    When I ask if it's Friday yet
    Then I should be told "Yes"