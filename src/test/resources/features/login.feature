Feature:

  @validData
  Scenario: Login with valid data
    Given Navigate to Home Page
    When Click on Login tab

    And Enter Valid data
    And Click on Login button
    Then SignOut button displayed

  @invalidPassword
  Scenario Outline: Login with invalid password
    Given Navigate to Home Page
    When Click on Login tab
    And Enter Valid email an invalid password
    |   email   |  password  |
    |  <email>  | <password> |
    And Click on Login button
    Then Alert appeared
    Examples:
    |     email     | password |
    | kan@gmail.com | 123$ |
    | kan@gmail.com | 123456 |