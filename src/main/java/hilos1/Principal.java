package hilos1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//De ejemplo de concurrencia entre dos procesos o hilos para el cual el resultado dependa del orden o la
//velocidad de la ejecuci?n de los mismos. Indiqu? qu? parte del c?digo constituir?a la Secci?n Cr?tica de
//cada proceso.

public class Principal {
		public static void main(String[] args) throws IOException {
		int a;
		int b;
		BufferedReader entrada = new BufferedReader (new
		InputStreamReader (System.in));
		System.out.print("Ingrese el valor para a ");
		System.out.flush();
		String text1=entrada.readLine();
		a=Integer.parseInt(text1);
		System.out.print("Ingrese el valor para b ");
		System.out.flush();
		String text2=entrada.readLine();
		b=Integer.parseInt(text2);
		Hilo1 H1= new Hilo1(a,b);
		Hilo2 H2 = new Hilo2(a,b);
        //seccion critica, algunas veces puede empezar el hilo 1 otra el hilo 2. se pelean por
            // el recurso compartido en este caso la consola.
		H1.start();
		H2.start();
		}
		}
		
		

