package Abstract

import Resources.Resources
import com.goebl.david.Webb
import org.openqa.selenium.By
import org.openqa.selenium.Cookie
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.Select
import org.openqa.selenium.support.ui.WebDriverWait
import org.testng.Assert
import Abstract.MainFunctions
import java.awt.*
import java.awt.event.KeyEvent
import java.util.List


//

//Test

class MainFunctions extends Abstarct {

    public def versionInformation = ""

    //Find Element ByLinkText
    public WebElement linktext(String Element) {
        WebDriverWait driverWait = new WebDriverWait(driver, waitDuration);
        WebElement elem = driverWait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(Element)));
        return elem;
    }

    //Find Element ByXpath
    public static WebElement xpath(String Element) {
        WebDriverWait driverWait = new WebDriverWait(driver, waitDuration);
        WebElement elem = driverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Element)));
        return elem;

    }

    //JS - JQ
    public static String jss(String Element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String userNameId = (String) js.executeScript('return jq("' + Element + '")[0].id');
        return userNameId;
    }


    static void menu_click(String aranan) {
        List list = driver.findElements(By.className("z-tree-body"))[1].findElements(By.tagName("div"))
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getText().trim().equals(aranan)) {
                list.get(i).click()
            }
        }
    }

    //Find Elements classNames
    public ArrayList classNames(String Element) {
        WebDriverWait driverWait = new WebDriverWait(driver, waitDuration);
        WebElement elem = driverWait.until(ExpectedConditions.presenceOfElementLocated(By.className(Element)));
        ArrayList<WebElement> list = driver.findElements(By.className(Element))
        return list
    }

    //Find Elements ByIds
    public ArrayList ids(String Element) {
        WebDriverWait driverWait = new WebDriverWait(driver, waitDuration);
        WebElement elem = driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id(Element)));
        ArrayList<WebElement> list = driver.findElements(By.id(Element))
        return list
    }
    //Find Element ById
    public WebElement id(String Element) {
        WebDriverWait driverWait = new WebDriverWait(driver, waitDuration);
        WebElement elem = driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id(Element)));
        return elem;
    }

    //Find Element ByCss
    public static WebElement css(String Element) {
        WebDriverWait driverWait = new WebDriverWait(driver, waitDuration);
        WebElement elem = driverWait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Element)));
        return elem;
    }

    static void list_click(String aranan) {
        List list = driver.findElement(By.cssSelector(".z-combobox-pp.z-combobox-shadow")).findElements(By.tagName("tr"))
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getText().equals(aranan)) {

                list.get(i).click()

            }
        }
    }

    static void list_click2(String aranan) {
        List list = driver.findElement(By.cssSelector(".z-bandbox-pp.z-bandbox-shadow")).findElements(By.tagName("tr"))
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getText().trim().equals(aranan)) {

                list.get(i).click()

            }
        }
    }

    //Anasayfaya Don
    public static void anasayfa() {
        css(".logo.left").findElement(org.openqa.selenium.By.tagName("a")).click()
    }

    //Find Element ByClass
    public WebElement classname(String Element) {
        WebDriverWait driverWait = new WebDriverWait(driver, waitDuration);
        WebElement elem = driverWait.until(ExpectedConditions.presenceOfElementLocated(By.className(Element)));
        return elem;
    }

    //loading id jq
    public String idload(String elem) {
        try {
            while (true) {
                if (id(loading).isDisplayed()) {
                }
            }
        }
        catch (Exception e) {
            id(jss(elem)).isDisplayed()
        }
    }

    //loading xpath
    public String xpathload(String elem) {
        try {
            while (true) {
                if (id(loading).isDisplayed()) {
                }
            }
        }
        catch (Exception e) {
            xpath(elem).isDisplayed()
        }
    }

    //Find Element ByName
    public WebElement name(String Element) {
        WebDriverWait driverWait = new WebDriverWait(driver, waitDuration);
        WebElement elem = driverWait.until(ExpectedConditions.presenceOfElementLocated(By.name(Element)));
        return elem;
    }

    //Read Properties File
    public prop(String value) {
        return configProp.getProperty(value)
    }

    //Select item in Combobox
    def selectItem(elementXpath, value) {
        final Select selectBox = new Select(xpath(elementXpath));
        selectBox.selectByValue(value);
    }

    //sendSevicesRequest JSON Array
    def static sendRequestJSONArray(def url) {
        Webb webb = Webb.create();
        webb.setDefaultHeader("Authorization", "Basic ZmV3d2F6NjA6MTAyMDMw");
        return webb.get(url).ensureSuccess().asJsonArray().getBody()
    }

    //sendSevicesRequest JSON Object
    def static sendRequestJSONObject(def url) {
        Webb webb = Webb.create();
        webb.setDefaultHeader("Authorization", "Basic ZmV3d2F6NjA6MTAyMDMw");
        return webb.get(url).ensureSuccess().asJsonObject().getBody()
    }

    //scroll Pagedown
    public static void scrollPageDown(WebElement element) {
        element.click()
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
            robot.keyRelease(KeyEvent.VK_PAGE_DOWN);

        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void assertText(value, text) {
        Assert.assertEquals(xpath(value).getText(), text)
    }

    public static void assertCss(value, attribute, text) {
        Assert.assertEquals(xpath(value).getCssValue(attribute), text)
    }

    public static void assertAttribute(value, attribute, text) {
        Assert.assertEquals(xpath(value).getAttribute(attribute), text)
    }

    static void checkbox_click(String aranan) {
        List list

        list = driver.findElements(By.cssSelector(".z-listbox"))[1].findElements(By.tagName("td"))
        if (aranan.equals("")) driver.findElements(By.cssSelector(".z-listbox"))[1].findElements(By.tagName("td"))[1].click()
        else {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getText().trim().equals(aranan)) {

                    list.get(i).click()
                    break

                }
            }
        }
    }

    static void list_clickContains(String aranan) {
        List list = driver.findElement(By.cssSelector(".z-combobox-pp.z-combobox-shadow")).findElements(By.tagName("tr"))
        for (int i = 0; i < list.size(); i++) {
            //if (list.get(i).getText().equals(aranan)) {
            if (list.get(i).getText().contains(aranan)) {
                list.get(i).click()

            }
        }
    }

    static void user_click(String aranan) {
        List list = driver.findElements(By.className("z-listbox-body"))[2].findElements(By.tagName("div"))
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getText().trim().equals(aranan)) {
                //user_click("Aktif") ek olarak and le 2 kosul aratıp tıklayabilirsin
                list.get(i).click()
            }
        }
    }

    public static boolean assertTextBoolean(value, text) {
        return Assert.assertEquals(xpath(value).getText(), text)

    }

    public static void deleteCookie() {
        Set<Cookie> ac = driver.manage().getCookies()
        System.out.println("Cookie Sayisi = " + ac.size())

        for (Cookie cookie : ac) {
            //   System.out.println("name   = " + cookie.getName())
            System.out.println("domain = " + cookie.getDomain())
            //   System.out.println("path   = " + cookie.getPath())
            //   System.out.println("value  = " + cookie.getValue())
            System.out.println("-------SECIL--------")

        }
        driver.manage().deleteAllCookies()
        driver.manage().getCookies()
        Set<Cookie> afterDel = driver.manage().getCookies()
        System.out.println("Sildikten Sonra Cookie Sayisi = " + afterDel.size())
    }

    public void login(pozisyonSecim) {

        if (id(jss(username)).isEnabled()) {
            id(jss(username)).sendKeys("002464")
        }
        if (id(jss(password)).isEnabled()) {
            id(jss(password)).sendKeys("*102938Ab")
        }
        if (id(jss(onaylaButon)).isEnabled()) {
            id(jss(onaylaButon)).click()
        }
        idload(pozisyonSec)
        if (id(jss(pozisyonSec)).isEnabled()) {
            id(jss(pozisyonSec)).click()
        }
        sleep(2000)
        if (xpath(pozisyonSecim).isEnabled()) {
            xpath(pozisyonSecim).click()
        }
        if (id(jss(loginButon)).isEnabled()) {
            id(jss(loginButon)).click()
        }
    }

    public void pozisyonDegistir(pozisyonSecim2) {
        sleep(6000)
        //xpathload(pdXpath)
        if (xpath(pdXpath).isEnabled()){
            xpath(pdXpath).click()
        }

        sleep(2000)

        if (id(jss(pozisyonSec)).isEnabled()) {
            id(jss(pozisyonSec)).click()
        }
        sleep(2000)
        if (xpath(pozisyonSecim2).isEnabled()) {
            xpath(pozisyonSecim2).click()
        }
        sleep(2000)
        if (id(jss(btnDevam)).isEnabled()) {
            id(jss(btnDevam)).click()
        }
    }


}