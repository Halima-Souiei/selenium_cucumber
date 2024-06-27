package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;

public class ProductsPage extends BasePage {

	@FindBy(how = How.ID, using = "nopSideBarPusher")
	private static WebElement btnMenu;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[2]/a")
	private static WebElement btnCatalog;
	
	@FindBy(how = How.XPATH , using = "//p[normalize-space()='Products']")
	private static WebElement btnProduct ;
	
	@FindBy(how = How.ID , using = "SearchProductName")
	private static WebElement  nomproduit;
	
	@FindBy(how = How.ID , using = "search-products")
	private static WebElement  btnSearch;
	
	@FindBy(how = How.XPATH , using = "/html/body/div[3]/div[1]/form[1]/div/div/a")
	private static WebElement  btnAddNew;




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
	public static WebElement getBtnSearch() {
		return btnSearch;
	}
	public static WebElement getBtnAddNew() {
		return btnAddNew;
	}
	
}
