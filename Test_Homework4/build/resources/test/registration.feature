Feature: Automatic Google account registration
  Scenario: Register a new user
    Given User launches Chrome browser
    When User opens registration form
    Then User enters first name
    Then User enters e-mail address
    Then User enters gender and birthday
    Then User enters phone number
    Then User enters subject, hobbies and where he lives