public class Fotbalist extends Sportiv implements InterfataA{
    Abilitate abilitate;
    public Fotbalist(String name, String tara) {
        super(name, tara);
    }

    @Override
    void seAntreneaza() {

    }

    public void seOdihneste(){
        super.seOdihneste(); //daca scriem super, o sa ne dea metoda seodihneste din clasa Sportiv
        System.out.println("Dupa un meci dificil");
    }

    @Override
    public void metodaInterfataA() {

    }
}
