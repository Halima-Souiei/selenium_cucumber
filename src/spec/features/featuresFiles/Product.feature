@product
Feature: Je souhaire rechercher et ajouter un produit

  Background: 
    Given Je visite le site nopcommerce
    When Je saisis l'adresse mail "mailto:admin@yourstore.com"
    And Je saisis le mot de passe "admin"
    And Je clique sur le bouton login
    And Je clique sur le bouton catalog
    And Je clique sur le bouton products

  @rechercheProduit
  Scenario: Recherche de Produit
    And Je saisis le nom du produit "HP Spectre XT Pro UltraBook"
    And Je selectionne la categorie
    And Je clique sur le bouton search
    Then Je verifie le produit "HP Spectre XT Pro UltraBook"
  

  @ajoutProduct
  Scenario: Je souhaite ajouter un produit dans le site
    And Je clique sur le bouton add new
    And Je saisie le nom de produit "sharp"
    And Je saisie la date de debut "10/07/2024 12:12"
    And je selectionne le prix de produit  
    And Je clique sur le bouton save        