public class Inotator extends  Sportiv {
    public Inotator(String name, String tara) { //constructor - code, generate
        super(name, tara);
    }

    @Override
    void seAntreneaza() {
        System.out.println("Inotatorul se antreneaza");
    }

    public void seOdihneste(){
        System.out.println("Inotatorul se odihneste");
    }
}
