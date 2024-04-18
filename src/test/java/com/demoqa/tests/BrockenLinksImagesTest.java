package com.demoqa.tests;

import com.demoqa.pages.BrockenLinksImagesPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrockenLinksImagesTest extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getElements();
        new SidePanel(driver).selectBrockenLinksimages();

    }
    @Test
    public void checkBrockenLinksTest(){
        new BrockenLinksImagesPage(driver).checkbrockenLinks();
    }
    @Test
    public void checkBrokenImagesPagesTest(){
        new BrockenLinksImagesPage(driver).checkbrockenImages();
    }
}
