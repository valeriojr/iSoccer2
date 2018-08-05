package Exceptions;

import javax.swing.*;

public class InvalidFieldException extends Exception {
    public InvalidFieldException(String message){
        super(message);
        JOptionPane.showMessageDialog(null, String.format("Campo %s inválido" , message),
                "Error", JOptionPane.ERROR_MESSAGE);
    }
}
