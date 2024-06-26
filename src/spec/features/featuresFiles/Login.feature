@connexion
Feature: Je souhaite verifier la page de connexion

  @cnx
  Scenario: Je souhaite verifier la page de connexion avec de données invalides
    Given Je visite le site nopcommerce
    When Je saisis l'adresse mail "halimatest@gmail.com"
    And Je saisis le mot de passe "admin"
    And Je clique sur le bouton login
    Then Je verifie le message d'erreur "wrong mail"
