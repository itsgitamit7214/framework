package Hooks;

import Utility.ConfigReader;
import driverFactory.Drivermanager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class HooksClass {

    private Drivermanager drivermanager;
    private WebDriver driver;
    private ConfigReader configReader;
    Properties prop;

    @Before(order = 0)
    public void getProperty(){
        configReader = new ConfigReader();
        prop = configReader.init_prop();
    }
    @Before (order = 1)
    public void launchBrowser(){
        String browserName = prop.getProperty("browser");
        drivermanager = new Drivermanager();
       driver =  drivermanager.init_driver(browserName);

    }
//    @After(order = 0)
//    public void quitBrowser(){
//        driver.quit();
//    }



    @After(order = 1)
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            // take screenshot method
            String screenshotName = scenario.getName().replaceAll(" ","_");
            byte [] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

            scenario.attach(sourcePath,"image/png",screenshotName);
        }

    }
}
