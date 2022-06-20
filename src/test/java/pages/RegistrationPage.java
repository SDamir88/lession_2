package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;



public class RegistrationPage {
    CalendarComponent calendarComponent = new CalendarComponent();

    // locators
    SelenideElement practiceFormWrapper = $(".practice-form-wrapper");
    SelenideElement firstNameInput = $("#firstName");
    SelenideElement lastNameInput = $("#lastName");
    SelenideElement userEmailInput = $("#userEmail");
    SelenideElement userGenderInput = $("#genterWrapper");
    SelenideElement userNumberInput = $("#userNumber");
    SelenideElement subjectsInput = $("#subjectsInput");
    SelenideElement hobbiesInput = $("#hobbiesWrapper");
    SelenideElement uploadPictureInput = $("#uploadPicture");
    SelenideElement currentAddressInput = $("#currentAddress");
    SelenideElement stateInput = $("#state");
    SelenideElement cityInput = $("#city");
    SelenideElement submitInput = $("#submit");
    SelenideElement resultsTable =  $(".table-responsive");

    // actions
    public RegistrationPage openPage() {
        open("/automation-practice-form");
        practiceFormWrapper.shouldHave(text("Student Registration Form"));
        return this;
    }
    public RegistrationPage setFirstName(String firstName) {firstNameInput.setValue(firstName);
        return this;
    }
    public RegistrationPage setLastName(String lastName) {lastNameInput.setValue(lastName);
        return this;
    }
    public RegistrationPage setEmail(String userEmail) {userEmailInput.setValue(userEmail);
        return this;
    }
    public RegistrationPage setGender(String value) { userGenderInput.$(byText(value)).click();
        return this;
    }
    public RegistrationPage setUserNumber(String userNumber) { userNumberInput.setValue(userNumber);
        return this;
    }
    public RegistrationPage setDateOfBirth(String day, String month, String year){
        $("#dateOfBirthInput").click();
        calendarComponent.setDate(day, month, year);
        return this;
    }
    public RegistrationPage  setSubjectsInput(String value) {subjectsInput.setValue(value).pressEnter();
        return this;
    }
    public RegistrationPage  setHobbiesInput(String value) { hobbiesInput.$(byText(value)).click();
        return this;
    }
    public RegistrationPage  setUploadPictureInput(String value) { uploadPictureInput.uploadFromClasspath(value);
        return this;
    }
    public RegistrationPage  setCurrentAddressInput(String currentAddress) { currentAddressInput.setValue(currentAddress);
        return this;
    }
    public RegistrationPage setStateInput(String NCR) {
        stateInput.scrollTo().click();
        stateInput.$(byText(NCR)).click();
        return this;
    }
    public RegistrationPage  setCityInput(String delhi) {
        cityInput.scrollTo().click();
        $(byText(delhi)).click();
        return this;
    }
    public RegistrationPage  setSubmitInput () { submitInput.click();

        return this;
    }
    public RegistrationPage  checkForm(String fieldName, String value) {
        resultsTable.$(byText(fieldName))
            .parent().shouldHave(text(value));
        return this;

    }

    }

