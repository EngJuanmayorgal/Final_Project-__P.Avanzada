package Control;

import Model.Account;
import Model.Administrator;
import java.io.IOException;

public class AdminControl {

    private final MainControl mainControl;
    private Administrator admin;

    public AdminControl(MainControl mainControl) {
        this.mainControl = mainControl;
    }

    public void MakeAdmin(String name, String lastName,String Password) throws IOException {
        admin=new Administrator(Password, name, lastName);
        mainControl.setupApp.setAdmin(admin);
        mainControl.persistencia.SaveApp(mainControl.setupApp);
    }
    
    public void DeleteAcount(Account account) throws IOException{
        mainControl.setupApp.deleteAccounts(account);
        mainControl.persistencia.SaveApp(mainControl.setupApp);
    }
    
}
