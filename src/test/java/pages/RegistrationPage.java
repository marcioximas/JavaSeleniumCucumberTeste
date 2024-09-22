package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import utility.BrowserDriver;

public class RegistrationPage extends BrowserDriver {

    public static String registration_heading_xpath = "/html/body/center/h1";

    public void visiblity_registration_heading() throws InterruptedException {
        Thread.sleep(2000);
        String getRegistration =  driver.findElement(By.xpath(registration_heading_xpath)).getText();
        Assert.assertEquals("Registration", getRegistration);
    }
}
