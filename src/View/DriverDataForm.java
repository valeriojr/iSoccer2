package View;

import Model.Data.DriverData;
import View.Form;

import javax.swing.*;

public class DriverDataForm extends Form {
    public DriverDataForm(){
        addComponent(DriverData.CNH, new JTextField(), DriverData.CNH);
    }
}

