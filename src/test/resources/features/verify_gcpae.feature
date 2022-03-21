Feature: Verify GCPAE website
  Scenario: Check GCPAE first screen
    Given Safado wants to make a quiz
    Then he should see the gcpae website greeting: "Welcome to the Google Cloud Exam"
    And he should see the website title "GCPA Exam"

  Scenario: Go to Quiz screen
    Given Safado is on gcpae website
    When he goes to hamburger menu
    And he clicks on "Get exam"
    Then he should see the Start Quiz screen

  Scenario: Go to About screen
    Given Safado is on gcpae website
    When he goes to hamburger menu
    And he clicks on "About"
    Then he should see the About screen