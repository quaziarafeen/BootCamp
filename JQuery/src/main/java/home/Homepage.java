package home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Homepage extends WebElementHomepage {

    @FindBy(xpath = xPathValidateHomePage)public static WebElement validateHomePage;
    public static WebElement getValidateHomePage(){return validateHomePage;}
    public static void setValidateHomePage(){
        String actual =getValidateHomePage().getText();
        System.out.println("Actual is ::"+actual);
        String expected="jQuery UI is a curated set of user interface interactions, effects, widgets, and themes built on top of the jQuery JavaScript Library. Whether you're building highly interactive web applications or you just need to add a date picker to a form control, jQuery UI is the perfect choice.";
        System.out.println("Expected is:: "+expected);
        assertCheck(actual,expected);
    }

    @FindBy(xpath = xPathResizeableButton)public static WebElement ResizeButton;
    public static WebElement getResizeButton(){return ResizeButton;}
    public static void clickResizeButton(){getResizeButton().click();}

    @FindBy(how = How.XPATH, using = xPathRadioFrame)
    public static WebElement radioFrame;
    public static WebElement getRadioFrame(){
        return radioFrame;
    }

    @FindBy(how = How.XPATH, using = xPathDragAndDropFrame)
    public static WebElement dragAndDropFrame;
    public static WebElement getDragAndDropFrame(){
        return dragAndDropFrame;
    }

    @FindBy(how= How.XPATH, using = xPathJQueryCalenderIFrame)
    public static WebElement calenderIFrame;
    public static WebElement getCalenerIFrame(){
        return calenderIFrame;
    }

    @FindBy(how = How.XPATH, using = xPathDialogiFrame)
    public static WebElement dialogiFrame;
    public static WebElement getDialogiFrame(){
        return dialogiFrame;
    }

    @FindBy(how = How.XPATH, using = xPathJQuerySelectMenuIFrmae)
    public static WebElement selectMenuIFrame;
    public static WebElement getSelectMenuIFrame(){
        return selectMenuIFrame;
    }

    @FindBy(how = How.XPATH, using = xPathPracticeOpenNewTab)
    public static WebElement practiceOpenNewTab;
    public static WebElement getPracticeOpenNewTab(){
        return practiceOpenNewTab;
    }

}
