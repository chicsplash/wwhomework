package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WorkshopSearchPage {

	public WebDriver driver;

	By inPersonOption = By.className("buttonText-3DCCO");
	By zipcodeSearch = By.id("location-search");
	By btbArrowSearch = By.className("rightArrow-daPRP");

	public WorkshopSearchPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement selectInPerson() {
		return driver.findElement(inPersonOption);
	}

	public WebElement searchByZipcode() {
		return driver.findElement(zipcodeSearch);
	}

	public WebElement searchButton() {
		return driver.findElement(btbArrowSearch);
	}

}
