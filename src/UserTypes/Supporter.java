package UserTypes;

import UserInformation.Model.Address;
import UserInformation.Model.Contact;
import UserInformation.Model.PersonalData;
import UserInformation.Model.SupportData;

public class Supporter extends Person {
    private SupportData supportData;

    public Supporter(PersonalData personalData, Address address, Contact contact, SupportData supportData) {
        super(personalData, address, contact);
        this.supportData = supportData;
    }

    public String toString(){
        return super.toString() + supportData.toString();
    }
}
