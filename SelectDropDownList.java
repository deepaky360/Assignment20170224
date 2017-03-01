package Test;


import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectDropDownList {
public static void main(String[] args) throws InterruptedException{ 
System.setProperty("webdriver.firefox.marionette","E:\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("http://www.seleniumeasy.com/test/");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.findElement(By.cssSelector("a[id='btn_basic_example']")).click();
Thread.sleep(2000);
driver.findElement(By.cssSelector("a[class='list-group-item'][href*='select-dropdown-demo.html']")).click();
Thread.sleep(2000);
driver.findElement(By.cssSelector("select[id='select-demo']")).click();
driver.findElement(By.cssSelector("option[value='Sunday']")).click();
WebElement message= driver.findElement(By.cssSelector("p[class='selected-value']"));
String value=message.getText();
Assert.assertEquals("Day selected :- Sunday", value);
System.out.println(value);
Thread.sleep(2000);
driver.findElement(By.cssSelector("option[value='California']")).click();
driver.findElement(By.cssSelector("button[id='printMe']")).click();
WebElement message1= driver.findElement(By.cssSelector("p[class='getall-selected']"));
String value1=message1.getText();
Assert.assertEquals("First selected option is : California", value1);
System.out.println(value1);

}
}
