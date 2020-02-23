package common;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.*;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static common.WebAPI.sleepFor;

public class CommonAPI extends WebAPI {

        //public static WebDriver driver=null;

        public WebDriver setBrowser(String OS,String Browser){
            if (OS.equalsIgnoreCase("windows")&& Browser.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver","Generic/BrowserDriver/Windows/chromedriver.exe");
                driver=new ChromeDriver();
            }else if (OS.equalsIgnoreCase("mac")&& Browser.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver","BrowserDriver/Windows/chromedriver.exe");
                driver=new ChromeDriver();
            }
            return driver;
        }

    public void clickByXpath(String locator) {
        driver.findElement(By.xpath(locator)).click();
    }

    public void typeByCss(String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }

    public static void scrollUpDown(int scrollValue){
        JavascriptExecutor scroll=(JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0,"+scrollValue+")");

    }
    public static void scrollToFooter(){
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }


    //((JavascriptExecutor) driver).executeScript("window.open('about:blank','_blank');");

    public static void assertCheck(String actual,String expected){
        Assert.assertEquals(actual,expected);
        System.out.println("Test Passed");
    }

    public static void scrollToWebElement(String path){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",
                driver.findElement(By.xpath(path)));
    }


    public static void resizeElement(String frameLocator, String Snippet) {

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(frameLocator)));
        WebElement resizeableElement = driver.findElement(By.xpath(Snippet));
        resize(resizeableElement, 50, 50);
    }

    public static void resize(WebElement elementToResize, int xOffset, int yOffset) {
        try {
            if (elementToResize.isDisplayed()) {
                Actions action = new Actions(driver);
                action.clickAndHold(elementToResize).moveByOffset(xOffset, yOffset).release().build().perform();
            } else {
                System.out.println("Element was not displayed to drag");
            }
        } catch (StaleElementReferenceException e) {
            System.out.println("Element with " + elementToResize + "is not attached to the page document "	+ e.getStackTrace());
        } catch (NoSuchElementException e) {
            System.out.println("Element " + elementToResize + " was not found in DOM " + e.getStackTrace());
        } catch (Exception e) {
            System.out.println("Unable to resize" + elementToResize + " - "	+ e.getStackTrace());
        }
    }

    public void selectableFromList(String locator, String listLocator) throws InterruptedException {
        List<WebElement> dropdown_items= new ArrayList<>();
        dropdown_items = driver.findElements(By.xpath(locator));
        sleepFor(2);
    }


    public void radioButton(String radioButton1, String radioButton2, String radioButton3){
        WebElement radio1 = driver.findElement(By.xpath(radioButton1));
        WebElement radio2 = driver.findElement(By.xpath(radioButton2));
        WebElement radio3 = driver.findElement(By.xpath(radioButton3));

        radio1.click();
        radio2.click();
        radio3.click();
    }

    public void checkBox(String selectCheckBox){
        WebElement checkBoxSelect = driver.findElement(By.xpath(selectCheckBox));
        for (int i= 0; i <2; i++){
            checkBoxSelect.click();
            System.out.println(checkBoxSelect.isDisplayed());
        }
    }

    public void selectFromDropDownList(String locator){
        Select selectFromDrop = new Select(driver.findElement(By.xpath(locator)));
        selectFromDrop.selectByVisibleText("xxxxx");
    }

    public void dragAndDrop(String dragFrom, String dropTo){

        WebElement From=driver.findElement(By.xpath(dragFrom));

        WebElement To=driver.findElement(By.xpath(dropTo));

        Actions act=new Actions(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

        //Dragged and dropped.
        act.dragAndDrop(From, To).build().perform();

    }

    public void calender(String dayLocator, String monthLocator){
        List<WebElement> allDates=driver.findElements(By.xpath(dayLocator));
        for(WebElement day:allDates)
        {
            String date=day.getText();

            if(date.equalsIgnoreCase("28"))
            {
                day.click();
                break;
            }

        }
        List<WebElement> allMonths=driver.findElements(By.xpath(monthLocator));
        for (WebElement month:allMonths){
            String selectMonth = month.getText();

            if (selectMonth.equalsIgnoreCase ("July"))
            {
                month.click();
                break;
            }
        }

    }

    //This is only for Facebook
    public void calenderDays(String dayLocator){

        WebElement days = driver.findElement(By.xpath(dayLocator));
        Select d1= new Select (days);
        d1.selectByValue("2");
        System.out.println(days.getAttribute("value"));

        List<WebElement> dd = d1.getOptions();
        System.out.println(dd.size());
        for(int i=0; i<dd.size();i++){
            String txt = dd.get(i).getText();
            System.out.println(txt);}
    }

    public void dropDown(String locator){
        Select items = new Select(driver.findElement(By.xpath(locator)));
        items.selectByVisibleText("Slower");
        items.selectByIndex(1);
    }

    public void newWindows(){
        String MainWindow = driver.getWindowHandle();

        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1=s1.iterator();

        while(i1.hasNext()){
            String ChildWindow = i1.next();

            if (!MainWindow.equalsIgnoreCase((ChildWindow))){

                driver.switchTo().window(ChildWindow);
            }
        }
    }

    public static void rightClickMouse(String locator){
        Actions actions = new Actions(driver);
        WebElement elementLocator = driver.findElement(By.xpath(locator));
        actions.contextClick(elementLocator).perform();
    }




}
