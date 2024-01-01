package hooks;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import configmanager.ConfigReader;
import drivermanager.DriverManager;

import io.cucumber.java.*;
import screenshot.ScreenShot;


public class FrameworkHook {
	public String browser;
	public String url;
	public static String foldername;
	public static Properties prop;


	@Before
	public void setUpConfigFile(Scenario sc) {
		System.out.println("Before Hooks Started");
		System.out.println("Get ID: "+sc.getId());
		System.out.println("Get Line: "+sc.getLine());
		System.out.println("Get Name: "+sc.getName());
		//System.out.println("Get Source Tag Names: "+sc.getSourceTagNames());
		System.out.println("Get Status: "+sc.getStatus());
		System.out.println("Get URI: "+sc.getUri());
		System.out.println("Get isFailed: "+sc.isFailed());
		ConfigReader cr= new ConfigReader();
        prop=cr.loadPropertyFile();		
		foldername=sc.getName();
		browser=prop.getProperty("Browser");
		url=prop.getProperty("URL");		
		DriverManager.launchBrowser(browser, url);
		System.out.println("Before Hooks Ended");

	}
	
	@After
	public void dismantleDriver(Scenario sc) throws IOException  {
		System.out.println("After Hooks Started");

		if(sc.isFailed()) {
			System.out.println(sc.getStatus());
			System.out.println("Scenario is Failed");
			ScreenShot.takeScreenshotOnFailure();
			String screenshotName = sc.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
			sc.attach(sourcePath, "image/png", screenshotName);
			} else {
			
			System.out.println(sc.getStatus());
			System.out.println("Scenario is passed");
		}
		System.out.println("After Hooks Ended");
		DriverManager.quitDriver();

	}
	


}
