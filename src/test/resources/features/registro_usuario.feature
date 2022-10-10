#Maikel_Franco


  @stories
  Feature: User registration on the utest platform

    As a user, I want to log in to the utest site and be able to register.

  @Scenario1:

  Scenario: registration on the platform
    Given where Maikel wants to register on the utest website
    When the user enters the information required by the page
    | strName | strLasname | strEmail         | strMontOfBirthday | strDayOfBirthday | strYearOfBithday | strCiudad     | strPostalCode | strCountry |
    | Anyi    | Quintero   | anyi@hotmail.com |   June            |       19         |    1990          | San Miguelito |  507          |   Panama   |


    Then Registration successfully completed

