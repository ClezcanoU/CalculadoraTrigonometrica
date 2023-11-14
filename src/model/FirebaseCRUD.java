
package model;

import com.google.firebase.database.*;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;
import java.util.HashMap;
import java.util.Map;

public class FirebaseCRUD {
    
    static private int contadorRegistros = 6;

    static public void crearRegistro(String registro) {
        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();
        contadorRegistros++;

        databaseReference.child("historial").child(String.valueOf(contadorRegistros)).setValue(registro);
    }


    /*public static void leerItem(String key, ValueEventListener listener) {
        DatabaseReference database = FirebaseDatabase.getInstance().getReference();
        database.child("items").child(key).addListenerForSingleValueEvent(listener);
    }


    static public void editarItem(String itemId, Item nuevoItem) {
        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference("items").child(itemId);

        // Actualizar los valores del objeto Item en Firebase
        Map<String, Object> actualizacion = new HashMap<>();
        actualizacion.put("nombre", nuevoItem.getNombre());
        //actualizacion.put("precio", nuevoItem.getPrecio());

        databaseReference.updateChildren(actualizacion);
    }


    static public void borrarItem(String itemId) {
       DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference("items").child(itemId);

       // Eliminar el objeto Item de Firebase
       databaseReference.removeValue();
    }*/

}

