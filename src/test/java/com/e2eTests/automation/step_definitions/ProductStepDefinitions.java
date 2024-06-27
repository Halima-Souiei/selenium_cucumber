package com.e2eTests.automation.step_definitions;



import com.e2eTests.automation.page_objects.ProductsPage;
import com.e2eTests.automation.page_objects.LoginPage;
import com.e2eTests.automation.utils.SeleniumUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductStepDefinitions {

	public LoginPage loginPage;
	public SeleniumUtils seleniumUtils;
	public ProductsPage dashbordPage;

	public ProductStepDefinitions() {

		loginPage = new LoginPage();
		seleniumUtils = new SeleniumUtils();
		dashbordPage = new ProductsPage();
	}

	@When("Je clique sur le bouton catalog")
	public void jeCliqueSurLeBoutonCatalog() throws InterruptedException {

		Thread.sleep(3000);
		seleniumUtils.click(ProductsPage.getBtnCatalog());
		
	}

	@When("Je clique sur le bouton products")
	public void jeCliqueSurLeBoutonProducts() throws InterruptedException {
		seleniumUtils.click(ProductsPage.getBtnProduct());
	}

	@When("Je saisis le nom du produit {string}")
	public void jeSaisisLeNomDuProduit(String nomproduit) {
		seleniumUtils.writeText(ProductsPage.getNomProduct(),nomproduit);  

	}

	@When("Je saisis la categorie")
	public void jeSaisisLaCategorie() {

	}

	@When("Je clique sur le bouton search")
	public void jeCliqueSurLeBoutonSearch() {
		seleniumUtils.click(ProductsPage.getBtnSearch());
	}
	
	@Then("Je verifie le produit {string}")
	public void jeVerifieLeProduit(String string) {
	}
	
	/*Add Product*/
	@When("Je clique sur le bouton add new")
	public void jeCliqueSurLeBoutonAddNew() {
		seleniumUtils.click(ProductsPage.getBtnAddNew());
	}










}
