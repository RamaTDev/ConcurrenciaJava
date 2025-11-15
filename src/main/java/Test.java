import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        int totalSuma;
        long ti,tf,tt;
        ti = System.currentTimeMillis();
        Matriz matriz = new Matriz(10000,10000);
        totalSuma = matriz.sumaTotal();
        tf= System.currentTimeMillis();
        tt=tf-ti;
        System.out.println("Suma sin hilos: "+totalSuma);
        System.out.println("Tiempo sin hilos: "+tt+"miliSegundos");
        //-------------------------------------------------------------------//
        System.out.println("------------------");
        ti = System.currentTimeMillis();

        //#------------ 2 HILOS----------------------------------------------#//
        SumaParcial sumaParcial1 = new SumaParcial(matriz,0,matriz.getColumns()/2);
        SumaParcial sumaParcial2 = new SumaParcial(matriz,matriz.getColumns()/2,matriz.getColumns());
        sumaParcial1.start();
        sumaParcial2.start();
        try {
            sumaParcial1.join();
            sumaParcial2.join();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        totalSuma = sumaParcial1.getSumParcial() + sumaParcial2.getSumParcial();
        tf=System.currentTimeMillis();
        tt=tf-ti;
        System.out.println("Suma con hilos: "+totalSuma);
        System.out.println("Tiempo con hilos[2]: "+tt+" miliSegundos");

        //#------------------------ N HILOS -------------------------#//
        Scanner scanner = new Scanner(System.in);
        int cantHilos;
        System.out.println("Ingresa N hilos: ");
        cantHilos = scanner.nextInt();

        //crear N hilos
        ti=System.currentTimeMillis();
        SumaParcial[] sumaParcials = new SumaParcial[cantHilos];
        int div = matriz.getColumns()/cantHilos;
        int subIni, subFin;
        subIni=0;
        subFin=div;

        for (int i = 0; i < cantHilos-1; i++) {
            sumaParcials[i] = new SumaParcial(matriz,subIni,subFin);
            subIni=subFin;
            subFin=subFin+div;
        }
        //en la ultima posicion va desde subIni haste el final, por si la division no es entera
        sumaParcials[cantHilos-1] = new SumaParcial(matriz,subIni,matriz.getColumns());

        for (int i = 0; i < cantHilos; i++) {
            sumaParcials[i].start();
        }
        try {
            for (int i = 0; i < cantHilos; i++) {
                sumaParcials[i].join();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        totalSuma = 0;
        for (int i = 0; i < cantHilos; i++) {
                   totalSuma+= sumaParcials[i].getSumParcial();
        }
        tf=System.currentTimeMillis();
        tt=tf-ti;
        System.out.println("Suma con "+cantHilos+" hilos: "+totalSuma);
        System.out.println("Tiempo con "+cantHilos+" hilos:" +tt+" miliSegundos");


    }
}
