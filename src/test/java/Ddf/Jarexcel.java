package Ddf;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Jarexcel {
    String [][] data= null;
    @DataProvider(name="loginData")
    public String[][] loginDataProvider(){

        return data;
    }
    public void getExcelData() throws IOException, BiffException {
        //to read file
        FileInputStream excel = new FileInputStream("C:\\Users\\91861\\Downloads\\Book 3.xlsx");
        // to select workbook
        Workbook workbook = Workbook.getWorkbook(excel);
        //to get sheet
        // you can use zero or sheel 1 (name or index)
        Sheet sheet = workbook.getSheet(0);
       int rowCount = sheet.getRows();
        int columnCount = sheet.getColumns();


       String testData[][]= new String[rowCount-1][columnCount];

       for (int i=1; i<rowCount;i++){
           for(int j=0;j<columnCount;j++){
             testData[i-1][j]=  sheet.getCell(j,i).getContents();

           }

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
}


}
