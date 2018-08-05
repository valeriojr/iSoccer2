package Exceptions;

import javax.swing.*;

public class InvalidFieldException extends Exception {
    public InvalidFieldException(String message){
        super(message);
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
