package Ejercicios;


public class SalarioDocente {
    public static void main(String[] args){
        double SalarioH, Hora , DesRenta, CalcularSalario, SalarioTotal;
        SalarioH = 8.00;
        Hora = 36;
        
        
        CalcularSalario = SalarioH * Hora;
        DesRenta = CalcularSalario  * 0.1;
        SalarioTotal = CalcularSalario - DesRenta ;
        
        System.out.println("Salario total del docente es: " + "$" + SalarioTotal);
    }
}
