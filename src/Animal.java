public class Animal {//ex1
    protected String nume = "";
    protected String culoare = "";
    protected boolean vegetarian = "";

    Animal(){//ex 2
        nume = "unknown";
        culoare = "unknown";
        vegetarian = false;

    }

    public Animal(String nume, String culoare, boolean vegetarian) {//ex3
        this.nume = nume;
        this.culoare = culoare;
        this.vegetarian = vegetarian;
    }

    public Animal(String nume, boolean vegetarian) {
        this.nume = nume;
        this.vegetarian = vegetarian;
    }

    public String getNume() {//ex 4
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public void mananca () {//ex 5
        System.out.println(nume + "mananca");
    }
    public void doarme (){
        System.out.println(nume + "doarme");

    }
    public String afiseaza (){//ex 6
        return nume + "are culoarea" + culoare;
    }
}
