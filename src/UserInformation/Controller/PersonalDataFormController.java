package UserInformation.Controller;

import Exceptions.EmptyFieldException;
import Exceptions.InvalidFieldException;
import UserInformation.Model.PersonalData;
import UserInformation.View.PersonalDataForm;

import javax.swing.*;
import javax.swing.text.DateFormatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.DataFormatException;

public class PersonalDataFormController {
    private PersonalDataForm personalDataForm;

    public PersonalDataFormController(PersonalDataForm personalDataForm){
        this.personalDataForm = personalDataForm;
    }

    public PersonalData getPersonalData(){
        try {
            String name, id;
            Date birthdate;

            name = personalDataForm.getString(PersonalData.NAME);
            id = personalDataForm.getString(PersonalData.ID);
            birthdate = new SimpleDateFormat("dd/MM/yyyy").parse(personalDataForm.getString(PersonalData.BIRTHDATE));

            if(name.isEmpty()){
                throw new EmptyFieldException(PersonalData.NAME);
            }
            if(id.isEmpty()){
                throw new EmptyFieldException(PersonalData.ID);
            }
            if(birthdate == null) {
                throw new EmptyFieldException(PersonalData.BIRTHDATE);
            }
            if(!id.matches(PersonalData.ID_REGEX)){
                throw new InvalidFieldException(PersonalData.ID + " inválido!");
            }

            PersonalData personalData = new PersonalData(name, id, birthdate);

            System.out.println(personalData);

            return personalData;

        } catch (ParseException parseException){
            JOptionPane.showMessageDialog(personalDataForm, "Data de nascimento inválida!");
        } catch (InvalidFieldException | EmptyFieldException fieldException) {
            fieldException.printStackTrace();
        }

        return null;
    }
}
