package org.rama;

public class Clase2 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Thread hilo1 = new Thread(new Hilo("Hola",buffer));
        Thread hilo2 = new Thread(new Hilo("chau",buffer));
        hilo1.start();
        hilo2.start();


        try {
            hilo1.join();
            hilo2.join();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(buffer.leer(i));
        }


    }
}
