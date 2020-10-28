@tag1
Feature: Catalog Validation 
  I as user, I want to validate the catalog module.

  Background: Initialize the browser
    Given The user start the navigator

  @case1
  Scenario: Look for Casual dresses for women
    Given The user select women category
    When She looks for a size "S" casual dress 
    Then She check the "Printed Dress"