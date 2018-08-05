package UserTypes.Jobs;

import UserInformation.Model.Address;
import UserInformation.Model.Contact;
import UserInformation.Model.PersonalData;
import UserInformation.Model.ProfessionalData;
import UserTypes.Employee;

public class Player extends Employee {

    public Player(PersonalData personalData, Address address, Contact contact, ProfessionalData professionalData) {
        super(personalData, address, contact, professionalData);
    }
}
