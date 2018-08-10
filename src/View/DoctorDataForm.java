package View;

import Model.Data.DoctorData;

import javax.swing.*;

public class DoctorDataForm extends Form {
    public DoctorDataForm(){
        addComponent(DoctorData.CRM, new JTextField(), DoctorData.CRM);
    }
}
