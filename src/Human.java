public class Human {
    private String email;
    private String address;

    public static  String planet; //planet este un atribut static

    public Human(String email, String address) {
        this.email = email;
        this.address = address;
    }

    public String getEmail() {
        return this.email;
    }

    public String getAddress(String adress) {
        return this.address;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String adress) {
        this.address = adress;
    }

    public void verify(){
        System.out.println("Verifies email");
    }
    public void sendEmail(){
        System.out.println("Send email");
    }
}
