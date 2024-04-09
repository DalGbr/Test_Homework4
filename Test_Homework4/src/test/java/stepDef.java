import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class stepDef {

    WebDriver driverObj;

    @Given("User launches Chrome browser")
    public void launchBrowser() {

        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\webdriver\\chromedriver.exe");
        driverObj = new ChromeDriver();

    }

    @When("User opens registration form")
    public void openRegistrationForm() {

        driverObj.navigate().to("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

    }

    @Then("User enters first name")
    public void enterName() {

        driverObj.findElement(By.id("name")).sendKeys("Danil");

    }

    @Then("User enters e-mail address")
    public void enterEmail() {

        driverObj.findElement(By.id("email")).sendKeys("danil.gubar0@gmail.com");

    }

    @Then("User enters gender and birthday")
    public void enterBirthdayAndGender() {

        driverObj.findElement(By.id("gender")).click();
        driverObj.findElement(By.id("dob")).sendKeys("12022000");

    }

    @Then("User enters phone number")
    public void enterPhoneNumber() {

        driverObj.findElement(By.id("mobile")).sendKeys("123456789");

    }

    @Then("User enters subject, hobbies and where he lives")
    public void enterSubjectHobbiesLivingPlace() {

        driverObj.findElement(By.id("subjects")).sendKeys("IT");
        driverObj.findElement(By.id("hobbies")).click();
        driverObj.findElement(By.id("picture")).sendKeys(System.getProperty("user.dir") + "\\src\\test\\java\\butterfly.png");

        WebElement dropdown = driverObj.findElement(By.id("state"));
        Select select = new Select(dropdown);
        select.selectByValue("NCR");

        WebElement dropdown_2 = driverObj.findElement(By.id("city"));
        Select select_2 = new Select(dropdown_2);
        select_2.selectByValue("Meerut");
    }

}
