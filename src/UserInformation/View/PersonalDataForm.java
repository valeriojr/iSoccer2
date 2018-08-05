package UserInformation.View;

import UserInformation.Model.PersonalData;
import View.Form;

import javax.swing.*;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class PersonalDataForm extends Form {
    public PersonalDataForm(String title){
        super(title);
    }

    @Override
    public void initializeComponents() {
        super.initializeComponents();

        addComponent(PersonalData.NAME, new JTextField(), PersonalData.NAME);
        try {
            JFormattedTextField idFormatted = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
            JFormattedTextField dateFormatted = new JFormattedTextField(new MaskFormatter("##/##/####"));

            idFormatted.setFocusLostBehavior(JFormattedTextField.PERSIST);
            dateFormatted.setFocusLostBehavior(JFormattedTextField.PERSIST);

            addComponent(PersonalData.ID, idFormatted, PersonalData.ID);
            addComponent(PersonalData.BIRTHDATE, dateFormatted, PersonalData.BIRTHDATE);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
