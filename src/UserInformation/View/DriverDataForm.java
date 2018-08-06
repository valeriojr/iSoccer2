package UserInformation.View;

import UserInformation.Model.DriverData;
import View.Form;

import javax.swing.*;

public class DriverDataForm extends Form {
    public DriverDataForm(){
        addComponent(DriverData.CNH, new JTextField(), DriverData.CNH);
    }
}

