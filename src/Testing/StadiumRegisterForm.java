package Testing;

import Control.StadiumDataFormController;
import Model.Data.Resources.StadiumData;
import View.StadiumDataForm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StadiumRegisterForm extends CompoundForm{
    private JButton addButton;

    public StadiumRegisterForm(){
        super();
        addForm("Stadium", new StadiumDataForm());

        addButton = new JButton("Adicionar");
        addButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                StadiumData stadium = new StadiumDataFormController((StadiumDataForm) getForm("Stadium")).getStadiumData();
                System.out.println(stadium);
            }
        });

        mainPanel.add(addButton, BorderLayout.SOUTH);
    }
}
