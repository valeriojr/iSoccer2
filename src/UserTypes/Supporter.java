package UserTypes;

import UserInformation.Model.Address;
import UserInformation.Model.Contact;
import UserInformation.Model.PersonalData;

public class Supporter extends Person {

    public Supporter(PersonalData personalData, Address address, Contact contact) {
        super(personalData, address, contact);
    }

    public String toString(){
        return super.toString();
    }
}
