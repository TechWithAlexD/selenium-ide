// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class Suite1Test {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\A100\\AppData\\Roaming\\npm\\node_modules\\geckodriver\\geckodriver.exe");
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        driver = new FirefoxDriver(options);
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void t1() {
        driver.get("https://www.selenium.dev/selenium-ide/");
        driver.manage().window().setSize(new Dimension(1536, 864));
        driver.findElement(By.linkText("Docs")).click();
        assertThat(driver.getTitle(), is("Getting Started · Selenium IDE"));
        //driver.close();
    }
    @Test
    public void t2() {
        driver.get("https://www.selenium.dev/");
        driver.manage().window().setSize(new Dimension(1536, 864));
        driver.findElement(By.cssSelector(".selenium-ide > .pl-3")).click();
        driver.findElement(By.linkText("Help")).click();
        driver.findElement(By.cssSelector(".docMainWrapper")).click();
        assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Need help?"));
        //driver.close();
    }
}