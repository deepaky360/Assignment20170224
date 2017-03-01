package Test;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test28Feb {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.firefox.marionette","E:\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
    driver.get("http://www.seleniumeasy.com/test/");
    driver.findElement(By.cssSelector("a[id='btn_basic_example']")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("a[class='list-group-item'][href*='first-form-demo.html']")).click();
    driver.findElement(By.cssSelector("input[id='user-message']")).sendKeys("test");
    driver.findElement(By.cssSelector("button[class='btn btn-default']")).click();
    WebElement message= driver.findElement(By.cssSelector("span[id='display']"));
    String mess= message.getText();
    Assert.assertEquals("test", mess);
    System.out.println(mess);
    driver.findElement(By.cssSelector("input[id='sum1']")).sendKeys("100");
    driver.findElement(By.cssSelector("input[id='sum2']")).sendKeys("100");
    driver.findElement(By.cssSelector("button[class='btn btn-default']")).click();
    WebElement message1= driver.findElement(By.cssSelector("span[id='displayvalue']"));
    String value= message1.getText();
    Assert.assertEquals("200",value);
    System.out.println(value);
	}

}
