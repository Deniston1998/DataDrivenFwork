package loginTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CorrectUserName {
    @Test
    @Parameters({"username","password"})
public void loginwithcorrectusername(String uName,String pword){
 System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys(uName);
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys(pword);
        WebElement loginBtn = driver.findElement(By.id("btnLogin"));
        loginBtn.click();




}}
