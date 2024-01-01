package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import drivermanager.DriverManager;
import hooks.FrameworkHook;

public class ScreenShot extends DriverManager{
	public static void takeScreenshotOnSuccess(String ssname) throws IOException {
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MMM-yyyy_hh-mm-ss");
		String dateTime1 = dateTime.format(format);
		System.out.println(dateTime1);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File
				("C:\\Users\\nseng\\git\\cucumberframework1\\CucumberFramework1\\OnSuccessScreenshot\\"+FrameworkHook.foldername+"\\"+dateTime1+"_"+ssname+".jpg");
		FileUtils.copyFile(src,destination);
		System.out.println("Screenshot taken");
		
	}
	public static void takeScreenshotOnFailure() throws IOException {
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MMM-yyyy_hh-mm-ss");
		String dateTime1 = dateTime.format(format);
		System.out.println(dateTime1);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File
				("C:\\Users\\nseng\\git\\cucumberframework1\\CucumberFramework1\\OnFailureScreenshot\\"+FrameworkHook.foldername+"\\"+dateTime1+"_"+"Failure"+".jpg");
		FileUtils.copyFile(src,destination);
		System.out.println("Screenshot taken");
		
	}
}

