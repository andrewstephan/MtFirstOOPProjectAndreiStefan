abstract class Sportiv {

    String name; //atribut - nume
    String tara;

    public Sportiv(String name, String tara) {
        this.name = name;
        this.tara = tara;
    }

    //abstract method has no implementation in parent but must be implemented in child
    abstract void seAntreneaza(); // o metoda abstracta
    public void seOdihneste(){
        System.out.println("Sportivul se odihneste");
    }

}
