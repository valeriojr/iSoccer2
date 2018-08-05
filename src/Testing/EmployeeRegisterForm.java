package Testing;

import UserInformation.Controller.AddressFormController;
import UserInformation.Controller.ContactFormController;
import UserInformation.Controller.PersonalDataFormController;
import UserInformation.Controller.ProfessionalDataFormController;
import UserInformation.Model.Address;
import UserInformation.Model.PersonalData;
import UserInformation.Model.ProfessionalData;
import UserInformation.View.AddressForm;
import UserInformation.View.ContactForm;
import UserInformation.View.PersonalDataForm;
import UserInformation.View.ProfessionalDataForm;
import UserTypes.Employee;
import View.Form;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeRegisterForm {

    public static void main(String[] args){

        JFrame frame = new JFrame();

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        final PersonalDataForm personalDataForm = new PersonalDataForm("Dados pessoais");
        final ProfessionalDataForm professionalDataForm = new ProfessionalDataForm("Dados profissionais");
        final ContactForm contactForm = new ContactForm("Contato");
        final AddressForm addressForm = new AddressForm("Endereço");

        JButton registerButton = new JButton("Cadastrar");
        registerButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Employee employee = new Employee(new PersonalDataFormController(personalDataForm).getPersonalData(),
                        new AddressFormController(addressForm).getAddress(),
                        new ContactFormController(contactForm).getContact(),
                        new ProfessionalDataFormController(professionalDataForm).getProfessionalData());
            }
        });

        panel.add(personalDataForm);
        panel.add(professionalDataForm);
        panel.add(contactForm);
        panel.add(addressForm);
        panel.add(registerButton);

        frame.getContentPane().add(panel, BorderLayout.NORTH);
        frame.setVisible(true);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
