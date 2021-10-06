package com.assngProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegClass {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KRISH\\eclipse-workspace\\Selenium_Project\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		
		WebElement signin = driver.findElement(By.xpath("//a[normalize-space()='Sign in']"));
		signin.click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement regmailid = driver.findElement(By.xpath("//input[@id='email_create']"));
		regmailid.sendKeys("krk13oct@gmail.com");
		
		WebElement regbutn = driver.findElement(By.xpath("//span[normalize-space()='Create an account']"));
		regbutn.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement gender = driver.findElement(By.xpath("//input[@id='id_gender1']"));
		gender.click();
		
		WebElement fname = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
		fname.sendKeys("Krishna");
		
		WebElement lname = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
		lname.sendKeys("G");
		
		WebElement pswd = driver.findElement(By.xpath("//input[@id='passwd']"));
		pswd.sendKeys("password");
		
		WebElement date = driver.findElement(By.xpath("//select[@id='days']"));
		Select d1 = new Select(date);
		d1.selectByValue("13");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='months']"));
		Select m1 = new Select(month);
		m1.selectByValue("10");
		
		WebElement years = driver.findElement(By.xpath("//select[@id='years']"));
		Select y1 = new Select(years);
		y1.selectByValue("1995");
		
		WebElement company = driver.findElement(By.xpath("//input[@id='company']"));
		company.sendKeys("XYZ Solutions Pvt. Ltd.,");
		
		WebElement add1 = driver.findElement(By.xpath("//input[@id='address1']"));
		add1.sendKeys("Flat No.: 13, ZZZ Apartments");
		
		WebElement add2 = driver.findElement(By.xpath("//input[@id='address2']"));
		add2.sendKeys("ABC Street, Jjdhc");
		
		WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
		city.sendKeys("Yonkers");
		
		WebElement state = driver.findElement(By.xpath("//select[@id='id_state']"));
		Select s1 = new Select(state);
		s1.selectByValue("32");
		 
		WebElement postcode = driver.findElement(By.xpath("//input[@id='postcode']"));
		postcode.sendKeys("10470");
		
		WebElement country = driver.findElement(By.xpath("//select[@id='id_country']"));
		Select c1 = new Select(country);
		c1.selectByValue("21");
		
		WebElement mobno = driver.findElement(By.xpath("//input[@id='phone_mobile']"));
		mobno.sendKeys("7845023613");
		
		WebElement addrsref = driver.findElement(By.xpath("//input[@id='alias']"));
		addrsref.sendKeys("@nothing");
		
		WebElement regbtn = driver.findElement(By.xpath("//span[text()='Register']"));
		regbtn.click();
			
	}

}
