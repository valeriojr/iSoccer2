package Exceptions;

import javax.swing.*;

public class EmptyFieldException extends Exception{
    public EmptyFieldException(String message){
        super(message);

        JOptionPane.showMessageDialog(null, String.format("Campo \"%s\" vazio!", message), "Error",
                JOptionPane.ERROR_MESSAGE);
    }
}
