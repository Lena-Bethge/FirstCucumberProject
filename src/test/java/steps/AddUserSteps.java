package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AddUserSteps {

    WebDriver driver;

    @Given("Navigate to HomePage1")
    public void navigateToLoginPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://contacts-app.tobbymarshall815.vercel.app");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("Click on Login tab1")
    public void clickOnLoginTab1() {
        click(By.xpath("//a[.='LOGIN']"));
    }

    @Then("Appear Login Registration form1")
    public void loginRegistrationForm1() {
        pause1(2000);
        Assert.assertTrue(isElementPresent(By.cssSelector(".login_login__3EHKB")));
    }

    @And("Enter Valid data1")
    public void enterData() {
        type(By.cssSelector("[placeholder='Email']"),"kan@gmail.com");
        type(By.cssSelector("[placeholder='Password']"),"Kan-12345");
    }

    @And("Click on Login button1")
    public void clickLoginButton() {
        click(By.xpath("//button[.=' Login']"));
    }

    @And("Click on Add tab")
    public void clickOnAddTab() {
        click(By.xpath("//a[.='ADD']"));
    }

    @And("Appear AddUser form")
    public void addUserForm() {
        type(By.cssSelector("[placeholder='Name']"),"Lusy");
        type(By.cssSelector("[placeholder='Last Name']"),"Lee");
        type(By.cssSelector("[placeholder='Phone']"),"1234567890");
        type(By.cssSelector("[placeholder='email']"),"kan+1@gmail.com");
        type(By.cssSelector("[placeholder='Address']"),"Berlin");
        type(By.cssSelector("[placeholder='description']"),"goalkeeper");
    }

    @Then("Click on Save button")
    public void clickSaveButton() {
        click(By.xpath("//button[.='Save']"));
    }



    private void type(By locator, String text) {
        if (text != null) {
            click(locator);
            driver.findElement(locator).clear();
            driver.findElement(locator).sendKeys(text);
        }
    }

    private boolean isElementPresent(By locator) {
        return driver.findElements(locator).size()>0;
    }

    private void click(By locator) {
        driver.findElement(locator).click();
    }

    public void pause1(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
