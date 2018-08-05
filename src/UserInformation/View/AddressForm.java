package UserInformation.View;

import UserInformation.Model.Address;
import View.Form;

import javax.swing.*;

public class AddressForm extends Form {
    public AddressForm(String title) {
        super(title);
    }

    @Override
    public void initializeComponents() {
        super.initializeComponents();

        Form localization = new Form("");
        localization.setLayout(new BoxLayout(localization, BoxLayout.LINE_AXIS));

        addComponent(Address.ADDRESS, new JTextField());
        localization.addComponent(Address.CITY, new JTextField(), Address.CITY);
        localization.addComponent(Address.STATE, new JTextField(), Address.STATE);
        localization.addComponent(Address.COUNTRY, new JTextField(), Address.COUNTRY);
        addComponent("localization", localization);
    }
}
