package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecondPage {
    @FindBy(xpath = "//a[@title='Disturbed  - The Sound Of Silence [Official Music Video]']")
    private WebElement goodSong;

    public void clickGoodSong(){
        this.goodSong.click();
    }
}
