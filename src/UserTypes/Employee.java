package UserTypes;

import UserInformation.Model.Address;
import UserInformation.Model.Contact;
import UserInformation.Model.PersonalData;
import UserInformation.Model.ProfessionalData;

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

