public class Main {

    public static void staticMethod1(){ //without return. face ceva dar nu returneaza
        System.out.println("static method1 (void) is called and calls method2");
        System.out.println("Method2 return is "+staticMethod2());
    }
    public static int staticMethod2(){ //with return. face ceva dar si returneaza
        System.out.println("Method2 does something");
        return 1+2; //executa linia si returneaza un int
    }

    public static void main(String[] args) {
        //creeaza un obiect din clasa DemoClass
        DemoClass obiect1 = new DemoClass(); //new este pentru obiect nou
        DemoClass obiect2 = new DemoClass();
        System.out.println(obiect1.x);
        System.out.println(obiect2.x);
        obiect1.x = 6;
        System.out.println(obiect1.x);
        System.out.println(obiect2.x);
        obiect1.afiseazaText();
        obiect2.text = "something else";
        System.out.println(obiect2.text);
        //DemoClass.afiseazaTextStatic();
        Human andrei = new Human("test@test.com", "test");//instantiem obiect din clasa human
        //andrei.email="andrei@test.com";//atribuim valori
        andrei.verify();
        andrei.sendEmail();
        System.out.println(andrei.getEmail());
        Human jon = new Human("jon@test.com", "jon test");//adaugam un nou obiect
        //jon.getAddress()="Test Street 123";
        //System.out.println(jon.getAddress());
        System.out.println(jon.getEmail());
        andrei.planet = "Earth";
        jon.planet = "Mars";
        System.out.println("Andrei`s planet is " +andrei.planet + " Jon`s planet is " +jon.planet);

        staticMethod1(); //without return
        //staticMethod2();
       // System.out.println(staticMethod2()); //with return


        //se apeleaza constructorul cu un argument
        Book book1 = new Book();
        Book book2 = new Book();
        book1.setAuthor("Mihai Eminescu");
        book1.set_title("Poezii");
        //se apeleaza constructorul cu 3 arugamente
        Book book3 = new Book(150.00, "Marile sperante", "Mark Twain"); //construita folosind constructor
        book1.afiseaza();
        System.out.println(book1.afiseaza());
        System.out.println(book1.getPrice());
        System.out.println(book2.afiseaza());
        System.out.println(book3.afiseaza());

        //exemple clasa Sportiv - Inotator

        Inotator inotator1 = new Inotator();
        Maratonist maratonist1 = new Maratonist();
        inotator1.seAntreneaza();
        inotator1.seOdihneste();
        maratonist1.seOdihneste();
    }
}
