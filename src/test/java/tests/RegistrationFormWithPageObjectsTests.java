package tests;

import com.codeborne.selenide.Configuration;
        import org.junit.jupiter.api.BeforeAll;
        import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static com.codeborne.selenide.Condition.text;
        import static com.codeborne.selenide.Selectors.byText;
        import static com.codeborne.selenide.Selenide.$;
        import static com.codeborne.selenide.Selenide.open;

        public class RegistrationFormWithPageObjectsTests {
        @BeforeAll
        static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1980x1024";
        Configuration.browser = "firefox";
        }

        @Test
        void successFillTest() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));

        new RegistrationPage().setFirstName("Alex");
        new RegistrationPage().setLastName("Egorov");
        new RegistrationPage().setEmail("alex@egorov.com");
        new RegistrationPage().setGender("Other");
        new RegistrationPage().setUserNumber("1231231230");
        new RegistrationPage().setDateOfBirthInput("");
        new RegistrationPage().setSubjectsInput("Math");
        new RegistrationPage().setHobbiesInput("Sports");
        new RegistrationPage().setUploadPictureInput("img/1.jpeg");
        new RegistrationPage().setCurrentAddressInput("Some address 1");
        new RegistrationPage().setStateInput("state");
        new RegistrationPage().setCityInput("city");
        new RegistrationPage().setSubmitInput("submit");
        new RegistrationPage().setSubmitInput("submit");



        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));

        new RegistrationPage().checkForm("Student Name","Alex Egorov");
        new RegistrationPage().checkForm("Student Email","alex@egorov.com");
        new RegistrationPage().checkForm("Student Gender","Other");

        }
        }
