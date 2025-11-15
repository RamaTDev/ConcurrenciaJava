package org.rama.SafeThread;

public class Test {

    public static void main(String[] args) {
        Thread hilo1 = new Thread(new HiloTest());
        Thread hilo2 = new Thread(new HiloTest());

        hilo1.start();
        hilo2.start();

        /*
       Un hilo comparte direcciones de memoria con otros hilos, el enterno, la variables etc
       un problema al tener multihilos, es que ambos hilos se ejecutan en concurrencia y un hilo puede
       acceder a  variables que otros hilos podrian estar utilizando o modificarlas.
       los hilos pueden confundirse si los datos cambian inesperadamente, generando respuestas no deseadas
       ya que no hay una sincronizacion. Java proporciona un metodo para sincronizar los accesos
        */


    }

    public static class HiloTest implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Secuence.getNextValue());
            }
        }
    }

}
