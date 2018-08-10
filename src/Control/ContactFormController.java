package Control;

import Exceptions.EmptyFieldException;
import Model.Data.User.Contact;
import View.ContactForm;

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
        } catch (EmptyFieldException e){
            e.printStackTrace();
        }

        return null;
    }
}
