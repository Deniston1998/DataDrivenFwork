package Ddf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LogIn {


  /* String [][] data= {
        {"Admin1","admin"},
        {"Admifn1","adgmin"},
        {"Admin1","admihn"},
        {"Admvin1","admin"}
    };
    @DataProvider(name="loginData")
    public String[][] loginDataProvider(){

        return data;
    }



    @Test(dataProvider = "loginData")
       public void logindf(String uName, String Pword) {
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys(uName);
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys(Pword);
        WebElement loginBtn = driver.findElement(By.id("btnLogin"));
        loginBtn.click();
        driver.quit();


    }
}*/