package com.ecom.kids.pkg2_Search;
import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class Search {
    private HtmlUnitDriver driver = null;

    @Test(groups = { "searchgroup", "all" })
    public void Search1() throws Exception{
        System.out.println("Search1--"+Thread.currentThread().getId());
        java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(java.util.logging.Level.OFF);
        java.util.logging.Logger.getLogger("org.apache.http").setLevel(java.util.logging.Level.OFF);
        driver = new HtmlUnitDriver(false);
        driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
        Thread.sleep(4000);
    }

    @Test(groups = { "searchgroup", "all" })
    public void Search2()throws Exception{
        System.out.println("Search2--"+Thread.currentThread().getId());
        driver.findElement(By.id("magazines-radio-btn")).click();
        new Select(driver.findElement(By.id("selenium_suite"))).selectByValue("Grid");
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
        Thread.sleep(4000);
    }

    @Test(groups = { "searchgroup", "all" })
    public void Search3()throws Exception{
        System.out.println("Search3--"+Thread.currentThread().getId());
        driver.quit();
        Thread.sleep(4000);
    }

}