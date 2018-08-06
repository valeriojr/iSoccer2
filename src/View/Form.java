package View;

import Exceptions.EmptyFieldException;
import Exceptions.InvalidFieldException;

import javax.swing.*;
import javax.swing.border.Border;
import java.util.Map;
import java.util.TreeMap;

public class Form extends JPanel{
    protected String title = "";

    private Map<String, JComponent> components;

    public Form(String title) {
        components = new TreeMap<String, JComponent>();
        this.title = title;
        initializeComponents();
    }

    public Form() {
        components = new TreeMap<String, JComponent>();
        initializeComponents();
    }

    public void addComponent(String componentName, JComponent component){
        this.components.put(componentName, component);
        this.add(component);
    }

    /*
    * Adds the component with a TitledBorder
     */
    public void addComponent(String componentName, JComponent component, String componentLabel){
        component.setBorder(BorderFactory.createTitledBorder(componentLabel));
        this.components.put(componentName, component);
        this.add(component);
    }

    public void removeComponent(String componentName){
        JComponent component = this.components.get(componentName);
        if(component != null) {
            this.components.remove(componentName);
            this.remove(component);
        }
    }

    public JComponent getComponent(String componentName){
        return components.get(componentName);
    }

    public String getString(String componentName) throws EmptyFieldException {
        String input = ((JTextField) components.get(componentName)).getText();
        if(input.isEmpty()){
            throw new EmptyFieldException(componentName);
        }

        return input;
    }

    public String getItem(String componentName) throws EmptyFieldException{
        String input = ((JComboBox<String>) components.get(componentName)).getSelectedItem().toString();
        if(input != null && input.isEmpty()){
            throw new EmptyFieldException(componentName);
        }

        return input;
    }

    public void initializeComponents() {
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        if (title != null){
            setBorder(BorderFactory.createTitledBorder(title));
        }
    }
}
