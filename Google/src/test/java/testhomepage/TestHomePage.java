package testhomepage;

import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestHomePage extends HomePage {

    public static void getInItElements(){ PageFactory.initElements(driver,HomePage.class); }

    @Test(priority = 1)
    public static void testSearchFromDB() throws Exception {
        getInItElements();
        sleepFor(1);
        searchDataBase();
    }
    @Test(priority = 2)
    public static void testSearchFromExcel() throws IOException, InterruptedException {
        getInItElements();
        sleepFor(1);
        searchFromExcel();
    }

}
