package UserInformation.Model;

public class Contact {

    public static final String EMAIL = "Endereço de e-mail",
                               PHONE = "Número do telefone";

    private String email, phone;

    public Contact(String email, String phone){
        this.email = email;
        this.phone = phone;
    }
}
