package docs;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CssXpathExamples {
    void cssXpathExamples() {
        // <input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="email">
        $("[data-testid=email]");
        $(by("data-testid", "email"));

        // <input type="email" class="inputtext login_form_input_box" name="email" id="email">
        $("[id=email]");
        $("#email");
        $(byId("email"));
        $x("//*[@id='email']");
        $(byXpath("//*[@id='email']"));

        // <input type="email" class="inputtext login_form_input_box" name="email">
        $("[name=email]");
        $(byName("email"));

        // <input type="email" class="inputtext login_form_input_box">
        $("[class=login_form_input_box]");
        $(".login_form_input_box");
        $(".inputtext.login_form_input_box");
        $("input.inputtext.login_form_input_box");
        $x("//input[@class='login_form_input_box']");

        // <div class="inputtext">
        //      <input type="email" class="login_form_input_box">
        // </div>
        $(".inputtext .login_form_input_box");


        // <input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="email">
        $("input.inputtext.login_form_input_box#email[name=email][data-testid=email]");

        // <div>Hello qa.guru</div>
        $(byText("Hello qa.guru"));
        $(withText("lo qa.gu"));
    }
}
public class TextBoxTest {
    void beforeAll() {
        @BeforeAll
        static void beforeAll() {
            Configuration.baseUrl = "https://demoqa.com";
            Configuration.browserSize = "1920x1080";
        }
        @Test
        void successFillTest() {
            open("/text-box");
            $(".main-header").shouldHave(text("Text Box"));
            $("#userName").setValue("Alex");
            $("#userEmail").setValue("alex@company.com");
            $("#currentAddress").setValue("Some address 1");
            $("#permanentAddress").setValue("Other address 2");
            $("#submit").click();
            $("#output").shouldHave(text("Alex"), text("alex@company.com"),
                    text("Some address 1"), text("Other address 2"));
            $("#name").shouldHave(text("Alex"));
            $("#currentAddress").shouldHave(text("Some address 1")); // wrong
            $("#currentAddress", 1).shouldHave(text("Some address 1"));
            $("#output").$("#currentAddress").shouldHave(text("Some address 1"));
            $("#output #currentAddress").shouldHave(text("Some address 1"));
        }
    }
