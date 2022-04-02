package com.ecom.kids.pkg3_Checkout;
import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class Checkout {
    private HtmlUnitDriver driver = null;

    @Test(groups = { "checkoutgroup", "all" })
    public void Checkout1(){
        System.out.println("Checkout1--"+Thread.currentThread().getId());
        java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(java.util.logging.Level.OFF);
        java.util.logging.Logger.getLogger("org.apache.http").setLevel(java.util.logging.Level.OFF);
        driver = new HtmlUnitDriver(false);
        driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
    }

    @Test(groups = { "checkoutgroup", "all" })
    public void Checkout2(){
        System.out.println("Checkout2--"+Thread.currentThread().getId());
        driver.findElement(By.id("enterText")).sendKeys("Hello 123");
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
    }

    @Test(groups = { "checkoutgroup", "all" })
    public void Checkout3(){
        System.out.println("Checkout3--"+Thread.currentThread().getId());
        driver.quit();
    }

}