package UserInformation.Controller;

import UserInformation.Model.Contact;
import UserInformation.View.ContactForm;

public class ContactFormController {
    private ContactForm contactForm;

    public ContactFormController(ContactForm contactForm){
        this.contactForm = contactForm;
    }

    public Contact getContact(){
        try{
            String email, phone;

            email = contactForm.getString(Contact.EMAIL);
            phone = contactForm.getString(Contact.PHONE);

            //TODO InvalidFieldException handling

            return new Contact(email, phone);
        } catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }
}
