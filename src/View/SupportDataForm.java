package View;

import Model.Data.User.SupportData;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class SupportDataForm extends Form {
    public SupportDataForm() {
        super("Contribuição");

        JComboBox<SupportData.Type> typeCB = new JComboBox<SupportData.Type>(SupportData.Type.values());
        final JLabel contributionValue = new JLabel(String.format("%s: %.2f R$", SupportData.CONTRIBUTION,
                SupportData.getContribution((SupportData.Type) typeCB.getSelectedItem())));

        typeCB.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                SupportData.Type type = (SupportData.Type) itemEvent.getItem();
                contributionValue.setText(String.format("%s: %.2f R$\n", SupportData.CONTRIBUTION,
                        SupportData.getContribution(type)));
            }
        });

        setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));


        addComponent(SupportData.TYPE, typeCB, SupportData.TYPE);

        addComponent(SupportData.CONTRIBUTION, contributionValue);
    }
}
