package HW1NR3;

import java.util.ArrayList;
import java.util.List;

public class Inbox {
    private List<Mail> inbox = new ArrayList<Mail>();



    public void getHeaders() {

        for( Mail mail : inbox ) {

            System.out.println(
               mail.isRead() + " | "+ mail.getSubject() + " from " + mail.getSender() + " on " + mail.getDatetime()

            );
        }

    }
    public void readMail(Mail mail){
        mail.setRead(true);
        System.out.println(   mail.getSubject() + " from " + mail.getSender() + " on " + mail.getDatetime() +
                " : "+ mail.getMessage()
);
    }
    public void openMail(int index){
        if(index < inbox.size()) {
            readMail(inbox.get(index));
        }else {
            System.out.println("Nicht so viele mails vorhanden");
        }
    }
    public int countUnread(){
        int counter=0;
        for(Mail mail : inbox) {
            if(!mail.isRead()) {
                counter++;
            }
        }
        return counter;
    }

    public void add(Mail mail) {
        inbox.add(mail);
    }
}
