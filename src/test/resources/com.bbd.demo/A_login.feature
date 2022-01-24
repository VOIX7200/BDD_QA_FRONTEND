Feature: Login Form

 # Scenario Outline: Test Login form
 Scenario: Test Login form
   Given The Login form is open
   When I enter <username>,<password>
   Then I should see the <msg> message on screen

   Examples: 
   | username | password  |msg       |                           
   |          | abcd      | wrong username or password | 
   | Joe3     | 12345    | wrong username or password |
   | Joe4     | abcd     | wrong username or password |
   |  Bigdog  | Opendoor1 |                           |
   # Scenario: Test Login form      
   # Given The Login form is open
   # When I enter "Bigdog","Opendoor1"
   # Then I should see the " " message on screen