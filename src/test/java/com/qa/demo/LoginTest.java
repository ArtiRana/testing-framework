package com.qa.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.sound.midi.Soundbank;

@Test(priority = 1)
public class LoginTest {

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
