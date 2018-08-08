import Testing.EmployeeRegisterForm;

import javax.swing.*;
import java.awt.*;

public class iSoccer {
    private JFrame frame;

    public iSoccer(){
        initializeFrame();
        EmployeeRegisterForm employeeRegisterForm = new EmployeeRegisterForm();
        frame.add(employeeRegisterForm.getPanel(), BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private void initializeFrame(){
        frame = new JFrame();
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());
    }

    public static void main(String args[]){
        new iSoccer();
    }
}
