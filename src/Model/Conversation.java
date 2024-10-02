package Model;

import java.util.ArrayList;

public class Conversation {

    private final Account sender;
    private final Account recipient;
    private final ArrayList<Object> messages;

    public Conversation(Account sender, Account recipient) {
        this.sender = sender;
        this.recipient = recipient;
        this.messages = new ArrayList<>();
    }

    public void AddMessage(Object message) {
        this.messages.add(message);
    }

    public Account getSender() {
        return sender;
    }

    public Account getRecipient() {
        return recipient;
    }

    public ArrayList<Object> getMessages() {
        return messages;
    }

}
