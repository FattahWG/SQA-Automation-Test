package palindrome;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        tags = "@Palindrome",
        plugin = {"pretty"},
        features = "classpath:features"

)
public class CucumberTestSuite {}