package step_definitions;

import java.time.Duration;
import java.util.Base64;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	public static WebDriver driver;
	
	private ExtentReports extent;
	private ExtentTest test;
	
	@Before
	public void openBrowser() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.nopcommerce.com/");
		driver.navigate().refresh();
		
		ExtentSparkReporter reporter = new ExtentSparkReporter("extent.html");
		extent = new ExtentReports();
        extent.attachReporter(reporter);
        //create a new test
        test = extent.createTest("NopCommerce");
			
	}
	
	@After
	public void closeBrowser(Scenario scenario) {
		
		 if (scenario.isFailed()) {
	           //Take the screenshot
	            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	            //Add it to the report
	            test.addScreenCaptureFromPath("data:image/png;base64," + Base64.getEncoder().encodeToString(screenshot));
	        } else {
	            //Take the screenshot
	            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	            //Add it to the report
	            test.addScreenCaptureFromPath("data:image/png;base64," + Base64.getEncoder().encodeToString(screenshot));
	            test.pass("Test passed");
	        }
	        extent.flush();
	        driver.quit();
		
	}
	
}
