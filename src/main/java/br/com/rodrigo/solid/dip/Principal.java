package br.com.rodrigo.solid.dip;

public class Principal {
	public void principal() {
	RequiredFieldValidation requiredFieldValidation = new RequiredFieldValidation();
	PhoneValidation phoneValidation  = new PhoneValidation();
	AddGroupValidationComposite composite = new AddGroupValidationComposite(requiredFieldValidation, phoneValidation);
	AddGroupController controller = new AddGroupController(composite);
	
	controller.add();
	}
}
