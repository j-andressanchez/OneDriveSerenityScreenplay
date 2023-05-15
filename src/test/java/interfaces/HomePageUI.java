package interfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class HomePageUI extends PageObject{
	
	private final By BOTON_LOGIN = By.xpath("//a[@aria-label='Iniciar sesión en tu cuenta'][1]");
	
	public By getBotonLogin() {
		return BOTON_LOGIN;
	}

}
