package TestAutomation.W3schools.Demo.TestAutomation.W3schools.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssignmentThree {
	
	 @Test
	    public void assignmentThree() {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.google.com/");
	        Assert.assertTrue(driver.findElement(By.xpath("//img[@class=\"lnXdpd\"]")).isDisplayed());
	        Assert.assertTrue(driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]")).isDisplayed());
	        Assert.assertEquals(driver.findElement(By.xpath("//input[@value=\"Google Search\"]")).getAttribute("value"), "Google Search");
	        Assert.assertEquals(driver.findElement(By.xpath("//input[@value=\"I'm Feeling Lucky\"]")).getAttribute("value"), "I'm Feeling Lucky");
	        driver.quit();
	    }

}
