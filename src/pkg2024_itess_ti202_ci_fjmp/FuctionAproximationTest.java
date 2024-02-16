/*
 ITESS-TICS-2024
ENERO.JUNIO 2024
CALCULO INTEGRAL
TI202 FJMP
12 FEBRERO 2024
APROXIMACION DE FUNCIONES USANDO SUMAS 
SANDRA Araceli Hernandez
*/
package pkg2024_itess_ti202_ci_fjmp;

public class FuctionAproximationTest {
   
    public static void main(String[] args){
        FuctionAproximation1 fa = new FuctionAproximation1(1, 3,10 );
        fa. compute();
        System.out.println("area:"+ fa.getArea());
    }
}
