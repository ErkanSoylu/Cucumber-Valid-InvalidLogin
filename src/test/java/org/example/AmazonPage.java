package org.example;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AmazonPage {
    static WebDriver driver;
    public static WebElement findElement(By by) {
        return driver.findElement(by);
    }
    public static void ClickElement(By by) {
        findElement(by).click();
    }
    public static void sendKeys(By by , String text) {
        findElement(by).sendKeys(text);
    }
    @Given("^I am a user of amazon.com$") public void givenPage() throws Throwable{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\testinium\\Desktop\\Erkan\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com");
        driver.manage().window().maximize();
        System.out.println("Browser Başarıyla Açıldı.");
        Thread.sleep(5000);
    }
    @When("^I log in using valid credentials$") public void whenPage() throws Throwable {
        ClickElement(By.id("nav-link-accountList"));
        sendKeys(By.id("ap_email"),"erkansoylutestinium@gmail.com");
        ClickElement(By.id("continue"));
        Thread.sleep(2000);
        sendKeys(By.id("ap_password"),"123456");
    }
    @When("^I log in using invalid credentials$") public void whenFalsePage() throws Throwable {
        ClickElement(By.id("nav-link-accountList"));
        sendKeys(By.id("ap_email"),"erkansoylutestinium@gmail.com");
        ClickElement(By.id("continue"));
        Thread.sleep(2000);
        sendKeys(By.id("ap_password"),"123466");
    }
    @Then("^I should be logged in$") public void thenPage() throws Throwable {
        ClickElement(By.id("signInSubmit"));
        System.out.println("Successfully Logined.");
        driver.quit();
    }
    @Then("^I should not be logged in$") public void thenInvalidPage() throws Throwable {
        ClickElement(By.id("signInSubmit"));
        System.out.println("Successfully Logined.");
        driver.quit();
    }
}
