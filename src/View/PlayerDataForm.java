package View;

import Model.Data.User.PlayerData;
import Model.Jobs.Player;

import javax.swing.*;

public class PlayerDataForm extends Form {
    public PlayerDataForm() {
        super("Dados do jogador");

        String componentNames[] = {PlayerData.POSITION, PlayerData.NUMBER, PlayerData.SITUATION, PlayerData.GOALS,
                PlayerData.YELLOW_CARDS, PlayerData.RED_CARDS};
        JComponent components[] = {new JComboBox<Player.Position>(Player.Position.values()), new JTextField(),
                                   new JComboBox<Player.Situation>(Player.Situation.values()), new JTextField(), new JTextField(), new JTextField()};

        for(int i = 0;i < componentNames.length;i++){
            addComponent(componentNames[i], components[i], componentNames[i]);
        }
    }
}
