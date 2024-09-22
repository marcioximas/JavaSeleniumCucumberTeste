package pages;


import org.openqa.selenium.By;
import utility.BrowserDriver;

public class HomePage extends BrowserDriver {

    public static String hambuguer_menu_xpath = "//*[@id='menu-toggle']/input";

    public static String sigIn_link_xpath = "//*[@id=\"menu\"]/a[2]/li";


    public static void click_Hamburguer_Menu() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(hambuguer_menu_xpath)).click();
    }

    public static void click_sigIn_link() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(sigIn_link_xpath)).click();
    }

}
