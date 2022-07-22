package homework;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import pageObjects.StudioDetailsPage;
import pageObjects.WorkshopSearchPage;
import pageObjects.WorskshopSearchResultsPage;

import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class End2End {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new SafariDriver();
		driver.navigate().to("https://www.weightwatchers.com/us/find-a-workshop/");

		Assert.assertEquals("Find WW Studios & Meetings Near You | WW USA", driver.getTitle().trim());

		WorkshopSearchPage ws = new WorkshopSearchPage(driver);
		ws.selectInPerson().click();
		ws.searchByZipcode().sendKeys("10011");
		ws.searchButton().click();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WorskshopSearchResultsPage sr = new WorskshopSearchResultsPage(driver);
		String firstResultName = sr.getFirstResultName().getText();
		String firstResultDistance = sr.getFirstResultDistance().getText();
		System.out.println(firstResultName + " " + firstResultDistance+"\n");

		sr.getFirstResultName().click();

		StudioDetailsPage sd = new StudioDetailsPage(driver);

		Thread.sleep(500);

		Assert.assertEquals(firstResultName, sd.getStudioName().getText());

		sd.getBusinessHours().click();
		sd.printBusinessHours();

		driver.quit();
	}

}
