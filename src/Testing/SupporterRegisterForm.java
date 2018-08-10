package Testing;

import Control.*;
import Exceptions.NullUserInformationException;
import Model.Data.User.Address;
import Model.Data.User.Contact;
import Model.Data.User.PersonalData;
import Model.Data.User.SupportData;
import Model.Supporter;
import View.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SupporterRegisterForm extends CompoundForm{

    private JButton registerButton;

    public SupporterRegisterForm(){
        super();
        addForm("Personal", new PersonalDataForm());
        addForm("Support", new SupportDataForm());
        addForm("Contact", new ContactForm());
        addForm("Address", new AddressForm());

        registerButton = new JButton("Cadastrar");
        registerButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        registerButton.addActionListener(new ButtonListener());

        mainPanel.add(new JLabel("Cadastrar Sócio torcedor"), BorderLayout.NORTH);
        mainPanel.add(registerButton, BorderLayout.SOUTH);
    }

    public class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            try {
                PersonalData personalData = new PersonalDataFormController(
                        (PersonalDataForm) getForm("Personal")).getPersonalData();

                SupportData supportData = new SupportDataFormConroller(
                        (SupportDataForm) getForm("Support")).getSupportData();

                Contact contact = new ContactFormController(
                        (ContactForm) getForm("Contact")).getContact();

                Address address = new AddressFormController(
                        (AddressForm) getForm("Address")).getAddress();

                Supporter supporter = new Supporter(personalData, address, contact, supportData);

                System.out.println(supporter);

            }catch(NullUserInformationException e){
                e.printStackTrace();
            }
        }
    }
}
