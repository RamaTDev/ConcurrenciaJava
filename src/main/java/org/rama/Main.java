package org.rama;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        Thread thread = new Thread(new Hilo("Hola",5));
        Thread thread2 = new Thread(new Hilo("Chau",5));
        thread2.start();
        thread.start(); 

        //join hace que el thread en ejecucion espere que el thread t termine su ejecucion
        //esperar que el hilo termine

        try {
            System.out.println("--");
            thread2.join();//termina primero
            System.out.println("Termino el Hilo 2");


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
*/
    }

    //Internal CLASES
    public static class Hola extends Thread {
      public void run() {
          try{
              sleep(1000); // espera 1s
          } catch (Exception e) {
              System.out.println(e.getMessage());
          }

          for (int i = 0; i < 5; i++) {
              System.out.println("hola: "+i);
          }
      }
    }

    public static class Chau extends Thread{
        public void run(){
            for (int i = 0; i < 5; i++) {
                System.out.println("chau: " + i);
            }
        }
    }
}