package br.com.rodrigo.solid.dip;

public class AddGroupValidationComposite implements Validation {
	
	private RequiredFieldValidation requiredFieldValidation;
	private PhoneValidation phoneValidation;
 	
	public  AddGroupValidationComposite(RequiredFieldValidation requiredFieldValidation, PhoneValidation phoneValidation) {
		this.requiredFieldValidation = requiredFieldValidation;
		this.phoneValidation = phoneValidation;
	}
	
	@Override
	public boolean validate() {
		return false;
	}

}
