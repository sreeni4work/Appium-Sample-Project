package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	protected AppiumDriver driver;
	DesiredCapabilities caps;

	
	public void setCapabilities() throws MalformedURLException {

		caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0.2");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "POCO X2");
		caps.setCapability(MobileCapabilityType.UDID, "c46f18a4");
		//caps.setCapability("appPackage", "com.xiaomi.calendar");
		//caps.setCapability("appActivity", "com.miui.calendar.detail.SubscribeGroupActivity");
		caps.setCapability("appPackage", "com.miui.calculator");
		caps.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		try {
			driver = new AppiumDriver<MobileElement>(url, caps);	
			System.out.println("Calnder App Connected Successfully");
		}catch(Exception e){
			System.out.println("Cause is:" + e.getCause());
			System.out.println("Message is:"+e.getMessage());
			e.printStackTrace();

		}	
		
		
		
	}
	
	public void extendReportSetUp() {	
		// start reporters
	    ExtentSparkReporter htmlReporter = new ExtentSparkReporter("additionTestCase.html");

	    // create ExtentReports and attach reporter(s)
	    ExtentReports extent = new ExtentReports();
	    extent.attachReporter(htmlReporter);
	}


	
}

