package Control;

import Exceptions.NullUserInformationException;
import Model.Data.User.SupportData;
import View.SupportDataForm;

import javax.swing.*;

public class SupportDataFormConroller {
    private SupportDataForm supportDataForm;

    public SupportDataFormConroller(SupportDataForm supportDataForm) {
        this.supportDataForm = supportDataForm;
    }

    public SupportData getSupportData() throws NullUserInformationException {
        JComboBox<SupportData.Type> supporterType = (JComboBox<SupportData.Type>) supportDataForm.getComponent(SupportData.TYPE);
        return new SupportData((SupportData.Type) supporterType.getSelectedItem());
    }
}
