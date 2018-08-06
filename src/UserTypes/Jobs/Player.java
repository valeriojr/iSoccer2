package UserTypes.Jobs;

import UserInformation.Model.*;
import UserTypes.Employee;

public class Player extends Employee {


    public enum Position {
        GOALKEEPER("Goleiro"),
        DEFENDER("Zagueiro"),
        MIDFIELDER("Meia"),
        SWEEPER("Volante"),
        LEFT_BACK("Lateral direito"),
        CENTER_FORWARD("Centroavante"),
        FORWARD("Atacante");

        private String name;

        Position(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    private PlayerData playerData;

    public Player(PersonalData personalData, Address address, Contact contact, ProfessionalData professionalData,
                  PlayerData playerData) {
        super(personalData, address, contact, professionalData);
        this.playerData = playerData;
    }

    public Player(Employee employee, PlayerData playerData) {
        super(employee.getPersonalData(), employee.getAddress(), employee.getContact(), employee.getProfessionalData());
        this.playerData = playerData;
    }

    @Override
    public String toString() {
        return super.toString() + playerData.toString();
    }
}
