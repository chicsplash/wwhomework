package pageObjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StudioDetailsPage {

	public WebDriver driver;

	By studioName = By.className("locationName-1jro_");
	By businessHours = By.className("title-3o8Pv");

	public StudioDetailsPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getStudioName() {
		return driver.findElement(studioName);
	}

	public WebElement getBusinessHours() {
		return driver.findElement(businessHours);
	}
	
	public void printBusinessHours() {
		List<WebElement> days = driver.findElements(By.className("day-CZkDC"));
		for (WebElement element : days) {

			System.out.println(element.getText().replace("y", "y "));

		}
	}
}
