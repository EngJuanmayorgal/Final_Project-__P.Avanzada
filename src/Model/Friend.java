
package Model;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Friend extends Person {

    private ArrayList<Conversation> conversations;

    public Friend(String nombres, String apellidos) {
        super(nombres, apellidos);
        this.conversations=new ArrayList<>();
    }

    
    
}
