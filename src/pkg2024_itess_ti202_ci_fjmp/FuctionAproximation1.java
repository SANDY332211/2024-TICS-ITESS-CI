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

/**
 *
 * @author Admi
 */
public class FuctionAproximation1 {
    private double xIni;
    private double xEnd;
    private int n;
    private double dx;
    private double x[];
    private double fx[];
    private double area;
    


    public FuctionAproximation1(double xIni, double xEnd, int n) {
        this.xIni = xIni;
        this.xEnd = xEnd;
        this.n = n;
        
        this.x= new double [ n+1];
        this.fx= new double [ n+1];
    }

        public void compute(){
        dx=(xEnd - xIni)/n;
        for (int i=0; i<=n; i++){
            x[i]=xIni + i*dx;
            fx [i]= x[i] * x[i];
            area = area + fx[i]* dx;
        }
    }
    public double getArea() {
        return area;
    }
    
}

