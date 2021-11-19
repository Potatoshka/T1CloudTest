import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.testng.annotations.Test;

public class DressesTest extends BaseTest{
    String mainPageUrl="http://automationpractice.com/index.php";
    String buttonXpath ="//a[@title='Dresses']";
    String titleXpath = "//span[@class='cat-name']";
    String destinationURL="http://automationpractice.com/index.php?id_category=8&controller=category";


    @BeforeAll
    static void setupAllureReports() {

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true)
        );
    }




    @Test
    public void pageTest(){
        goTo(mainPageUrl);
        click(buttonXpath);
        checkURL(destinationURL);
        if(checkText(buttonXpath,titleXpath)){
            System.out.println("Text matches");
        }
        else {
            System.out.println("Text doesn't match");
        }



    }
}
