package Test;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxDemo {
public static void main(String[] args) throws InterruptedException{ 
System.setProperty("webdriver.firefox.marionette","E:\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("http://www.seleniumeasy.com/test/");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.findElement(By.cssSelector("a[id='btn_basic_example']")).click();
Thread.sleep(2000);
driver.findElement(By.cssSelector("a[class='list-group-item'][href*='checkbox-demo.html']")).click();
boolean checked = driver.findElement(By.cssSelector("input[id='isAgeSelected']")).isSelected();
Assert.assertFalse(checked);
Thread.sleep(2000);
driver.findElement(By.cssSelector("input[id='isAgeSelected']")).click();
boolean checked1 = driver.findElement(By.cssSelector("input[id='isAgeSelected']")).isSelected();
Assert.assertTrue(checked1);
driver.findElement(By.cssSelector("input[id='check1']")).click();
Thread.sleep(2000);
WebElement message= driver.findElement(By.cssSelector("input[id='check1']"));
Thread.sleep(2000);
String mess= message.getAttribute("value");
Assert.assertEquals("Uncheck All", mess);
}

}
