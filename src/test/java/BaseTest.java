import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public  class BaseTest {

    public static WebDriver driver = new ChromeDriver();



    public void goTo(String url){
         driver.navigate().to(url);
     }

     public void click(String xpath){
       finder(xpath).click();
     }

     public boolean checkText(String xpath, String text){
        if(finder(xpath).getText().equalsIgnoreCase(text)){
            return true;
        }
        else return false;
     }

     public void checkURL(String url){
        String actualUrl = driver.getCurrentUrl();
         Assert.assertEquals("URL has been reached",actualUrl,url);
     }

     public  WebElement finder(String xpath){
         return driver.findElement(By.xpath(xpath));
    }

}
