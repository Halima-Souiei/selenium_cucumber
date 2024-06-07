package com.e2eTests.automation.step_definitions;

import org.junit.Assert;

import com.e2eTests.automation.page_objects.LoginPage;
import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.SeleniumUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	public LoginPage loginPage;
	public ConfigFileReader configFileReader;
	public SeleniumUtils seleniumUtils;

	public LoginStepDefinition() {
		loginPage = new LoginPage(); 
		configFileReader = new ConfigFileReader();
		seleniumUtils = new SeleniumUtils();
	}

	@Given("Je visite le site nopcommerce")
	public void jeVisiteLeSiteNopcommerce() {
		seleniumUtils.get(configFileReader.getProperties("home.url"));

	}

	@When("Je saisis l'adresse mail {string}")
	public void jeSaisisLAdresseMail(String email) {
		LoginPage.getEmail().clear();
		LoginPage.getEmail().sendKeys(configFileReader.getProperties("home.login"));

	}

	@When("Je saisis le mot de passe {string}")
	public void jeSaisisLeMotDePasse(String password) {
		LoginPage.getPassword().clear();
		LoginPage.getPassword().sendKeys(password);

	}

	@When("Je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
		LoginPage.getBtnLogin().click();

	}

	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String text) {
		String titlePage = LoginPage.getTitlePage().getText();
		Assert.assertEquals(titlePage, text);
	}

}
