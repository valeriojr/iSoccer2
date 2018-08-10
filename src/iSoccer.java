import Testing.CompoundForm;
import Testing.EmployeeRegisterForm;
import Testing.StadiumRegisterForm;
import Testing.SupporterRegisterForm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class iSoccer {
    private JFrame frame;

    public enum Panel{
        EMPLOYEE("Funcionário"),
        SUPPORTER("Sócio torcedor"),
        STADIUM("Estádio");

        private String name;

        Panel(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    JComboBox<Panel> panelComboBox;

    public iSoccer(){
        initializeFrame();
        frame.setVisible(true);
    }

    private void initializeFrame(){
        frame = new JFrame();
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        panelComboBox = new JComboBox<>(Panel.values());
        panelComboBox.addItemListener(new PanelComboBoxListener());
        panelComboBox.setSelectedIndex(-1);
        frame.getContentPane().removeAll();
        //frame.getContentPane().add(new EmployeeRegisterForm().getPanel(), BorderLayout.CENTER);
        frame.getContentPane().add(panelComboBox, BorderLayout.NORTH);
    }

    public static void main(String args[]){
        new iSoccer();
    }

    public class PanelComboBoxListener implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent itemEvent) {
            frame.getContentPane().removeAll();
            frame.getContentPane().add(panelComboBox, BorderLayout.NORTH);
            switch ((iSoccer.Panel) itemEvent.getItem()) {
                case EMPLOYEE:
                    frame.getContentPane().add(new EmployeeRegisterForm().getPanel(), BorderLayout.CENTER);
                    break;
                case SUPPORTER:
                    frame.getContentPane().add(new SupporterRegisterForm().getPanel(), BorderLayout.CENTER);
                    break;
                case STADIUM:
                    frame.getContentPane().add(new StadiumRegisterForm().getPanel(), BorderLayout.CENTER);
                    break;
            }

            frame.getContentPane().revalidate();
            frame.getContentPane().repaint();
        }
    }
}
