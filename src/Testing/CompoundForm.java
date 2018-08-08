package Testing;

import View.Form;

import javax.swing.*;
import java.awt.*;
import java.util.Map;
import java.util.TreeMap;

public class CompoundForm {
    private Map<String, Form> forms;
    protected JPanel mainPanel, formPanel;
    private JScrollPane scrollPane;

    public CompoundForm(){
        forms = new TreeMap<String, Form>();
        mainPanel = new JPanel(new BorderLayout());
        formPanel = new JPanel();
        formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.PAGE_AXIS));
        mainPanel.add(formPanel, BorderLayout.CENTER);
        JPanel auxiliar = new JPanel(new BorderLayout());
        auxiliar.add(mainPanel, BorderLayout.NORTH);

        scrollPane = new JScrollPane(auxiliar);
    }

    public void addForm(String formName, Form form){
        forms.put(formName, form);
        formPanel.add(form);
    }

    public void removeForm(String formName){
        Form form = forms.get(formName);
        if(form != null){
            formPanel.remove(form);
            forms.remove(formName);
        }
    }

    public Form getForm(String formName){
        return forms.get(formName);
    }

    public JScrollPane getPanel(){
        return scrollPane;
    }
}
