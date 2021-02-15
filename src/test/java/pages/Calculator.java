package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import tests.BaseClass;

public class Calculator extends BaseClass{
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
	WebElement minus = null;	
	WebElement multiply = null; 
	WebElement devideBy = null;
	WebElement percent = null; 
	WebElement equalto = null;
	WebElement result = null;

	public void btnExit() {

		driver.findElement(By.id("android:id/button1")).click();;
		
	}
	

	public void Warning() {

		driver.findElement(By.id("android:id/button1"));
	}
	
	public WebElement btnOne() {

		return driver.findElement(By.id("com.miui.calculator:id/btn_1_s"));
	}

	public WebElement btnTwo() {

		return driver.findElement(By.id("com.miui.calculator:id/btn_2_s"));
	}

	public WebElement btnThree() {

		return driver.findElement(By.id("com.miui.calculator:id/btn_3_s"));
	}

	public WebElement btnFour() {

		return driver.findElement(By.id("com.miui.calculator:id/btn_4_s"));
	}

	public WebElement btnFive() {

		return driver.findElement(By.id("com.miui.calculator:id/btn_5_s"));
	}

	public WebElement btnSix() {

		return driver.findElement(By.id("com.miui.calculator:id/btn_6_s"));
	}

	public WebElement btnSeven() {

		return driver.findElement(By.id("com.miui.calculator:id/btn_7_s"));
	}

	public WebElement btnEight() {

		return driver.findElement(By.id("com.miui.calculator:id/btn_8_s"));
	}

	public WebElement btnNine() {

		return driver.findElement(By.id("com.miui.calculator:id/btn_9_s"));
	}

	public WebElement btnZero() {

		return driver.findElement(By.id("com.miui.calculator:id/btn_0_s"));		
	}

	public WebElement btnPlus() {

		return driver.findElement(By.id("com.miui.calculator:id/btn_plus_s"));		
	}

	public WebElement btnMinus() {

		return driver.findElement(By.id("com.miui.calculator:id/btn_minus_s"));		
	}

	public WebElement btnMultiply() {

		return driver.findElement(By.id("com.miui.calculator:id/btn_mul_s"));		
	}

	public WebElement btnDivide() {

		return driver.findElement(By.id("com.miui.calculator:id/btn_div_s"));		
	}

	public WebElement btnPercent() {

		return driver.findElement(By.id("com.miui.calculator:id/btn_percent_s"));		
	}





	public void Addition() {

		btnFive().click();
		btnThree().click();		
		try {
			result 	= driver.findElement(By.id("com.miui.calculator:id/result"));
		}catch(Exception inpspectException) {
			System.out.println("Element Inspector result Cause is: "+inpspectException.getCause());
			System.out.println("Element Inpector result Error Message is: "+inpspectException.getMessage());
			inpspectException.printStackTrace();
		}

		String addresult = result.getText();
		System.out.println("Addition result is: "+ addresult);		

	}




}
