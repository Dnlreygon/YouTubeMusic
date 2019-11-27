import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.FirstPage;
import pageObjects.SecondPage;
import pageObjects.ThirdPage;

public class TestCase {

    private WebDriver driver;
    private FirstPage firstPage;
    private SecondPage secondPage;
    private ThirdPage thirdPage;
    private String search="sound of silence";

    @Before
    public void precondition() throws InterruptedException {
        driver= new ChromeDriver();
        driver.get("https://www.youtube.com/");
        firstPage= PageFactory.initElements(driver,FirstPage.class);
        secondPage= PageFactory.initElements(driver,SecondPage.class);
        thirdPage= PageFactory.initElements(driver,ThirdPage.class);
        firstPage.useSearchBar(search);
        firstPage.clickSearchBtn();

    }
    @Test

    public void casoDePruebaPositivo() throws InterruptedException {

        Thread.sleep(2000);
        secondPage.clickGoodSong();
        Thread.sleep(5000);
        Assert.assertTrue(thirdPage.isSelectedSong());

    }

    @After
   public void finalization(){
        driver.quit();
    }
}
