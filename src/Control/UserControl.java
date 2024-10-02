package Control;

import Model.Account;

public class UserControl {

    private MainControl mainControl;
    private Account account;

    public UserControl(MainControl mainControl) {
        this.mainControl = mainControl;
    }

    
    private void SeeFriends(){
        for (Account account : account.getFrients()) {
            
        }
    }
    
    
    
    public void SendMessage(Account recipient, String message) {
        mainControl.setupApp.sendMessage(account, recipient, message);
    }

}
