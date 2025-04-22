package HW1NR1;

class Publication {
    protected String title;
    protected int year;
    public Publication(String title, int year) {
        this.title = title;
        this.year = year;
    }
    public String getInfo() {
        return "Titel: "+ title + "; Jahr: " + year;
    }
}

class Book extends Publication {
    protected String author;
    public Book(String title, int year, String author) {
        super(title, year);
        this.author = author;
    }
    @Override
    public String getInfo() {
        return super.getInfo() + "; Autor: " + author;
    }
}

class Textbook extends Book {
    private String subject;

    public Textbook(String title, int year, String author, String subject) {
        super(title, year, author);
        this.subject = subject;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "; Genre: " + subject;
    }
}

public class Main {
    public static void main(String[] args) {
        Textbook tb = new Textbook("Winfo für Anfänger", 2004, "Benedikt Zwank", "Wirtschaftsinformatik");
        System.out.println(tb.getInfo());
    }
}
