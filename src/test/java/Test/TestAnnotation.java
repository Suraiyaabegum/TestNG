package Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestAnnotation {
	

	@FindBy (id="username") WebElement userNameTxt;  //use @FindBy +pass the information

}
