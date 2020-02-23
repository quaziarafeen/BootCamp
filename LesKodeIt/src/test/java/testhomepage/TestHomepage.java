package testhomepage;

import homepage.pageobjet.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomepage extends HomePage {

    public static void getInItElements(){ PageFactory.initElements(driver,HomePage.class); }
    @Test (priority = 1)
    public static void testPracticeButton() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
    }

    @Test (priority = 2)
    public static void testSelectClassBar() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        clickSelectClassBar();
        sleepFor(2);
    }

    @Test(priority = 3)
    public static void clickOnRadioButton() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        clickRadioButton();
        sleepFor(2);

    }

    @Test(priority = 4)
    public static void clickOnSelectButton() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        selectFromDrop(webElemetSelectButton, "benz");
        sleepFor(3);

    }

    @Test(priority = 5)
    public static void clickOnSelectMultiButton() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        selectFromMultipleDrop(webElemetSelectMultiButton, "apple", "orange");
        sleepFor(3);

    }

    @Test(priority = 6)
    public static void clickOnCheckButtonBMW() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        checkButton();
        sleepFor(3);

    }

    @Test(priority = 7)
    public static void testNewWindowOpen() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        newTabOpen();
        handleNewTab(driver).close();
        sleepFor(3);
    }

    @Test(priority = 8)
    public static void testNewBrowserTabOpen() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        newTabOpen1();
        handleNewTab(driver).close();
        sleepFor(3);

    }
    @Test(priority = 9)
    public static void alertHandleAccept() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        searchBoxSend();
        alertNewHandle();
        sleepFor(2);
        okAlert();

    }

    @Test(priority = 10)
    public static void alertHandleCancel() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        alertNewHandle();
        sleepFor(2);
        cancelAlert();
    }
    @Test(priority = 11)
    public static void testGetTable() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        scrollToWebElement(webElemetTable);
        getListOfWebElementsByXpath(webElemetTable);
        sleepFor(2);

    }
    @Test(priority = 12)
    public void testMouseHover() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        sleepFor(1);
        //scrollToWebElement(webElemetMouseHover);
        setMouseHover();
        sleepFor(2);
    }
    @Test(priority = 13)
    public void testIFrame() throws InterruptedException {
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        scrollToWebElement(webElemetIframeName);
        sleepFor(2);
        iframeHandle(iFrameName);
        useSearchbar("PNT");
        sleepFor(2);
        clearSearchBar();
        sleepFor(1);
    }

}
