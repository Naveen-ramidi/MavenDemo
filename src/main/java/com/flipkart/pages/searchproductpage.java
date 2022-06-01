package com.flipkart.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class searchproductpage extends LoginPage {
By searchproduct = By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input");

public String validatesearchproductpage(String product) {
	wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div")));
	driver.findElement(searchproduct).sendKeys(product);
	driver.findElement(searchproduct).sendKeys(Keys.ENTER);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[1]/div/div/span")));
		System.out.println(driver.getTitle());
	String actResult = driver.getTitle();
	captureScreenshot("Products");
		actResult.equalsIgnoreCase("Mobiles- Buy Products Online at Best Price in India - All Categories | Flipkart.com");
		return actResult;
}
}
