Feature: Travel Website Testing

  Scenario: User searches for a holiday destination
    Given User is on the travel website homepage
    When User searches for a India
    Then Search results are displayed
