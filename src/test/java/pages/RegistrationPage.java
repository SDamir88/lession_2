package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    // locators
    SelenideElement firstNameInput = $("#firstName");
    SelenideElement lastNameInput = $("#lastName");
    SelenideElement userEmailInput = $("#userEmail");
    SelenideElement userGenderInput = $("#genderWrapper");
    SelenideElement userNumberInput = $("#userNumberWrapper");
    SelenideElement dateOfBirthInput = $("#dateOfBirthInputWrapper");
    SelenideElement subjectsInput = $("#subjectsInputWrapper");
    SelenideElement hobbiesInput = $("#hobbiesWrapper");
    SelenideElement uploadPictureInput = $("#uploadPictureWrapper");
    SelenideElement currentAddressInput = $("#currentAddressWrapper");
    SelenideElement stateInput = $("#stateWrapper");
    SelenideElement cityInput = $("#cityWrapper");
    SelenideElement submitInput = $("#submitWrapper");
    SelenideElement resultsTable =  $(".table-responsive");



    // actions
    public void setFirstName(String firstName) {
        firstNameInput.setValue(firstName);
    }
    public void setLastName(String lastName) {
        lastNameInput.setValue(lastName);
    }
    public void setEmail(String userEmail) {
        userEmailInput.setValue(userEmail);
    }
    public void  setGender(String genderWrapper) { userGenderInput.$(byText(genderWrapper)).click(); }
    public void  setUserNumber(String userNumberWrapper) { userNumberInput.$(byText(userNumberWrapper)).click(); }

    public void  setDateOfBirthInput(String dateOfBirthInputWrapper) { dateOfBirthInput.$(byText(dateOfBirthInputWrapper)).click(); }

    public void  setSubjectsInput(String subjectsInputWrapper) { subjectsInput.$(byText(subjectsInputWrapper)).click(); }

    public void  setHobbiesInput(String hobbiesWrapper) { hobbiesInput.$(byText(hobbiesWrapper)).click(); }

    public void  setUploadPictureInput(String uploadPictureWrapper) { uploadPictureInput.$(byText(uploadPictureWrapper)).click(); }

    public void  setCurrentAddressInput(String currentAddressWrapper) { currentAddressInput.$(byText(currentAddressWrapper)).click(); }

    public void  setStateInput(String stateWrapper) { stateInput.$(byText(stateWrapper)).click(); }

    public void  setCityInput(String cityWrapper) { cityInput.$(byText(cityWrapper)).click(); }

    public void  setSubmitInput(String submitWrapper) { submitInput.$(byText(submitWrapper)).click(); }


    public void  checkForm(String fieldName, String value) {
        resultsTable.$(byText(fieldName))
            .parent().shouldHave(text(value));
    }




}
