package Model;

import Model.Data.User.Address;
import Model.Data.User.Contact;
import Model.Data.User.PersonalData;
import Model.Data.User.ProfessionalData;

public class Employee extends Person {
    public enum Job {
        LAWYER("Advogado"),
        COOK("Cozinheiro"),
        PLAYER("Jogador"),
        DOCTOR("Médico"),
        DRIVER("Motorista"),
        TRAINER("Preparador físico"),
        COACH("Técnico"),
        PRESIDENT("Presidente");

        private String name;

        Job(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    private ProfessionalData professionalData;

    public Employee(PersonalData personalData, Address address, Contact contact, ProfessionalData professionalData) {
        super(personalData, address, contact);
        this.professionalData = professionalData;
    }

    public String toString(){
        return super.toString() + this.professionalData.toString();
    }

    public ProfessionalData getProfessionalData() {
        return professionalData;
    }
}

