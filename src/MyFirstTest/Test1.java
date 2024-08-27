package MyFirstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	
	WebDriver driver = new ChromeDriver(); 
	
@BeforeTest
public void mySetup() {
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	
} 

@Test
public void test1() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("nour qawouq on linkedin");
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
    driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/span/a/h3/span")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@id=\"base-contextual-sign-in-modal\"]/div/section/div/div/div/div[1]/button")).click();
    driver.navigate().back();

}
	
}
