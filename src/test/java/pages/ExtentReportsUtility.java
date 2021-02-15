package pages;

import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class ExtentReportsUtility {
	
public void extendReportSetUp() {	
	// start reporters
    ExtentSparkReporter htmlReporter = new ExtentSparkReporter("additionTestCase.html");

    // create ExtentReports and attach reporter(s)
    ExtentReports extent = new ExtentReports();
    extent.attachReporter(htmlReporter);
}
    
    
    
}
	

