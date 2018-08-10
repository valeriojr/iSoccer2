package Control;

import Exceptions.EmptyFieldException;
import Model.Data.Resources.StadiumData;
import View.StadiumDataForm;

public class StadiumDataFormController {
    public StadiumDataFormController(StadiumDataForm stadiumDataForm){
        try {
            int wcCount = Integer.parseInt(stadiumDataForm.getString(StadiumData.WC_COUNT));
            int snackBarCount = Integer.parseInt(stadiumDataForm.getString(StadiumData.SNACK_BAR_COUNT));
            int capacity = Integer.parseInt(stadiumDataForm.getString(StadiumData.CAPACITY));
        }catch(EmptyFieldException e){
            e.printStackTrace();
        }
    }

    public StadiumData getStadiumData(){
        return new StadiumData(0, 0, 0);
    }
}
