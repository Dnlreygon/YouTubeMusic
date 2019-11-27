package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThirdPage {
    @FindBy(xpath = "//h1")
    private WebElement selectedSong;

    public boolean isSelectedSong(){
        return this.selectedSong.isDisplayed();
    }
}
