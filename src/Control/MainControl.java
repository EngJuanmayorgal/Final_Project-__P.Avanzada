package Control;

import Model.Persistencia;

public class MainControl {

    private Persistencia persistencia;
    private SetupApp setupApp;
    private UserControl userControl;
    private AdminControl adminControl;

    public MainControl(SetupApp setupApp, Persistencia persistencia) {
        this.persistencia = persistencia;
        this.setupApp = setupApp;
        this.adminControl=new AdminControl(this);
        this.userControl=new UserControl(this);
        
    }
    
    

}
