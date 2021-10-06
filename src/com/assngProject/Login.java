package com.assngProject;

import java.io.*;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Login {
	
//	public void justWait(int sec) {
//		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
//
//	}
	
public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KRISH\\eclipse-workspace\\Selenium_Project\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		
		Login obj = new Login();
		
//		obj.justWait(60);
		
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
		WebElement signin = driver.findElement(By.xpath("//a[normalize-space()='Sign in']"));
		signin.click();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement email = driver.findElement(By.xpath("//input[@id = 'email']"));
		email.sendKeys("krk13oct@gmail.com");
		
		
		WebElement pswd = driver.findElement(By.xpath("//input[@id = 'passwd']"));
		pswd.sendKeys("password");
		
		WebElement login = driver.findElement(By.xpath("//span[normalize-space() = 'Sign in']"));
		login.click();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		Actions act =new Actions(driver);
		
		WebElement dressopt = driver.findElement(By.xpath("(//a[@title = 'Dresses'])[2]"));
		act.moveToElement(dressopt).perform();
		
		WebElement evngdress = driver.findElement(By.xpath("(//a[@title = 'Evening Dresses'])[2]"));
		act.click(evngdress).perform();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement ovrimg = driver.findElement(By.xpath("(//img[@class = 'replace-2x img-responsive'])[2]"));
		act.moveToElement(ovrimg).perform();
		
		WebElement quckvw = driver.findElement(By.xpath("//span[text()='Quick view']"));
		act.click(quckvw).perform();
		
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		
		WebElement frm = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		
		driver.switchTo().frame(frm);
		
		WebElement itmpls = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		
		for (int i = 0; i < 9; i++) {
			itmpls.click();
		}
		
		WebElement drssz = driver.findElement(By.xpath("//select[@class='form-control attribute_select no-print']"));
		Select sz1 = new Select(drssz);
		sz1.selectByValue("2");
		
		WebElement drsclr = driver.findElement(By.xpath("//a[@name='Pink']"));
		drsclr.click();
		
		WebElement add2cart = driver.findElement(By.xpath("(//span[normalize-space()='Add to cart'])"));
		add2cart.click();
		
		
		Thread.sleep(10000);
//		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
		driver.switchTo().defaultContent();
		
		WebElement checkout = driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']"));
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File img1src= ts.getScreenshotAs(OutputType.FILE);
		
		File img1dst = new File("C:\\Users\\KRISH\\eclipse-workspace\\Selenium_Project\\Screenshots\\Images1.png");
		FileUtils.copyFile(img1src, img1dst);
		
		System.out.println("done");
		
		checkout.click();
		
		
		
	}

}
