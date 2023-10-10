package com.qa.testscripts;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Product {	
	EdgeDriver driver;
	
	By addToShoppingCartBtn = By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button");
	
	public Product(EdgeDriver driver) {
		this.driver = driver;
	}
	
	public void addToShoppingCart() {
		driver.findElement(addToShoppingCartBtn).click();
	}
}
