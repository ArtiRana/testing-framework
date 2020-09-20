package com.qa.demo;

import org.testng.Assert;
import org.testng.annotations.*;


public class LoginTest {
@BeforeClass
    public void beforeClass()
    {
        System.out.println("executed before class");
    }
    @AfterClass
public void afterClass(){
    System.out.println("Executed after class");
}

    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println( "run before method");
    }
    @AfterMethod
    public void afterMethod()
    {
        System.out.println(" run after every method");
    }

    @Test(priority = 1)
    public void loginTest()
    {
        System.out.println("Login test with ");
      //  Assert.fail();
    }
    @Test(priority = 2)
    public void loginWithInvalidUser()
    {
        System.out.println("Invalid User");

    }
@Test(priority = 3,testName = "Home page for project")
    public void homePage()
    {
        System.out.println("Test home page");

    }
    @Test()
    public void logout(){
        System.out.println("lout out test");
    }

}
