package tests;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import pages.Calculator;
import pages.ExtentReportsUtility;

public class Addition extends BaseClass {
	
	WebElement exit = null;
	WebElement one = null;
	WebElement two = null;
	WebElement three = null;
	WebElement four = null;
	WebElement five = null;
	WebElement six = null;
	WebElement seven = null;
	WebElement eight = null;
	WebElement nine = null;
	WebElement ten = null;
	WebElement plus = null; 
	WebElement result = null; 
	WebElement equalto = null;
	
	@BeforeTest
	public void setUP() {
		try {
			setCapabilities();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	@Test
	public void additionTestCase() throws InterruptedException {
		
		
		// start reporters
	    ExtentSparkReporter htmlReporter = new ExtentSparkReporter("additionTestCase.html");

	    // create ExtentReports and attach reporter(s)
	    ExtentReports extent = new ExtentReports();
	    extent.attachReporter(htmlReporter);
	    
	    ExtentTest test = extent.createTest("AdditionTest", "Calculator Appliction");
	    
	    test.log(Status.INFO, "This step shows usage of log(status, details)");
		
	    test.info("Addition testcase execution started");
	    try {
		exit = driver.findElement(By.id("android:id/button1"));
		exit.click();
		Thread.sleep(2000);
		one = driver.findElement(By.id("com.miui.calculator:id/btn_1_s"));		
		Thread.sleep(2000);
		plus = driver.findElement(By.id("com.miui.calculator:id/btn_plus_s"));
		Thread.sleep(2000);
		three = driver.findElement(By.id("com.miui.calculator:id/btn_3_s"));
		Thread.sleep(2000);
		equalto = driver.findElement(By.id("com.miui.calculator:id/btn_equal_s"));
		Thread.sleep(2000);
	    }catch(Exception e) {
			
		// log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
	    }
		one.click();
		Thread.sleep(2000);
		plus.click();
		Thread.sleep(2000);
		three.click();
		Thread.sleep(2000);
		equalto.click();
		Thread.sleep(2000);
		
		
		
		try {
			result 	= driver.findElement(By.id("com.miui.calculator:id/result"));
			 test.log(Status.PASS, "Addition testcase passed");
		}catch(Exception inpspectException) {
			System.out.println("Element Inspector result Cause is: "+inpspectException.getCause());
			System.out.println("Element Inpector result Error Message is: "+inpspectException.getMessage());
			inpspectException.printStackTrace();
			// log with snapshot
			test.log(Status.FAIL, "Addtion Testcse failed");
	        
	        
	        // test with snapshot
	        test.addScreenCaptureFromPath("screenshot.png");
			
		}
		
	}
	
	@AfterTest
	public void tearDown() {
		System.out.println("Addition Textcase exceution Completed");
	}
	
	
	

}
