package HW1NR3;

public class Mail {
    private String sender;
    private String subject;
    private String message;
    private String datetime;
    private boolean read;

    public Mail(String sender, String subject, String message, String datetime, boolean read) {
        this.sender = sender;
        this.subject = subject;
        this.message = message;
        this.datetime = datetime;
        this.read = read;
    }



    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }
}
