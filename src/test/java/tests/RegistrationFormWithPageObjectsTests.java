package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

        public class RegistrationFormWithPageObjectsTests extends TestBase {
        RegistrationPage registrationPage = new RegistrationPage();

        @Test
        void successFillTest() {


        registrationPage.openPage()
                .setFirstName("Alex")
                .setLastName("Egorov")
                .setEmail("alex@egorov.com")
                .setGender("Other")
                .setUserNumber("1231231230")
                .setDateOfBirth("30","July","2008")
                .setSubjectsInput("Math")
                .setHobbiesInput("Sports")
                .setUploadPictureInput("img/1.jpeg")
                .setCurrentAddressInput("Some address 1")
                .setStateInput("NCR")
                .setCityInput("Delhi")
                .setSubmitInput()
                .checkForm("Student Name","Alex Egorov")
                .checkForm("Student Email","alex@egorov.com")
                .checkForm("Gender","Other")
                .checkForm("Mobile","1231231230")
                .checkForm("Date of Birth","30 July,2008")
                .checkForm("Subjects","Maths")
                .checkForm("Hobbies","Sports")
                .checkForm("Picture","1.jpeg")
                .checkForm("Address","Some address 1")
                .checkForm("State and City","NCR Delhi");


        }
        }
