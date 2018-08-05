package Testing;

import javax.swing.*;
import java.awt.*;

public class CardLayoutTest {
    public static void main(String[] args){
        JFrame frame = new JFrame();

        JToolBar toolBar = new JToolBar();
        toolBar.add(new JButton("Gerenciar funcionários"));
        toolBar.add(new JButton("Gerenciar sócios torcedores"));
        toolBar.add(new JButton("Gerenciar recursos fśsicos"));
        toolBar.add(new JButton("Gerar relatórios"));
        toolBar.add(new JButton("Sair"));
        frame.add(toolBar, BorderLayout.SOUTH);

        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}
