package Testing;

import Control.*;
import Exceptions.NullUserInformationException;
import Model.Data.*;
import Model.Employee;
import Model.Jobs.Player;
import View.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class EmployeeRegisterForm extends CompoundForm {

    private JButton registerButton;

    public EmployeeRegisterForm(){
        super();
        addForm("Personal", new PersonalDataForm());
        addForm("Professional", new ProfessionalDataForm());
        addForm("Contact", new ContactForm());
        addForm("Address", new AddressForm());

        ProfessionalDataForm professionalDataForm = (ProfessionalDataForm) getForm("Professional");

        ((JComboBox<Employee.Job>)professionalDataForm.getComponent(ProfessionalData.JOB))
                .addItemListener(new ComboBoxItemListener());

        registerButton = new JButton("Cadastrar");
        registerButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        registerButton.addActionListener(new ButtonListener());

        mainPanel.add(new JLabel("Registrar Funcionário"), BorderLayout.NORTH);
        mainPanel.add(registerButton, BorderLayout.SOUTH);
    }

    public class ButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            try {
                PersonalData personalData = new PersonalDataFormController(
                        (PersonalDataForm) getForm("Personal")).getPersonalData();

                ProfessionalData professionalData = new ProfessionalDataFormController(
                        (ProfessionalDataForm) getForm("Professional")).getProfessionalData();

                Contact contact = new ContactFormController(
                        (ContactForm) getForm("Contact")).getContact();

                Address address = new AddressFormController(
                        (AddressForm) getForm("Address")).getAddress();

                Employee employee = new Employee(personalData, address, contact, professionalData);

                switch (professionalData.getJob()){
                    case DOCTOR:
                        break;
                    case DRIVER:
                        break;
                    case PLAYER:
                        PlayerData playerData = new PlayerDataFormController(
                                (PlayerDataForm) getForm("Player Data")).getPlayerData();

                        employee = new Player(employee, playerData);
                        break;
                }

                System.out.println(employee);

            }catch(NullUserInformationException e){
                e.printStackTrace();
            }
        }
    }

    public class ComboBoxItemListener implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent itemEvent) {
            if(itemEvent.getStateChange() == ItemEvent.SELECTED){
                switch((Employee.Job) itemEvent.getItem()){
                    case DOCTOR:
                        addForm("Doctor Data", new DoctorDataForm());
                        break;
                    case DRIVER:
                        addForm("Driver Data", new DriverDataForm());
                        break;
                    case PLAYER:
                        addForm("Player Data", new PlayerDataForm());
                        break;
                }
            }else{
                switch((Employee.Job) itemEvent.getItem()) {
                    case DOCTOR:
                        removeForm("Doctor Data");
                        break;
                    case DRIVER:
                        removeForm("Driver Data");
                        break;
                    case PLAYER:
                        removeForm("Player Data");
                        break;
                }
            }
            mainPanel.revalidate();
            mainPanel.repaint();
        }
    }
}
