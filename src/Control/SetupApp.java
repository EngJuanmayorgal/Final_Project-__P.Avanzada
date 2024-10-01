/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.Account;
import Model.Administrator;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class SetupApp implements Serializable{

    private final ArrayList<Account> accounts;
    private Administrator admin;

    public SetupApp() {
        this.accounts = new ArrayList<>();
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
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
