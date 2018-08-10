package Testing;

import View.StadiumDataForm;

public class StadiumRegisterForm extends CompoundForm{
    public StadiumRegisterForm(){
        super();
        addForm("Stadium", new StadiumDataForm());
    }
}
