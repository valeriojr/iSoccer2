package UserInformation.View;

import UserInformation.Model.ProfessionalData;
import View.Form;

import javax.swing.*;

public class ProfessionalDataForm extends Form {

    public ProfessionalDataForm(String title){
        super(title);
    }

    @Override
    public void initializeComponents() {
        super.initializeComponents();
        addComponent(ProfessionalData.JOB, new JComboBox<String>(new String[]{"Advogado", "Cozinheiro", "Jogador",
                "Médico", "Motorista", "Preparador Físico", "Presidente"}), ProfessionalData.JOB);
        addComponent(ProfessionalData.SALARY, new JTextField(), ProfessionalData.SALARY);
    }
}
