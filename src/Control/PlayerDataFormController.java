package Control;

import Exceptions.EmptyFieldException;
import Model.Data.User.PlayerData;
import View.PlayerDataForm;
import Model.Jobs.Player;

import javax.swing.*;

public class PlayerDataFormController {
    PlayerDataForm playerDataForm;

    public PlayerDataFormController(PlayerDataForm playerDataForm){
        this.playerDataForm = playerDataForm;
    }

    public PlayerData getPlayerData(){
        try{
            Player.Position position = (Player.Position) ((JComboBox<Player.Position>) playerDataForm
                    .getComponent(PlayerData.POSITION)).getSelectedItem();
            int number = Integer.parseInt(playerDataForm.getString(PlayerData.NUMBER));
            Player.Situation situation = (Player.Situation) ((JComboBox<Player.Situation>) playerDataForm
                    .getComponent(PlayerData.SITUATION)).getSelectedItem();

            return new PlayerData(number, position, situation);
        } catch(EmptyFieldException e){
            e.printStackTrace();
        }

        return null;
    }
}
