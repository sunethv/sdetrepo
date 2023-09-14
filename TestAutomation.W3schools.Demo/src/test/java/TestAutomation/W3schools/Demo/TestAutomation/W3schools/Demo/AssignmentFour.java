package TestAutomation.W3schools.Demo.TestAutomation.W3schools.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssignmentFour {
	@Test
    public void assignmentThree() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]")).sendKeys("W3chools");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"Alh6id\"]/div[1]/div/ul/li[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.w3schools.com/");
        driver.quit();

}
}
