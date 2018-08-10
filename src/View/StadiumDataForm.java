package View;

import Model.Data.Resources.StadiumData;

import javax.swing.*;

public class StadiumDataForm extends Form{
    public StadiumDataForm(){
        addComponent(StadiumData.WC_COUNT, new JTextField(), StadiumData.WC_COUNT);
        addComponent(StadiumData.SNACK_BAR_COUNT, new JTextField(), StadiumData.SNACK_BAR_COUNT);
        addComponent(StadiumData.CAPACITY, new JTextField(), StadiumData.CAPACITY);
    }
}
