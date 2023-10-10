package com.qa.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class ShoppingCart {	
	EdgeDriver driver;
	
	By shoppingCartBtn = By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[6]/div/div/a/span");	
	By shoppingCartName = By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[1]/div/div/a[1]");
	
	public ShoppingCart(EdgeDriver driver) {
		this.driver = driver;
	}
	
	public void openShoppingCart() {
		driver.findElement(shoppingCartBtn).click();
	}
	
	public String getShoppingCartName() {
		return driver.findElement(shoppingCartName).getText();
	}
}
