package Model.Data;

import Model.Jobs.Player;

import java.util.Map;
import java.util.TreeMap;

public class PlayerData {
    public static final String POSITION = "Posição",
                               NUMBER = "Número",
                               GOALS = "Gols",
                               YELLOW_CARDS = "Cartões amarelos",
                               RED_CARDS = "Cartões vermelhos",
                               SITUATION = "Situação";

    private Map<String, Integer> statistics;
    private Player.Position position;
    private Player.Situation situation;

    public PlayerData(int number, Player.Position position, Player.Situation situation){
        this.statistics = new TreeMap<String, Integer>();
        this.position = position;
        this.situation = situation;
    }

    public void addStatistic(String key, int value){
        statistics.put(key, value);
    }

    @Override
    public String toString() {
        String s = "";

        s = s.concat(String.format("%s: %s\n%s: %s\n", POSITION, position, SITUATION, situation));

        for(Map.Entry<String, Integer> e : statistics.entrySet()){
            s = s.concat(String.format("%s: %d\n", e.getKey(), e.getValue()));
        }

        return s;
    }
}
