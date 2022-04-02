package com.ecom.kids.pkg1_Login;
import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class Login {
    private HtmlUnitDriver driver = null;

    @Test(groups = { "logingroup", "all" })
    public void Login1(){
        System.out.println("Login1--"+Thread.currentThread().getId());
        java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(java.util.logging.Level.OFF);
        java.util.logging.Logger.getLogger("org.apache.http").setLevel(java.util.logging.Level.OFF);
        driver = new HtmlUnitDriver(false);
        driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
    }

    @Test(groups = { "logingroup", "all" })
    public void Login2(){
        System.out.println("Login2--"+Thread.currentThread().getId());
        driver.findElement(By.id("bicycle-checkbox")).click();
        driver.findElement(By.id("hatchback-checkbox")).click();
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
    }

    @Test(groups = { "logingroup", "fail", "all" })
    public void Login3(){
        System.out.println("Login3--"+Thread.currentThread().getId());
        driver.quit();
        Assert.fail("Failing somehow");
    }

}



//  Groups
//      XML file structure - specific group/ groups, no group,
//      Passing parameter to execute specific group from command line
//             Test runner params - -groups logingroup, searchgroup
//      Using Maven
//          mvn test -DexcludedGroups=group3,group4
//          mvn test -Dgroups=group1,group2
//  Parallel execution
//      Classes, Methods, Thread count
//  Failed test execution using command line
//      java -classpath testng.jar;%CLASSPATH% org.testng.TestNG -d test-outputs testng.xml
//      java -classpath testng.jar;%CLASSPATH% org.testng.TestNG -d test-outputs test-outputs\testng-failed.xml
//  Regular expression in testng.xml file for method level control

