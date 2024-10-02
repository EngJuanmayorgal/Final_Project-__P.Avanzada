package Model;

import java.util.ArrayList;

public class Account {
    
    private final User user;
    private ArrayList<Post> post;
    private ArrayList<Account> frients;
    private ArrayList<Conversation> conversations;
    
    public Account(User user) {
        this.user = user;
        this.post = new ArrayList<>();
        this.conversations = new ArrayList<>();
    }
    
    public void recipientMessage(Account sender, Object message) {
        int found = 0;
        for (Conversation coversation : conversations) {
            if (coversation.getSender().equals(sender)) {
                coversation.AddMessage(message);
                found=1;
            }
        }
        if (found==0) {
            Conversation conversation = new Conversation(sender, this);
            conversation.AddMessage(message);
            conversations.add(conversation);           
        }
    }
    
    public ArrayList<Account> getFrients() {
        return frients;
    }
    
    public ArrayList<Conversation> getConversations() {
        return conversations;
    }
    
    public User getUser() {
        return user;
    }
    
    public void setPost(ArrayList<Post> post) {
        this.post = post;
    }
    
    public ArrayList<Post> getPost() {
        return post;
    }
    
}
