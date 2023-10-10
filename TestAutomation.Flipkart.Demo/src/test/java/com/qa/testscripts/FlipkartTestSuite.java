package com.qa.testscripts;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartTestSuite {
	Search search;
	Product product;	
	ShoppingCart shoppingCart;
	
   EdgeDriver driver;

	@BeforeSuite
	public void initializeDriver() {
		WebDriverManager.edgedriver().setup();		
		driver = new EdgeDriver();
		driver.get ("https://www.flipkart.com/");
		driver.manage().window().maximize();
		search = new Search(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}	

	@Test(priority=1)
	public void loginPopupClose() throws InterruptedException {		
		search.closeLoginPopup();		
	}

	@Test(priority=2)
	public void productSearch() throws InterruptedException {		
		search.searchProduct("Macbook air m2");
	}

	@Test(priority=3)
	public void firstNameLabelTest() throws InterruptedException {		
		search.openFirstSearchResult();
	}		

	@Test(priority=4)
	public void swithToProductTab() throws InterruptedException {
		String originalWindow = driver.getWindowHandle();		
		for (String windowHandle : driver.getWindowHandles()) {
			if(!originalWindow.contentEquals(windowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}
		product = new Product(driver);
		shoppingCart = new ShoppingCart(driver);
	}
	
	@Test(priority=5)
	public void addToShoppingCartTest() throws InterruptedException {
		Thread.sleep(1000);
		product.addToShoppingCart();		
	}
	
	@Test(priority=6)
	public void shoppingCartButtonTest() throws InterruptedException {
		Thread.sleep(1000);
		shoppingCart.openShoppingCart();		
	}

	@Test(priority=7)
	public void shoppingCartAddedTest() throws InterruptedException {
		Thread.sleep(1000);
		assertEquals(shoppingCart.getShoppingCartName(), "Flipkart (1)","Product failed to added to Shopping Cart");
	}		
	
	@AfterSuite 
	public void closeDriver() {
		driver.quit();
	}
}
