package org.rama.Alejo;

public class Main {
    public static void main(String arg[]){
        Buffer buffer = new Buffer();
        Hilo h = new Hilo("Hola",buffer);
        Hilo c = new Hilo("Chau",buffer);
        
        h.start();
        c.start();

        try{
            h.join();
            c.join();
        }catch(InterruptedException e){}
        for(int i=0;i<=200;i++){
            System.out.println(buffer.leer(i));
        }
    }
}
