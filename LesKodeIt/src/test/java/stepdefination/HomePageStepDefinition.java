package stepdefination;

import io.cucumber.java.en.Given;
import org.testng.annotations.Test;
import testhomepage.TestHomepage;

public class HomePageStepDefinition extends TestHomepage {

    @Given("I click on PracticeButton")
    public void i_click_on_PracticeButton() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    getInItElements();
    clickPracticeButton();
    }

    @Given("I Select ClassBar")
    public void i_Select_ClassBar() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        getInItElements();
        clickPracticeButton();
        clickSelectClassBar();
    }
    @Given("I am clicking on radio button")
    public void i_am_clicking_on_radio_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        clickRadioButton();
        sleepFor(2);
    }

    @Given("I am clicking on drop down button")
    public void i_am_clicking_on_drop_down_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
    }

    @Given("I am selecting Benz")
    public void i_am_selecting_Benz() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        selectFromDrop(webElemetSelectButton, "benz");
        sleepFor(3);

    }


    @Given("I am selecting Apple And Orange")
    public void i_am_selecting_Apple_And_Orange() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        selectFromMultipleDrop(webElemetSelectMultiButton, "apple", "orange");
        sleepFor(3);
    }

    @Given("I am Testing checkbox By Selecting BMW")
    public void i_am_Testing_checkbox_By_Selecting_BMW() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        checkButton();
        sleepFor(3);

    }

    @Given("I click on open new window")
    public void i_click_on_open_new_window() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        newTabOpen();
    }

    @Given("I close the new window")
    public void i_close_the_new_window() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        handleNewTab(driver);
        sleepFor(1);
        driver.close();
    }

    @Given("I click on open new Tab")
    public void i_click_on_open_new_Tab() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        newTabOpen1();
    }

    @Given("I close the new tab")
    public void i_close_the_new_tab() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        handleNewTab(driver);
        sleepFor(3);
        driver.close();
    }


    @Given("I click on Confirm button")
    public void i_click_on_Confirm_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        searchBoxSend();
        alertNewHandle();
    }

    @Given("I Accept The Alert")
    public void i_Accept_The_Alert() {
        // Write code here that turns the phrase above into concrete actions
        okAlert();
    }

    @Given("I Cancel The Alert")
    public void i_Cancel_The_Alert() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        searchBoxSend();
        alertNewHandle();
        cancelAlert();
    }

    @Given("I Have to get text from web table in the Console")
    public void i_Have_to_get_text_from_web_table_in_the_Console() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        scrollToWebElement(webElemetTable);
        getListOfWebElementsByXpath(webElemetTable);
        sleepFor(2);
    }

    @Given("I mouse hover into mouse hover webElement")
    public void i_mouse_hover_into_mouse_hover_webElement() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    testMouseHover();
    }

    @Given("I get the iFrame")
    public void i_get_the_iFrame() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        getInItElements();
        clickPracticeButton();
        sleepFor(2);
        scrollToWebElement(webElemetIframeName);
        sleepFor(2);
        iframeHandle(iFrameName);

    }


    @Given("I search PNT")
    public void i_search_PNT() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        useSearchbar("PNT");
        sleepFor(2);


    }

    @Given("I Clear The SearchBar")
    public void i_Clear_The_SearchBar() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        clearSearchBar();
        sleepFor(1);
    }


}
