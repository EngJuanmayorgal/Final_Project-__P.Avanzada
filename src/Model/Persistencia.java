/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Control.SetupApp;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author ADMIN
 */
public class Persistencia {

    public void SaveApp(SetupApp setupApp) throws FileNotFoundException, IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("AppData.dat");
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(setupApp);
        }
    }

    public SetupApp getApp() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("AppData.dat");
        SetupApp setupApp;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            setupApp = (SetupApp) objectInputStream.readObject();
        }
        return setupApp;

    }
}
