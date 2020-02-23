package homepage.pageobjet;

import databases.ConnectToSqlDB;
import homepage.webelement.HomePageWebelement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends HomePageWebelement {

    @FindBy(xpath = xPathPractice)public static WebElement practiceButton;
    public static WebElement getPracticeButton(){return practiceButton;}
    public static void clickPracticeButton(){getPracticeButton().click();}

    @FindBy(xpath = xPathSelectClassBar)public static WebElement selectClassBar;
    public static WebElement getSelectClassBar(){return selectClassBar;}
    public static void clickSelectClassBar(){getSelectClassBar().click();}

    @FindBy(xpath = webElemetRadioButton)
    public static WebElement radioButton;

    public static WebElement getRadioButton() {
        return radioButton;
    }

    public static void clickRadioButton() {
        getRadioButton().click();
    }

    @FindBy(xpath = webElemetSelectButton)
    public static WebElement selectButton;

    public static WebElement getSelectButtonButton() {
        return selectButton;
    }

    public static void clickSelectButton() {
        getRadioButton().click();
    }

    @FindBy(xpath = webElemetSelectCheckBox)
    public static WebElement selectCheckButton;

    public static WebElement selectCheck() {
        return selectCheckButton;
    }

    public static void checkButton() {
        selectCheck().click();
    }

    @FindBy(xpath = webElemetOpenNewTab)
    public static WebElement openTab;

    public static WebElement newTab() {
        return openTab;
    }

    public static void newTabOpen() {
        newTab().click();
    }

    @FindBy(xpath = webElemetOpenNewTab1)
    public static WebElement openTab1;

    public static WebElement newTab1() {
        return openTab1;
    }

    public static void newTabOpen1() {
        newTab1().click();
    }

    @FindBy(xpath = webElemetAlertHandle)
    public static WebElement alertHandle;

    public static WebElement alertHandleButton() {
        return alertHandle;
    }

    public static void alertNewHandle() {
        alertHandleButton().click();
    }

    @FindBy(xpath = webElemetSearchBox)
    public static WebElement searchBox;

    public static WebElement searchBoxSend() {
        return searchBox;
    }

    public static void searchBoxSendValue(List<String> list) {
        for (String ele: list) {
            searchBox.sendKeys(ele); }
    }

    @FindBy(xpath = "//div[@id='navbar']")
    public static WebElement iFrame;
    @FindBy(xpath = webElemetIframeSearchBar)
    static WebElement  iFrameSearchBar;

    @FindBy(xpath = webElemetIframeName)
    public static WebElement iFrameName;
    public static void useSearchbar(String info){
        iFrameSearchBar.sendKeys(info, Keys.ENTER);
    }
    public static void clearSearchBar(){
        iFrameSearchBar.clear();
    }

    @FindBy (xpath = webElemetMouseHover)public static WebElement mouseHover;
    public static void setMouseHover(){ mouseHoverByXpath(webElemetMouseHover);}



}
