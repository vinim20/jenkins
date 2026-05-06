package testngdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestWithTestNGFramework {

    WebDriver driver;

    @BeforeClass
    public void testSetup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void openBrowser() throws Exception {
        driver.get("https://www.saucedemo.com/");
        System.out.println("We are currently on URL: " + driver.getCurrentUrl());
        Thread.sleep(2000);
    }

    @Test
    public void signUp() throws Exception {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);

        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);

        driver.findElement(By.id("login-button")).click();
        Thread.sleep(4000);

        System.out.println("Login Performed Successfully");
    }

    @AfterMethod
    public void postSignUp() {
        System.out.println("Current URL after Login: " + driver.getCurrentUrl());
    }

    @AfterClass
    public void closeBrowser() throws Exception {
        Thread.sleep(5000);
        driver.quit();
    }
}