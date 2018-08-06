package UserInformation.View;

import UserInformation.Model.ProfessionalData;
import UserTypes.Employee;
import View.Form;

import javax.swing.*;

public class ProfessionalDataForm extends Form {

    public ProfessionalDataForm(){
        super("Dados profissionais");
    }

    @Override
    public void initializeComponents() {
        super.initializeComponents();
        addComponent(ProfessionalData.JOB, new JComboBox<Employee.Job>(Employee.Job.values()), ProfessionalData.JOB);
        addComponent(ProfessionalData.SALARY, new JTextField(), ProfessionalData.SALARY);
    }
}
