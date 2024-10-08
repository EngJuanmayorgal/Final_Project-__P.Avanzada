package Control;

import Model.Account;
import Model.Administrator;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class SetupApp implements Serializable {

    protected final ArrayList<Account> accounts;
    private Administrator admin;

    public void sendMessage(Account sender, Account recipient,Object message) {
        for (Account account : accounts) {
            if (account==sender) {
                account.recipientMessage(recipient, message);
            }
            if (account==recipient) {
                account.recipientMessage(sender, message);
            }
        }
    }

    public SetupApp() {
        this.accounts = new ArrayList<>();
    }

    public void AddAccounts(Account account) {
        this.accounts.add(account);

    }

    public void deleteAccounts(Account account) {
        this.accounts.remove(account);
    }

    public Administrator getAdmin() {
        return admin;
    }

    public void setAdmin(Administrator admin) {
        this.admin = admin;
    }

}
