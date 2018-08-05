package UserInformation.Controller;

import Exceptions.EmptyFieldException;
import UserInformation.Model.ProfessionalData;
import UserInformation.View.ProfessionalDataForm;

public class ProfessionalDataFormController {

    private ProfessionalDataForm professionalDataForm;

    public ProfessionalDataFormController(ProfessionalDataForm professionalDataForm){
        this.professionalDataForm = professionalDataForm;
    }

    public ProfessionalData getProfessionalData() {
        try{
            float salary;
            String job;

            salary = Float.parseFloat(professionalDataForm.getString(ProfessionalData.SALARY));
            job = professionalDataForm.getItem(ProfessionalData.JOB);

            return new ProfessionalData(salary, job);
        } catch (NumberFormatException | EmptyFieldException e){
            e.printStackTrace();
        }

        return null;
    }
}
