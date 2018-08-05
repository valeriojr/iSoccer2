package UserTypes;

import UserInformation.Model.Address;
import UserInformation.Model.Contact;
import UserInformation.Model.PersonalData;
import UserInformation.Model.ProfessionalData;

public class Employee extends Person {
    private ProfessionalData professionalData;

    public Employee(PersonalData personalData, Address address, Contact contact, ProfessionalData professionalData) {
        super(personalData, address, contact);
        this.professionalData = professionalData;
    }

    public String toString(){
        return super.toString() + this.professionalData.toString();
    }
}
