package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;

public class ProductsPage extends BasePage {

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[1]/a/p")
	private static WebElement btnMenu;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[2]/a")
	private static WebElement btnCatalog;
	
	@FindBy(how = How.XPATH , using = "/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[2]/ul/li[1]/a")
	private static WebElement btnProduct ;
	
	@FindBy(how = How.ID , using = "SearchProductName")
	private static WebElement  nomproduit;
	

	@FindBy(how = How.XPATH, using = "//*[@id=\"SearchCategoryId\"]")
	private static WebElement btnProductCategory;
	
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"search-products\"]")
	private static WebElement  btnSearch;
	
	@FindBy(how = How.XPATH , using = "/html/body/div[3]/div[1]/form[1]/div/div/a")
	private static WebElement  btnAddNew;
	
	@FindBy(how = How.ID , using = "AvailableStartDateTimeUtc")
	private static WebElement AvailableStartDateTimeUtc;

	
	@FindBy(how = How.XPATH , using = "/html/body/div[3]/div[1]/form/section/div/div/nop-cards/nop-card[1]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/input")
	private static WebElement  nomproduit1;
	
	@FindBy(how = How.XPATH , using ="/html/body/div[3]/div[1]/form/div[1]/div/button[1]")
	private static WebElement  btnSave;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/form/section/div/div/nop-cards/nop-card[1]/div/div[2]/div[21]/div[2]/input[1]")
	private static WebElement  dateDebut;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"Price\"]")
	private static WebElement  prixProduit;
	 
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[1]/form/section/div/div/nop-cards/nop-card[1]/div/div[2]/div[21]/div[2]/input[1]")
	private static WebElement  heureDebut;

	
	public ProductsPage() {

		super(Setup.getDriver());

	}

	public static WebElement getBtnMenu() {
		return btnMenu;
	}
	
	public static WebElement getBtnCatalog() {
		return btnCatalog;
	}
	
	public static WebElement getBtnProduct() {
		return btnProduct;
	}
	public static WebElement getNomProduct() {
		return nomproduit;
	}
	public static WebElement getBtnProductCategory() {
		return btnProductCategory;
	}
	
	public static WebElement getBtnSearch() {
		return btnSearch;
	}
	public static WebElement getBtnAddNew() {
		return btnAddNew;
	}
	public static WebElement getAvailableStartDateTimeUtc() {
		return AvailableStartDateTimeUtc;
	}
	public static WebElement getPrixProduit() {
		return prixProduit;
	}
	
	public static WebElement getNomProduit() {
		return nomproduit1;
	}
	public static WebElement getDateDebut() {
		return dateDebut;
	}
	public static WebElement getHeureDebut() {
		return heureDebut;
	}
	
	public static WebElement getBtnSave() {
		return btnSave;
	}
	
	
}
