package abilities;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class OpenBrowserAbility extends PageObject implements Task {

	private final String url;

	public OpenBrowserAbility(String url) {
		this.url = url;
	}

	public static OpenBrowserAbility onPage(String url) {
		return new OpenBrowserAbility(url);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		openAt(url);
	}
}
