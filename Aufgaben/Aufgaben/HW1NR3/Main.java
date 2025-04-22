package HW1NR3;

public class Main {
    public static void main(String[] args) {

        Inbox inbox = new Inbox();
        Mail mail1 = new Mail("BCG", "Bewerbung" ,"Leider ...", "12.12.25", false);
        Mail mail2 = new Mail("McDonald's","Bewerbung", "Glückwunsch" , "02.11.2024", false);
        Mail mail3 = new Mail("Mama","Geschenk",  "Ich habe dir ein Geschenk geschickt zu Ostern!","21.04.2025", false);
        Mail mail4 = new Mail("Stadt Musterstadt","Straftzettel", "Das macht dann 50€" , "14.02.25", false);

        inbox.add(mail1);
        inbox.add(mail2);
        inbox.add(mail3);
        inbox.add(mail4);

        inbox.openMail(1);
        inbox.openMail(3);

        System.out.println();
        System.out.println(inbox.countUnread());

        inbox.getHeaders();
    }
}
