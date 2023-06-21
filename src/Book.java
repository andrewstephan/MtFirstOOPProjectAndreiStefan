public class Book {
    //price, title, author
   private double price; //atributele clasei
   private String _title;

    public void setPrice(double price) {
        this.price = price;
    }

    public String get_title() {
        return _title;
    }

    public void set_title(String _title) {
        this._title = _title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private String author;
    //constructor cu 1 argument
    public Book() { //constructor, se pun dupa atributele clasei si dupa metode
        price = 100;
        author = "Unknown";
        _title = "Unknown";
    }
    //constructor cu 2 argumente
    public Book(double price, String _title) {
        this.price = price;
        this._title = _title;
    }
    //constructor cu 3 argumente
    public Book(double price, String _title, String author) {
        this.price = price;
        this._title = _title;
        this.author = author;
    }

    public double getPrice(){
        return price;
    }
    public String afiseaza(){
        return "Cartea " + _title + " are ca autor "+author;
    }
}
