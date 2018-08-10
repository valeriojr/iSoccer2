package View;

import Model.Data.Contact;
import View.Form;

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
