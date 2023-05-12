package definitions;

import abilities.OpenBrowserAbility;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import utilities.ChromeWebDriver;

public class OpenPageDefinition {
	
	ChromeWebDriver chromeDriver;

	@Given("abra la pagina de One Drive")
	public void openPage() {
		Actor actor = Actor.named("Automation");
		actor.attemptsTo(OpenBrowserAbility.onPage("https://www.onedrive.com"));
    }

}
