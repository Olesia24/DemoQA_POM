package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.PracticeFormPage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeFormTest extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getForms();
        new SidePanel(driver).selectPracticeForm();
    }
    @Test
    public void createStudentAccountTest(){
        //hide iframes
        new PracticeFormPage(driver).hideIframes();
        new PracticeFormPage(driver)
                //enter personal data
                .enterPersonalData("Olga", "Müler", "olgamueler123@gmail.com", "1234567890")
                //select gender(radio button)
                .selectGender("Male")
                //enter birthday
                .enterBirthday("24 October 1992")
                //enter subjects
                .enterSubjects(new String[]{"Math", "Chemistry"})
                //select hobby(check box)
                .selectHobby(new String[]{"Sports", "Reading"})
                //select state
                .uploadFile("/Users/olesiavoprykova/Tools/foto.jpeg")
                //select city
                .selectState("NCR")
                //click on submit button
                .selectCity("Delhi")
                //assert student form is appears
                .clickOnSubmit()
                .verifySuccessTitle("Thanks for submitting the form");
    }
}
