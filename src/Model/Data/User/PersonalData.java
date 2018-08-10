package Model.Data.User;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonalData {
    public static final String NAME = "Nome completo",
                               ID = "CPF",
                               BIRTHDATE = "Data de nascimento",
                               ID_REGEX = "[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}";

    private String name, id;
    private Date birthdate;

    public PersonalData(String name, String id, Date birthdate){
        this.name = name;
        this.id = id;
        this.birthdate = birthdate;
    }

    public String toString(){
        return String.format("%s: %s\n%s: %s\n%s: %s\n", NAME, name, ID, id, BIRTHDATE,
                new SimpleDateFormat("dd/MM/yyyy").format(birthdate));
    }
}
