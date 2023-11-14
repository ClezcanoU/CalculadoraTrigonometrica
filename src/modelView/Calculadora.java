
package modelView;

import model.FirebaseCRUD;
import model.FirebaseConfig;
import view.FormularioCal;
import view.FormularioHis;


public class Calculadora {

    public static registros historial1 = new registros();
    static FormularioCal operaciones = new FormularioCal();
    static FormularioHis historico = new FormularioHis();
    
    public static void main(String[] args) {
        
        operaciones.setVisible(true);
        FirebaseConfig.init();
    }

    public static void guardar(String operacion) {
        historial1.registrar(operacion);
  
        FirebaseCRUD.crearRegistro(operacion);
    }

    public static void MostrarHistorial() {
        historico.setVisible(true);
    }
}
