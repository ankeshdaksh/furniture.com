package made.com;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by kailash on 11/11/2016.
 */
public class MyStepdefs {
    AddCart addcart = new AddCart();
    InviteFriends ref = new InviteFriends();

    @Given("^user is on home page$")
    public void userIsOnHomePage() throws Throwable {
        addcart.checkTitle();

    }


    @When("^He looks for a Product in \"([^\"]*)\"$")
    public void heLooksForAProductIn(String productTitle) throws Throwable {
        addcart.gotoCategoryTitle(productTitle);


    }

    @And("^selects a product from \"([^\"]*)\" and add to cart$")
    public void selectsAProductFromAndAddToCart(String subCategory) throws Throwable {
        addcart.gotoSubCategory(subCategory);
        addcart.itemSelection();
        addcart.addToBasket();

    }


    @Then("^item should be in basket$")
    public void itemShouldBeInBasket() throws Throwable {
        addcart.checkBasket();

    }


    @When("^he navigate to invite friend and$")
    public void heNavigateToInviteFriendAnd() throws Throwable {
        ref.gotoInviteFriendButton();

    }

    @Then("^he can see the message$")
    public void heCanSeeTheMessage() throws Throwable {
        ref.gotoInviteFortyFriend();
        ref.gotoInviteTwelveFriend();
        ref.gotoInviteTwoFriend();

    }

    }








