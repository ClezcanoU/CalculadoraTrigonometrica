
package model;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.FirebaseDatabase;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FirebaseConfig {
    
    private static FirebaseDatabase firebaseDatabase;
    
    public static void init() {
        try {
            FirebaseOptions firebaseOptions = new FirebaseOptions.Builder()
                    .setDatabaseUrl("https://calculadora-4c222-default-rtdb.firebaseio.com/")
                    
                    .setServiceAccount(new FileInputStream(new File
                    ("C:\\Users\\david\\Desktop\\POO\\Ejercicios\\calculadora-4c222-firebase-adminsdk-db3vu-3192a00d28.json")))

                    .build();

            FirebaseApp.initializeApp(firebaseOptions);
            firebaseDatabase = FirebaseDatabase.getInstance();
            System.out.println("Conexión exitosa....");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } 
    }
}

