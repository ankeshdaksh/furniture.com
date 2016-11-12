package made.com;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static made.com.BaseMain.driver;

/**
 * Created by kailash on 12/11/2016.
 */
public class InviteFriends {
    WebDriverWait wait = new WebDriverWait(driver, 30);
    @FindBy(css = "a#refer-link>span")
    WebElement inviteFriedLink;
    @FindBy(xpath = "html/body/div[4]/div[2]/div/div/section/ul/li[1]/div")
    WebElement inviteFortyFriend;
    @FindBy(xpath = "html/body/div[4]/div[2]/div/div/section/ul/li[2]/div")
    WebElement inviteTwelveFried;
    @FindBy(xpath = "html/body/div[4]/div[2]/div/div/section/ul/li[3]/div")
    WebElement inviteTwoFriend;
    String discountUrl;

    public InviteFriends() {
        PageFactory.initElements(driver, this);

    }


    public void gotoInviteFriendButton() {
        inviteFriedLink.click();
        String inviteFrindText = inviteFriedLink.getText();

    }

    public void gotoInviteFortyFriend() {
        inviteFortyFriend.getText();
        discountUrl = driver.getCurrentUrl();
        Assert.assertEquals(discountUrl, "https://www.made.com/refer/");
        System.out.println("invite forty friend================" + inviteFortyFriend.getText());
    }

    public void gotoInviteTwelveFriend(){
        inviteTwelveFried.getText();
        discountUrl = driver.getCurrentUrl();
        System.out.println("invite twelve friend==============" + inviteFortyFriend.getText());
        Assert.assertEquals(discountUrl, "https://www.made.com/refer/");
    }

    public void gotoInviteTwoFriend(){

        inviteTwoFriend.getText();
        discountUrl = driver.getCurrentUrl();
        System.out.println("invite two friend===================" + inviteFortyFriend.getText());
        Assert.assertEquals(discountUrl, "https://www.made.com/refer/");

    }


    }








