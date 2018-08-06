package Testing;

import Exceptions.NullUserInformationException;
import UserInformation.Controller.*;
import UserInformation.Model.*;
import UserInformation.View.*;
import UserTypes.Employee;
import UserTypes.Jobs.Driver;
import UserTypes.Jobs.Player;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class EmployeeRegisterForm {
    private JFrame frame;
    private JPanel panel;

    private PersonalDataForm personalDataForm;
    private ProfessionalDataForm professionalDataForm;
    private ContactForm contactForm;
    private AddressForm addressForm;
    private PlayerDataForm playerDataForm;
    private DoctorDataForm doctorDataForm;
    private DriverDataForm driverDataForm;

    private JButton registerButton;

    public EmployeeRegisterForm(){
        frame = new JFrame();

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        personalDataForm = new PersonalDataForm();
        contactForm = new ContactForm();
        addressForm = new AddressForm();
        professionalDataForm = new ProfessionalDataForm();

        ((JComboBox<Employee.Job>)professionalDataForm.getComponent(ProfessionalData.JOB))
                .addItemListener(new ComboBoxItemListener());

        registerButton = new JButton("Cadastrar");
        registerButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        registerButton.addActionListener(new ButtonListener());

        panel.add(personalDataForm);
        panel.add(professionalDataForm);
        panel.add(contactForm);
        panel.add(addressForm);
    }

    public static void main(String[] args){
        EmployeeRegisterForm form = new EmployeeRegisterForm();
        form.panel.setMinimumSize(new Dimension(600, 1000));
        JScrollPane scrollPane = new JScrollPane(form.panel);
        form.frame.getContentPane().add(scrollPane, BorderLayout.NORTH);
        form.frame.getContentPane().add(form.registerButton, BorderLayout.SOUTH);
        form.frame.setVisible(true);
        form.frame.setSize(650, 650);
        form.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public class ButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            try {
                PersonalData personalData = new PersonalDataFormController(personalDataForm).getPersonalData();
                ProfessionalData professionalData = new ProfessionalDataFormController(professionalDataForm).getProfessionalData();
                Contact contact = new ContactFormController(contactForm).getContact();
                Address address = new AddressFormController(addressForm).getAddress();

                Employee employee = new Employee(personalData, address, contact, professionalData);

                switch (professionalData.getJob()){
                    case DOCTOR:
                        break;
                    case DRIVER:
                        break;
                    case PLAYER:
                        PlayerData playerData = new PlayerDataFormController(playerDataForm).getPlayerData();
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
                        doctorDataForm = new DoctorDataForm();
                        panel.add(doctorDataForm);
                        break;
                    case DRIVER:
                        driverDataForm = new DriverDataForm();
                        panel.add(driverDataForm);
                        break;
                    case PLAYER:
                        playerDataForm = new PlayerDataForm();
                        panel.add(playerDataForm);
                        break;
                }
            }else{
                switch((Employee.Job) itemEvent.getItem()) {
                    case DOCTOR:
                        panel.remove(doctorDataForm);
                        doctorDataForm = null;
                        break;
                    case DRIVER:
                        panel.remove(driverDataForm);
                        driverDataForm = null;
                        break;
                    case PLAYER:
                        panel.remove(playerDataForm);
                        playerDataForm = null;
                        break;
                }
            }
            panel.revalidate();
            panel.repaint();
        }
    }
}
