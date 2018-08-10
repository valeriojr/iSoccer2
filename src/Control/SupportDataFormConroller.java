package Control;

import Exceptions.EmptyFieldException;
import Exceptions.NullUserInformationException;
import Model.Data.SupportData;
import View.SupportDataForm;

public class SupportDataFormConroller {
    private SupportDataForm supportDataForm;

    public SupportDataFormConroller(SupportDataForm supportDataForm) {
        this.supportDataForm = supportDataForm;
    }

    public SupportData getSupportData() throws NullUserInformationException {
        try{
            String type = supportDataForm.getItem(SupportData.TYPE);

            return new SupportData(SupportData.Type.valueOf(type));
        }catch(EmptyFieldException e){
            e.printStackTrace();
        }

        throw new NullUserInformationException("Erro ao cadastrar sócio torcedor");
    }
}
