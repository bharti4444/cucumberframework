package utilities;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import drivermanager.DriverManager;

public class Utilities extends DriverManager{

	public void sendKeys(WebElement element,String str) {
		clickOnElement(element);
		element.clear();
		enterValueInTextBox(element, str);		
	}
	
	public static void colorChange(WebElement etr,  String color) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.backgroundColor='" + color + "'", etr);
		Thread.sleep(1000);
	}

	public static void flashing(WebElement etr) throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		String backGroundColor = etr.getCssValue("backgroundColor");

		System.out.println("BackGround Color of Element -->" + backGroundColor);

		for (int i = 0; i < 3; i++) {
			colorChange(etr,  "rgb(261,121,51)");
			colorChange(etr, backGroundColor);
		}
	}
	
	public static void borderCreation(WebElement etr) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='5px solid red'", etr);
	}
	
	
	public static void generateAlert( String message) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('" + message + "');");
	}

	public static void clickOnElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	public static void enterValueInTextBox(WebElement element, String UN) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='" + UN + "';", element);
	}

	public static void refreshPageJS() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go(0)");
	}
	public static void getURL() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		System.out.println("Title of page by one way-->" + js.executeScript("return document.URL;").toString());
		String title = (String) js.executeScript("return document.URL;");
		System.out.println("Title of page by other way-->" + title);
	}

	public static void getTitle() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		System.out.println("URL of page by one way-->" + js.executeScript("return document.title;").toString());
		String title = (String) js.executeScript("return document.title;");
		System.out.println("URL of page by other way-->" + title);
	}

	public static void retriveInnerTextOfPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		System.out.println("Inner Text of page by one way-->"
				+ js.executeScript("return document.documentElement.innerText;").toString());
		String title = (String) js.executeScript("return document.documentElement.innerText;");
		System.out.println("Inner Text of page by other way-->" + title);
	}

	
	public static void hideElement( WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.display='none';", element);
	}
	
	public static void hideElement( List<WebElement> element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;		
		for(WebElement ele:element) {
		js.executeScript("arguments[0].style.display='none';", ele);
		System.out.println("Mission Done");
		}
	}

	public static void modifyElement( WebElement element, String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].innerText = '" + value + "';", element);
	}
	public static void getElementInnerText( WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String innerText = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].textContent;", element);
		System.out.println("Inner Text of Element: "+innerText);
	}
	public static String retrieveValueOfElement( WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String value = (String) js.executeScript("return arguments[0].value;", element);
		System.out.println("Value from Element-->" + value);
		return value;
	}
	
	
	
	public static void scrollToHeight() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public static void scrollToElement( WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		System.out.println("Scrolled to element");
	}

	
}

	
	

