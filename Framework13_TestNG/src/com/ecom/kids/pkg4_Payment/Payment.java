package com.ecom.kids.pkg4_Payment;
import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class Payment {
    private HtmlUnitDriver driver = null;

    @Test(groups = { "paymentgroup", "all" })
    public void Payment1(){
        System.out.println("Payment1--"+Thread.currentThread().getId());
        java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(java.util.logging.Level.OFF);
        java.util.logging.Logger.getLogger("org.apache.http").setLevel(java.util.logging.Level.OFF);
        driver = new HtmlUnitDriver(false);
        driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
    }

    @Test(groups = { "paymentgroup", "all" })
    public void Payment2(){
        System.out.println("Payment2--"+Thread.currentThread().getId());
        driver.findElement(By.id("confirmBox")).click();
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
    }

    @Test(groups = { "paymentgroup", "all" })
    public void Payment3(){
        System.out.println("Payment3--"+Thread.currentThread().getId());
        driver.quit();
    }

}