package Control;

import Exceptions.EmptyFieldException;
import Exceptions.InvalidFieldException;
import Model.Data.Resources.StadiumData;
import View.StadiumDataForm;

import javax.swing.*;

public class StadiumDataFormController {
    private StadiumDataForm stadiumDataForm;

    public StadiumDataFormController(StadiumDataForm stadiumDataForm){
        this.stadiumDataForm = stadiumDataForm;
    }

    public StadiumData getStadiumData(){
        try {
            int wcCount = Integer.parseInt(stadiumDataForm.getString(StadiumData.WC_COUNT));
            int snackBarCount = Integer.parseInt(stadiumDataForm.getString(StadiumData.SNACK_BAR_COUNT));
            int capacity = Integer.parseInt(stadiumDataForm.getString(StadiumData.CAPACITY));
            return new StadiumData(wcCount, snackBarCount, capacity);
        }catch(EmptyFieldException e){
            e.printStackTrace();
        }catch (NumberFormatException n){
            JOptionPane.showMessageDialog(null, "Número inválido");
        }
        return null;
    }
}
