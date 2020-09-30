
package com.qa.demo;

import org.testng.Assert;
import org.testng.annotations.*;


public class LoginTest {

    @BeforeSuite
    public void beforeTestSuite()
    {
        System.out.println("executed before suite");

    }

    @AfterSuite
public void afterTestSuite()
{
    System.out.println("excuted after suite");
}

@Parameters({"browser","os"})
@BeforeTest
public void beforeTest(String browser,String os)
{
    System.out.println("executed before test");
    System.out.println("Browse:"+browser);
    System.out.println("OS: "+os);
}


@AfterTest
public void afterTest()
{
    System.out.println("excuted after tests");
}


@BeforeClass
    public void beforeClass()

    {
        System.out.println("executed before class");
    }
    @AfterClass
public void afterClass()
    {
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

    @Test(priority = 2, testName=" LOGIN PAGE")
    public void loginTest()
    {
        System.out.println("Login test with ");
        String a="Hello";
        String b="Hello";
        Assert.assertEquals(a,b ," Strings are  equal");
      //  Assert.fail();
    }
    @Test(priority=1,dataProviderClass = TestData.class,dataProvider = "userInfo")
    public void loginWithInvalidUser(String userName, String password)
    {
        System.out.println("Invalid User");
        System.out.println("Username : "+ userName);
        System.out.println("Password : " + password);
        String exp = "Hello";
        String act = "Hello";
        Assert.assertEquals(act,exp,"The words dont match");
    }
@Test(priority=3,testName="Home page for project")
    public void homePage()
    {
        System.out.println("Test home page");
        String exp="Homepage";
        String act="Homepage";
        Assert.assertTrue(exp==act,"Home page title is incorrect");

    }
    @Test(priority = 4)
    public void logout()
    {
        System.out.println("log out out test");
    }

}
