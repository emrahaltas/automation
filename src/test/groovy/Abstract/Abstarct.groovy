
package Abstract

import Login.Function.GirisBasarili
import org.apache.commons.io.FileUtils
import org.apache.log4j.LogManager
import org.apache.log4j.Logger
import org.apache.log4j.MDC
import org.openqa.selenium.OutputType
import org.openqa.selenium.TakesScreenshot
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver
import org.testng.IRetryAnalyzer
import org.testng.ITestResult
import org.testng.Reporter
import org.testng.annotations.AfterClass
import org.testng.annotations.AfterMethod
import org.testng.annotations.BeforeClass

public class Abstarct extends  DbConnection.DbCon implements IRetryAnalyzer {

    public Logger log = LogManager.getLogger(getClass().getName())
    public static WebDriver driver
    public def browserName = System.getProperty("browserName")
    public def deviceName = System.getProperty("deviceName")
    public final Properties configProp = new Properties()
    public InputStream inputStream
    public def baseUrl ="http://10.248.67.14:7005/" //"https://web-cloud-dev.foreks.com/web-client/foreks/"
    public static int waitDuration = 5
    private int count = 0;
    private static int maxTry = 3;
    public static def failedMessage

    //CrossBrowser İnvestTest
    @BeforeClass
    public void setUp() {
        if (browserName == "chrome") {
            //driver = new RemoteWebDriver(new URL("http://10.10.0.56:4444/wd/hub"), DesiredCapabilities.chrome());
            driver.manage().window().maximize();
            driver.get(baseUrl);
            MDC.put("BrowserName", "Chrome")
            //inputStream = getClass().getClassLoader().getResourceAsStream("browserElement.properties");
            // configProp.load(inputStream)
            // new InputStreamReader(inputStream, "UTF-8");
        } else if (browserName == "responsive") {
            try {
                Map<String, String> mobileEmulation = new HashMap<String, String>();
                mobileEmulation.put("deviceName", deviceName);
                Map<String, Object> chromeOptions = new HashMap<String, Object>();
                chromeOptions.put("mobileEmulation", mobileEmulation);
                DesiredCapabilities capabilities = DesiredCapabilities.chrome();
                capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
                driver = new RemoteWebDriver(new URL("http://10.10.0.56:4444/wd/hub"), capabilities);
                driver.manage().window().maximize();
                driver.get(baseUrl);
                MDC.put("BrowserName", "Responsive")
                MDC.put("DeviceName", deviceName)
                // inputStream = getClass().getClassLoader().getResourceAsStream("responsiveElement.properties");
                //configProp.load(inputStream)
                //new InputStreamReader(inputStream, "UTF-8");
            } catch (NoClassDefFoundError e) {
                System.out.println(e.getMessage());
            }
        } else {
            driver = new ChromeDriver()
            // driver = new RemoteWebDriver(new URL("http://10.10.0.56:4444/wd/hub"), DesiredCapabilities.firefox());
            driver.manage().window().maximize();
            driver.get(baseUrl);
            MDC.put("BrowserName", "Chrome")
        }
    }



    //Close Driver
    @AfterClass
    public tearDown() {
       // driver.quit()
    }

    //Find İnvestTest Result
    @AfterMethod
    public testResult(ITestResult result) {
        if (result.isSuccess() == true) {
            log.info("PASSED")
            String ESCAPE_PROPERTY = "org.uncommons.reportng.escape-output";
            System.setProperty(ESCAPE_PROPERTY, "false");
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("screenshot/" + result.getName() + ".png"));
        } else {
            log.error("FAILED")
            failedMessage = result.getThrowable().toString()
            // mailsend(result.getName(), result.getName())
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("screenshot/" + result.getName() + ".png"));
            //add screenshot in reportng
            String ESCAPE_PROPERTY = "org.uncommons.reportng.escape-output";
            System.setProperty(ESCAPE_PROPERTY, "false");
            Reporter.setCurrentTestResult(result);
            Reporter.log("<img style='width:99%;height:99%;' src=" + new File("screenshot/" + result.getName() + ".png").getAbsolutePath() + ">")
        }
    }



    //If İnvestTest case status is failed . İnvestTest case will re-run
    @Override
    public boolean retry(ITestResult result) {
        if (!result.isSuccess()) {
            if (count < maxTry) {
                count++;
                result.setStatus(ITestResult.FAILURE);
                return true;
            } else {
                result.setStatus(ITestResult.FAILURE);
            }
        } else {
            result.setStatus(ITestResult.SUCCESS);
        }
        return false;
    }
}
