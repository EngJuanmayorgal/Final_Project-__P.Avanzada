package Model;

import java.util.ArrayList;

public class Conversation {

    private Account sender;
    private Account recipient;
    private ArrayList<Object> messages;

    public Conversation(Account sender, Account recipient) {
        this.sender = sender;
        this.recipient = recipient;
        this.messages = new ArrayList<>();
    }
    

}
