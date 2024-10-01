package Model;

import java.util.ArrayList;

public class Account {

    private final User user;
    private ArrayList<Friend> friends;
    private ArrayList<Post> post;

    public Account(User user) {
        this.user = user;
        this.friends = new ArrayList<>();
        this.post= new ArrayList<>();
    }
    

}
