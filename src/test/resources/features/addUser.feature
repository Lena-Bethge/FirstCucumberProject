Feature:

  @addUser
  Scenario: Login with valid data and fill user form
    Given Navigate to HomePage1
    When Click on Login tab1
    Then Appear Login Registration form1
    And Enter Valid data1
    And Click on Login button1
    And Click on Add tab
    And Appear AddUser form
    Then Click on Save button

