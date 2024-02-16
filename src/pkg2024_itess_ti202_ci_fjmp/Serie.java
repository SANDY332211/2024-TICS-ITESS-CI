
/*
 ITESS-TICS-2024
ENERO.JUNIO 2024
CALCULO INTEGRAL
TI202 FJMP
12 FEBRERO 2024
CALCULO DE SERIE
SANDRA Araceli Hernandez
 */
package pkg2024_itess_ti202_ci_fjmp;

public class Serie {

    private int iIni;
    private int iEnd;
    private int n;
    private int i[];
    private int f[];
    private int suma;

    public Serie(int iIni, int iEnd) {
        this.iIni = iIni;
        this.iEnd = iEnd;

        n = iEnd - iIni + 1;
        i = new int[n];
        f = new int[n];

    }

    public void compute() {
        int index = 0;
        suma=0;
        for (int i = iIni; i <= iEnd; i++) {
            this.i[index] = i;
            f[index] = 2 * i * i - 2 * i;
            suma+= f[index];
            index++;
        }
    }

    public void print() {
        System.out.println("index   |   i   |   f");
        for (int index = 0; index < n; index++) {
            System.out.println(index + "  | " + i[index] + "    | " + f[index]);
            
        }
         System.out.println("suma"+suma);
    }
}
