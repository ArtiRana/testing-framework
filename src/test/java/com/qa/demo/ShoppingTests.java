package com.qa.demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ShoppingTests {
@BeforeClass
public void beforeClass()
{
    System.out.println("Before shopiing test Executed");
}
@AfterClass
public void afterClass()
{
    System.out.println("After shopping test executed");
}
    @Test(priority = 1)
    public void productSearch()
    {
        System.out.println("Search for product");
    }
@Test(priority = 2)

    public void addProductToShoppingCart()

    {
        System.out.println("Add product to cart");
    }


}
