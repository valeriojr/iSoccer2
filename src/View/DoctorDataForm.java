package View;

import Model.Data.Doctor;
import View.Form;

import javax.swing.*;

public class DoctorDataForm extends Form {
    public DoctorDataForm(){
        addComponent(Doctor.CRM, new JTextField(), Doctor.CRM);
    }
}
