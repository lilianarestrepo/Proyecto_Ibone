package co.com.certification.firtstest.runners;




import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@CucumberOptions(features = "src/test/resources/features/YoutubeSearch/YoutubeSearch.feature",
        glue = {"co.com.certification.firtstest.stepdefintions"},
        snippets = SnippetType.CAMELCASE)

@RunWith(CucumberWithSerenity.class)
public class SearchYoutube {
}

