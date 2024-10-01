package Model;

import java.util.ArrayList;

public class Account {

    private final User user;
    private ArrayList<Post> post;

    public Account(User user) {
        this.user = user;
        this.post = new ArrayList<>();
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
