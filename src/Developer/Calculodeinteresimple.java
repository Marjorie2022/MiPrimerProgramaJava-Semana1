
package Developer;

/**
 *
 * @author ITCA
 */
public class Calculodeinteresimple {
    public static void main(String[] args) {
        double interes, capitalPrestado, tiempo, tasaDeinteres, tiempoEnmeses;
        
        interes = 144;
        capitalPrestado = 1200.00;
        tasaDeinteres = 0.08;
        
        tiempo = interes / (capitalPrestado + tasaDeinteres);
        tiempoEnmeses = tiempo * 12;
        System.out.println("Tiempo :" + tiempo + "años");
        System.out.println("Tiempo :" + tiempoEnmeses + "meses");
    }
}
