Feature: Create a cat
  
  Scenario: Should be able to create a cat
    Given I have an empty cat
    When I create a cat with name "Kitty"
    Then The name returned should be "Kitty"
    
  Scenario: Should be able to change name of cat
    Given I have an empty cat
    When I create a cat with name "Kitty"
    And Change its name to "Meow"
    Then The name returned should be "Meow"
    
    
    
