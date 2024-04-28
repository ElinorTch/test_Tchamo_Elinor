Feature: Account user

  @open_modal
  Scenario: Open modal
    Given user in the home page
    When user click avatar in navbar
    Then modal is open