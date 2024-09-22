package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class SignInpage extends BrowserDriver {

        public static String email_textbox_id = "email";

        public static String password_textbox_id = "password";

        public static String login_button_id = "login";

        public static void enter_email(String email) throws InterruptedException {
            Thread.sleep(2000);
            driver.findElement(By.id(email_textbox_id)).sendKeys(email);
        }

        public static void enter_password(String password) throws InterruptedException {
            Thread.sleep(2000);
            driver.findElement(By.id(password_textbox_id)).sendKeys(password);
        }

        public static void click_login_button() throws InterruptedException {
            Thread.sleep(2000);
            driver.findElement(By.id(login_button_id)).click();
        }

}
