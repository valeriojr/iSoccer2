package View;

import Model.Data.User.Contact;

import javax.swing.*;

public class ContactForm extends Form {

    public ContactForm() {
        super("Contato");
    }

    @Override
    public void initializeComponents() {
        super.initializeComponents();

        addComponent(Contact.EMAIL, new JTextField(), Contact.EMAIL);
        addComponent(Contact.PHONE, new JTextField(), Contact.PHONE);
    }
}
