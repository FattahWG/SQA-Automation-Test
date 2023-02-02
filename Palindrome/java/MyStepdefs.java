package palindrome;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class MyStepdefs {
    private String word;
    private boolean result;

    @Given("a word {string}")
    public void a_word(String word) {
        this.word = word;
    }

    @When("I check if the word is a palindrome")
    public void check_palindrome() {
        result = isPalindrome(word);
    }

    @Then("the result should be {string}")
    public void the_result_should_be(String expectedResult) {
        assertEquals(Boolean.valueOf(expectedResult), result);
    }

    private boolean isPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
