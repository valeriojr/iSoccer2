package Testing;

import Exceptions.NullUserInformationException;
import UserInformation.Controller.*;
import UserInformation.View.*;
import UserTypes.Employee;
import UserTypes.Supporter;

import javax.swing.*;
import java.awt.*;

public class SupporterRegisterForm {

    public static void main(String args[]){

        JFrame frame = new JFrame();

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        final PersonalDataForm personalDataForm = new PersonalDataForm();
        final ContactForm contactForm = new ContactForm();
        final AddressForm addressForm = new AddressForm();
        final SupportDataForm supportDataForm = new SupportDataForm();

        JButton registerButton = new JButton("Cadastrar");
        registerButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        //TODO Change Listener
        registerButton.addActionListener(actionEvent -> {
            try{
                Supporter supporter = new Supporter(new PersonalDataFormController(personalDataForm).getPersonalData(),
                        new AddressFormController(addressForm).getAddress(),
                        new ContactFormController(contactForm).getContact(),
                        new SupportDataFormConroller(supportDataForm).getSupportData());

                System.out.println(supporter);
            }catch(NullUserInformationException e){
                e.printStackTrace();
            }
        });

        panel.add(personalDataForm);
        panel.add(contactForm);
        panel.add(addressForm);
        panel.add(supportDataForm);
        panel.add(registerButton);

        frame.getContentPane().add(panel, BorderLayout.NORTH);
        frame.setVisible(true);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
