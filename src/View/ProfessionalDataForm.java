package View;

import Model.Data.User.ProfessionalData;
import Model.Employee;

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
