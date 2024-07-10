package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.ProductsPage;

import org.junit.Assert;
import org.openqa.selenium.Keys;

import com.e2eTests.automation.page_objects.LoginPage;
import com.e2eTests.automation.utils.SelectFromListUtils;
import com.e2eTests.automation.utils.SeleniumUtils;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductStepDefinitions {

	public LoginPage loginPage;
	public SeleniumUtils seleniumUtils;
	public ProductsPage dashbordPage;
	public SelectFromListUtils selectFromListUtils; 
	
	 
	public ProductStepDefinitions() {

		loginPage = new LoginPage();
		seleniumUtils = new SeleniumUtils();
		dashbordPage = new ProductsPage();
		selectFromListUtils = new SelectFromListUtils();
	}

	@When("Je clique sur le bouton catalog")
	public void jeCliqueSurLeBoutonCatalog() throws InterruptedException {

		Thread.sleep(3000);
		seleniumUtils.click(ProductsPage.getBtnCatalog());
		
	}

	@When("Je clique sur le bouton products")
	public void jeCliqueSurLeBoutonProducts() {
		seleniumUtils.click(ProductsPage.getBtnProduct());
	}

	@When("Je saisis le nom du produit {string}")
	public void jeSaisisLeNomDuProduit(String nomproduit) {
		seleniumUtils.writeText(ProductsPage.getNomProduct(),nomproduit);  

	}

	@And("Je selectionne la categorie")
	public void jeSaisisLaCategorie() {
		seleniumUtils.click(ProductsPage.getBtnProductCategory());

		selectFromListUtils.selectDropDownListByIndex(ProductsPage.getBtnProductCategory(), 3);
		 
	}


	@When("Je clique sur le bouton search")
	public void jeCliqueSurLeBoutonSearch() {
		seleniumUtils.click(ProductsPage.getBtnSearch());
	}
	
	@Then("Je verifie le produit {string}")
	public void jeVerifieLeProduit(String nomproduit) {
		 Assert.assertEquals(nomproduit ,ProductsPage.getNomProduct().getText());
	}
	
	/*Add Product*/
	@When("Je clique sur le bouton add new")
	public void jeCliqueSurLeBoutonAddNew() {
		seleniumUtils.click(ProductsPage.getBtnAddNew());
	}
	
	@When("Je saisie le nom de produit {string}")
	public void jeSaisieLeNomDeProduit(String nomproduit1) {
		seleniumUtils.writeText(ProductsPage.getNomProduit(),nomproduit1);
	}
	

	@When("Je saisie la date de debut {string}")
	public void jeSaisieDateDebutDispo(String AvailableStartDateTimeUtc ) {
		 
		seleniumUtils.click(ProductsPage.getAvailableStartDateTimeUtc());
		seleniumUtils.writeText(ProductsPage.getAvailableStartDateTimeUtc(), AvailableStartDateTimeUtc); 
		ProductsPage.getAvailableStartDateTimeUtc().sendKeys(Keys.RETURN);
	}
	 

	@When("je selectionne le prix de produit")
	public void jeSelectionneLePrixDeProduit() {
	     ProductsPage.getPrixProduit().click();
	     ProductsPage.getPrixProduit().sendKeys(Keys.ARROW_UP);
	    
	     for(int i = 0; i < 4; i++) {
	    	 ProductsPage.getPrixProduit().sendKeys(Keys.ARROW_UP);
	   
	    	}
	}
	
	
	// @Then("Je verifie le produit ajoute {String}")
	// public void jeVerifieLeProduit1(String string) {
	// }
	
	// @When("Je clique sur le bouton save")
	//	public void jeCliqueSurLeBoutonSave() {
		//	seleniumUtils.click(ProductsPage.getBtnSave());
	//}
	









}
