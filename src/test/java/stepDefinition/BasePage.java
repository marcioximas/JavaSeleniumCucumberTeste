package stepDefinition;

import io.cucumber.java.en.Given;

import static pages.HomePage.*;

public class BasePage {

    @Given("User navigates to the login page")
    public void user_navigates_to_the_login_page() throws InterruptedException {
        System.out.println("User navigates to the login page");
        click_Hamburguer_Menu();
        click_sigIn_link();
    }
}
