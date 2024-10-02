package Control;

import Model.Account;
import Model.User;

public class LoginControl {

    private final MainControl mainControl;

    public LoginControl(MainControl mainControl) {
        this.mainControl = mainControl;
    }

    public Account Login(String username) {
        for (Account account : mainControl.setupApp.accounts) {
            if (account.getUser().getUsername().equalsIgnoreCase(username)) {
                return account;
            }
        }
        return null;
    }

    public void MakeAcount(String correo, String username, String nombres, String apellidos) {
        User user = new User(correo, username, nombres, apellidos);
        Account acount = new Account(user);
        mainControl.setupApp.AddAccounts(acount);
    }
}
