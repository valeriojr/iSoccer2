package UserInformation.Controller;

import Exceptions.EmptyFieldException;
import UserInformation.Model.ProfessionalData;
import UserInformation.View.ProfessionalDataForm;
import UserTypes.Employee;

import javax.swing.*;

public class ProfessionalDataFormController {

    private ProfessionalDataForm professionalDataForm;

    public ProfessionalDataFormController(ProfessionalDataForm professionalDataForm){
        this.professionalDataForm = professionalDataForm;
    }

    public ProfessionalData getProfessionalData() {
        try{
            float salary;
            Employee.Job job;

            salary = Float.parseFloat(professionalDataForm.getString(ProfessionalData.SALARY));
            job = (Employee.Job) ((JComboBox<Employee.Job>) professionalDataForm.getComponent(ProfessionalData.JOB))
                    .getSelectedItem();

            return new ProfessionalData(salary, job);
        } catch (NumberFormatException | EmptyFieldException e){
            e.printStackTrace();
        }

        return null;
    }
}
