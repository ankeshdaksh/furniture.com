package made.com;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static made.com.BaseMain.driver;

public class AddCart {

    @FindBy(css = "section#HowMadeWorks")
    WebElement setCheckTitle;
    @FindBy(css = ".category-title ")
    WebElement categoryTitle;
    @FindBy(css = "category-products")
    WebElement categoryList;
    @FindBy(css = "#product_addtocart_button")
    WebElement button_addBasket;
    @FindBy(css ="span.product-name")
    WebElement itemDetail;


    String itemName;


    public AddCart() {
        PageFactory.initElements(driver, this);
    }

    public void checkTitle() {
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Great design direct from the makers"));

    }

    public void gotoCategoryTitle(String productTitle) {
        WebElement categoryName = driver.findElement(By.linkText(productTitle));
        categoryName.click();
        categoryTitle.getText();
        System.out.println("Category title====" + categoryTitle.getText());

    }

    public void gotoSubCategory(String subCategory) {
        WebElement categoryName = driver.findElement(By.linkText(subCategory));
        categoryName.click();
    }

    public void itemSelection() {
        List<WebElement> itemCount = driver.findElements(By.cssSelector("div.hoverbox.product-item"));
        WebElement item = itemCount.get(0);
        itemName = item.getText();
        System.out.println("Product Name......"+itemName);
        item.click();
    }

    public void addToBasket() {
        button_addBasket.click();
    }

    public void checkBasket() {
        String itemNameInBasket = itemDetail.getText();
        Assert.assertTrue(itemName.contains(itemNameInBasket));
    }


}





















