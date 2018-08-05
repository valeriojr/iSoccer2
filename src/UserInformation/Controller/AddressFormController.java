package UserInformation.Controller;

import Exceptions.EmptyFieldException;
import Exceptions.InvalidFieldException;
import Exceptions.NullUserInformationException;
import UserInformation.Model.Address;
import UserInformation.View.AddressForm;
import View.Form;

public class AddressFormController {
    private AddressForm addressForm;

    public AddressFormController(AddressForm addressForm){
        this.addressForm = addressForm;
    }

    public Address getAddress() throws NullUserInformationException {
        try {
            String address, city, state, country;
            Form localization = (Form) addressForm.getComponent("localization");

            address = addressForm.getString(Address.ADDRESS);
            city = localization.getString(Address.CITY);
            state = localization.getString(Address.STATE);
            country = localization.getString(Address.COUNTRY);

            String fields[][] = {{Address.ADDRESS, address},
                                 {Address.CITY, city},
                                 {Address.STATE, state},
                                 {Address.COUNTRY, country}};
            int label = 0;
            int content = 1;

            for(String[] s : fields){
                if(s[content].isEmpty()){
                    throw new EmptyFieldException(s[label]);
                }
                if(!s[content].matches("[A-Za-záãâéêíóôúç0-9\\s-º]{1,}")){
                    throw new InvalidFieldException(s[label]);
                }
            }

            return new Address(address, city, state, country);

        } catch (InvalidFieldException | EmptyFieldException exception){
            exception.printStackTrace();
        }

        throw new NullUserInformationException("Erro ao criar usuário");
    }
}
