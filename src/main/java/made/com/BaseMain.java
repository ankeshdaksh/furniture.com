package made.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by kailash on 09/11/2016.
 */
public class BaseMain {
    public static WebDriver driver;

    public void setUP() throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\kailash\\IdeaProjects\\made\\src\\test\\resources\\Congi.properties");
        properties.load(fileInputStream);

        String url = properties.getProperty("url");
        String browser = properties.getProperty("browser");

        if(browser.matches("chrome")){
            driver = new ChromeDriver();
        }
        else if (browser.matches("Firefox")){
            driver = new FirefoxDriver();
        }
        else if (browser.matches("Sagari")){
            driver = new SafariDriver();
        }

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        driver.findElement(By.cssSelector(".closebutton")).click();

    }
    public void tearDown(){
       driver.quit();

    }


    }


