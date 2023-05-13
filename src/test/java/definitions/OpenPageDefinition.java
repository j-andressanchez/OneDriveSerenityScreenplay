package definitions;

import Tasks.OpenPageTask;
import io.cucumber.java.en.Given;

public class OpenPageDefinition {
	
	OpenPageTask openPageTask;
	
	@Given("abra la pagina de One Drive")
	public void openPage() {
		OpenPageTask openPageTask = new OpenPageTask("Automation", "https://www.onedrive.com");
		openPageTask.openPage();
    }

}
