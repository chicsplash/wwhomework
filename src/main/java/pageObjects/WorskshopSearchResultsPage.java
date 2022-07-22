package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WorskshopSearchResultsPage {

	public WebDriver driver;

	By firstResultName = By.className("linkUnderline-1_h4g");
	By firstResultDistance = By.className("distance-OhP63");
	By businessDays = By.className("dayName-CTNC6");

	public WorskshopSearchResultsPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFirstResultName() {
		return driver.findElement(firstResultName);
	}

	public WebElement getFirstResultDistance() {
		return driver.findElement(firstResultDistance);
	}

	public WebElement getDays() {
		return driver.findElement(businessDays);
	}

}
