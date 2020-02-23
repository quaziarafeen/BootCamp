package home;

import common.WebAPI;

public class WebElementHomepage extends WebAPI {

    public static  final String xPathValidateHomePage="//p[@class='intro']";
    public static final String xPathResizeableButton = "//a[contains(text(),'Resizable')]";
    public static final String xPathResizeFrameLocator = "//iframe[@class='demo-frame']";
    public static final String xPathResizeSnippet = "//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']";
    public static final String xPathRadioFrame = "//iframe[@class='demo-frame']";

    public static final String xPathRadioButtonTab ="//a[contains(text(),'Checkboxradio')]";
    public static final String xPathRadioButton1 = "//label[contains(text(),'New York')]";
    public static final String xPathRadioButton2 = "//label[contains(text(),'Paris')]";
    public static final String xPathRadioButton3 = "//label[contains(text(),'London')]";

    public static final String xPathCheckBoxTab = "//a[contains(text(),'Checkboxradio')]";
    public static final String xPathCheckboxSelect1 = "//label[contains(text(),'2 Star')]";
    public static final String xPathCheckboxSelect2 = "//label[contains(text(),'3 Star')]";
    public static final String xPathCheckboxSelect3 = "//label[contains(text(),'4 Star')]";
    public static final String xPathCheckboxSelect4 = "//label[contains(text(),'5 Star')]";

    public static final String xPathDragAndDropButton = "//a[contains(text(),'Droppable')]";
    public static final String xPathDragAndDropFrame = "//iframe[@class='demo-frame']";
    public static final String xPathDragFrom = "//div[@id='draggable']";
    public static final String xPathDropTo="//div[@id='draggable']";

    public static final String xPathDialogTab= "//a[contains(text(),'Dialog')]";
    public static final String xPathDialogiFrame = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/iframe[1]";
    public static final String xPathDialogPopUp = "/html[1]/body[1]/div[1]";
    public static final String xPathDialogPopUpClose = "//span[@class='ui-button-icon ui-icon ui-icon-closethick']";

    public static final String xPathMouseHoverContributeTab = "//a[contains(text(),'Contribute')]";
    public static final String xPathMouseHoverContributeCLASelect = "//a[contains(text(),'CLA')]";
    public static final String xPathMouseHoverStyleGuidesSelect = "//a[contains(text(),'Style Guides')]";

    public static final String xPathJQueryImage = "//h2[@class='logo']//a[contains(text(),'jQuery UI')]";


    public static final String xPathJQueryCalenderTab = "//a[contains(text(),'Datepicker')]";
    public static final String xPathJQueryCalenderIFrame = "//iframe[@class='demo-frame']";
    public static final String xPathJQueryCalenderbox = "//iframe[@class='demo-frame']";



    public static final String xPathFacebookCreateAccount = "//*[@id=\"facebook\"]/body";
    public static final String xPathFacebookSelectDay = "//select[@id='day']";



    public static final String xPathJQuerySelectMenuTab = "//a[contains(text(),'Selectmenu')]";
    public static final String xPathJQuerySelectMenuIFrmae = "//iframe[@class='demo-frame']";
    public static final String xPathJQuerySelectDropDownBar = "//span[@id='speed-button']";


    public static final String xPathPracticeSwitchWindowTab = "//button[@id='openwindow']";
    public static final String xPathPracticeOpenNewTab = "//a[@id='opentab']";
    public static final String xPathPracticeFromTabSelectSomething = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/div[2]";

    public static final String xPathPracticeAlertConfirmButton ="//input[@id='confirmbtn']";

    public static final String xPathPracticeWebElemetTable = "//table[@id='product']";






}
