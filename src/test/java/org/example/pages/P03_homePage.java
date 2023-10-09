package org.example.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;



import java.util.List;

import static org.example.stepDefs.Hooks.driver;

public class P03_homePage {

    public WebElement qtyItem(){return driver.findElement(By.className("qty-input"));}
    public WebElement wishlistButton(){return driver.findElement(By.className("wishlist-label"));}
    public WebElement successWishlistMessageColor(){return driver.findElement(By.className("success"));}
    public WebElement successWishlistMessage(){return driver.findElement(By.className("content"));}
    public WebElement youtubeLink(){return driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]"));}
    public WebElement rssLink(){return driver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]"));}
    public WebElement twitterLink(){return driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]"));}
    public WebElement facebookLink(){return driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));}
    public WebElement changeCurrency(){return driver.findElement(By.xpath("//option[text()=\"Euro\"]"));}
    public WebElement searchBox(){return driver.findElement(By.id("small-searchterms"));}
    public WebElement searchButton(){return driver.findElement(By.className("search-box-button"));}
    public WebElement clickOnProduct(){return driver.findElement(By.className("item-box"));}
    public WebElement productsName(){return driver.findElement(By.cssSelector("span[id*=\"sku\"]"));}

    public String pagestitle(){return driver.getTitle();}
    public String currentUrl(){return driver.getCurrentUrl();}

    public List<WebElement> sliders(){return driver.findElements(By.cssSelector("a[href=\"https://demo.nopcommerce.com/\"]"));}
    public List<WebElement> priceTag(){return driver.findElements(By.className("actual-price"));}
    public List<WebElement> computersList(){return driver.findElements(By.cssSelector("a[href=\"/computers\"]"));}
    public List<WebElement> electronicsList(){return driver.findElements(By.cssSelector("a[href=\"/electronics\"]"));}
    public List<WebElement> apparelsList(){return driver.findElements(By.cssSelector("a[href=\"/apparel\"]"));}
    public List<WebElement> shoes(){return driver.findElements(By.cssSelector("a[href=\"/shoes\"]"));}
    public List<WebElement> desktops(){return driver.findElements(By.cssSelector("a[href=\"/desktops\"]"));}
    public List<WebElement> notebooks(){return driver.findElements(By.cssSelector("a[href=\"/notebooks\"]"));}
    public List<WebElement> software(){return driver.findElements(By.cssSelector("a[href=\"/software\"]"));}
    public List<WebElement> cameraPhoto(){return driver.findElements(By.cssSelector("a[href=\"/camera-photo\"]"));}
    public List<WebElement> cellPhones(){return driver.findElements(By.cssSelector("a[href=\"/cell-phones\"]"));}
    public List<WebElement> clothing(){return driver.findElements(By.cssSelector("a[href=\"/clothing\"]"));}
    public List<WebElement> accessories(){return driver.findElements(By.cssSelector("a[href=\"/accessories\"]"));}
    public List<WebElement> others(){return driver.findElements(By.cssSelector("a[href=\"/others\"]"));}
    public List<WebElement> productsBox(){return driver.findElements(By.className("item-grid"));}
    public List<WebElement> wishlist(){return driver.findElements(By.xpath("//button[@title=\"Add to wishlist\"]"));}

}
