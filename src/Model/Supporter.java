package Model;

import Model.Data.User.Address;
import Model.Data.User.Contact;
import Model.Data.User.PersonalData;
import Model.Data.User.SupportData;

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
