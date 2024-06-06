package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShots {

	public static WebDriver screenShot(WebDriver driver, String filePath) {
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		
		try {
			
			FileUtils.copyFile(source, new File("C:\\Users\\shimu\\eclipse-workspace\\NopcommerceAutomation\\screenshots.jpg"));
		
		} catch (IOException e) {
			
			System.out.println(e.getMessage());
		}
		
		  return driver;
	
	}
	
}
