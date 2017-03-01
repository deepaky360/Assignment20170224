package Test;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonDemo {
public static void main(String[] args) throws InterruptedException{ 
System.setProperty("webdriver.firefox.marionette","E:\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("http://www.seleniumeasy.com/test/");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.findElement(By.cssSelector("a[id='btn_basic_example']")).click();
Thread.sleep(2000);
driver.findElement(By.cssSelector("a[class='list-group-item'][href*='radiobutton-demo.html']")).click();
Thread.sleep(2000);
driver.findElement(By.cssSelector("input[name='optradio'][value='Male']")).click();
driver.findElement(By.cssSelector("button[id='buttoncheck']")).click();
WebElement message= driver.findElement(By.cssSelector("p[class='radiobutton']"));
String value=message.getText();
Assert.assertEquals("Radio button 'Male' is checked", value);
driver.findElement(By.cssSelector("input[name='gender'][value='Male']")).click();
driver.findElement(By.cssSelector("input[name='ageGroup'][value='0 - 5']")).click();
driver.findElement(By.cssSelector("button[class='btn btn-default'][onclick='getValues();']")).click();
WebElement message1= driver.findElement(By.cssSelector("p[class='groupradiobutton']"));
String value1=message1.getText();

}
}
