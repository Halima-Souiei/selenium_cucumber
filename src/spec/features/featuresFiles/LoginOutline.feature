@login-multiUsers
Feature: Je souhaite me connecter avec plusieurs comptes

  @login-multiUsers
  Scenario Outline: Je souhaite me connecter avec plusieurs comptes
    Given Je visite le site nopcommerce
    When Je saisie une adresse mail "<email>"
    When Je saisie un mot de passe "<password>"
    When Je clique sur le bouton login

    Examples: 
      | email              | password |
      | admin@yourstorecom | admin    |
      | akrem@gmailcom     | akrem    |
      | olfa@gmailcom      | olfa     |
      | ahmed@gmailcom     | ahmed    |
