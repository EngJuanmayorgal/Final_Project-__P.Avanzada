/**
 * This class class is my program launcher.
 *
 * Copyright (C) 2024  Juan David Mayorga Lopez <jeidenmayo13752@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */
package Control;

import Model.Persistencia;
import java.io.File;
import java.io.IOException;

public class Launcher {

    public static void main(String[] args) {
        SetupApp setApp;
        Persistencia persistencia = new Persistencia();
        File archivoDatos = new File("AppData.dat");

        if (archivoDatos.exists()) {
            // Intentar cargar la configuración si el archivo existe
            try {
                setApp = persistencia.getApp();
            } catch (IOException | ClassNotFoundException e) {
                setApp = new SetupApp(); // Iniciar c onfiguración manual
            }
        } else {
            setApp = new SetupApp(); // Iniciar configuración manual
        }

        // Crear la ventana principal y pasarle la configuración del juego
        new MainControl(setApp, persistencia);
    }
}
