package View;

import Model.Data.User.Address;

import javax.swing.*;

public class AddressForm extends Form {
    public AddressForm() {
        super("Endereço");
    }

    @Override
    public void initializeComponents() {
        super.initializeComponents();

        Form localization = new Form();
        localization.setLayout(new BoxLayout(localization, BoxLayout.LINE_AXIS));

        addComponent(Address.ADDRESS, new JTextField());
        localization.addComponent(Address.CITY, new JTextField(), Address.CITY);
        localization.addComponent(Address.STATE, new JTextField(), Address.STATE);
        localization.addComponent(Address.COUNTRY, new JTextField(), Address.COUNTRY);
        addComponent("localization", localization);
    }
}
