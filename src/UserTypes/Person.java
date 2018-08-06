package UserTypes;

import UserInformation.Model.Address;
import UserInformation.Model.Contact;
import UserInformation.Model.PersonalData;

public class Person {
    private PersonalData personalData;
    private Contact contact;
    private Address address;

    public Person(PersonalData personalData, Address address, Contact contact){
        this.personalData = personalData;
        this.contact = contact;
        this.address = address;
    }

    public String toString(){
        return this.personalData.toString() + this.contact.toString() + this.address.toString();
    }

    public PersonalData getPersonalData() {
        return personalData;
    }

    public Address getAddress() {
        return address;
    }

    public Contact getContact() {
        return contact;
    }
}
