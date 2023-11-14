
package modelView;


public class Operaciones {
    
    
    public static double trigonometricas (double valor, String operacion, boolean grados){
        if (grados) {
            valor = Math.toRadians(valor);
        }
        
        double resultado = 0;
        
        switch (operacion) {
            case "seno":
                resultado = Math.sin(valor);
                break;
            case "coseno":
                resultado = Math.cos(valor);
                break;
            case "tangente":
                resultado = Math.tan(valor);
                break;
            case "cosecante":
                resultado = 1 / Math.sin(valor);
                break;
            case "secante":
                resultado = 1 / Math.cos(valor);
                break;
            case "cotangente":
                resultado = 1 / Math.tan(valor);
                break;
            default:
                System.out.println("Operación no válida");
        }
        return resultado;
    }
}
