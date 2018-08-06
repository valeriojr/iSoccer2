package UserInformation.View;

import UserInformation.Model.DoctorData;
import View.Form;

import javax.swing.*;

public class DoctorDataForm extends Form {
    public DoctorDataForm(){
        addComponent(DoctorData.CRM, new JTextField(), DoctorData.CRM);
    }
}
