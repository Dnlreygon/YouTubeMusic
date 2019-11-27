package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstPage {
    @FindBy(xpath = "//div/input")
    private WebElement searchBar;

    @FindBy(xpath = "//button[@id=\"search-icon-legacy\"]")
    private WebElement searchBtn;

    public void useSearchBar(String search){
        this.searchBar.sendKeys(search);
    }

    public WebElement getSearchBtn(){
        return this.searchBtn;
    }

    public void clickSearchBtn(){
         this.searchBtn.click();
    }
}
