package UserInformation.View;

import UserInformation.Model.Contact;
import View.Form;

import javax.swing.*;

public class ContactForm extends Form {

    public ContactForm(String title) {
        super(title);
    }

    @Override
    public void initializeComponents() {
        super.initializeComponents();

        addComponent(Contact.EMAIL, new JTextField(), Contact.EMAIL);
        addComponent(Contact.PHONE, new JTextField(), Contact.PHONE);
    }
}
