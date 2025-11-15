package org.rama.Alejo;


public class Hilo extends Thread{
    private String msj;
    private Buffer buffer;
    public Hilo(String msj, Buffer buffer){
        this.msj = msj;
        this.buffer = buffer;
    }
    public void run(){
        for(int i=0;i<100;i++){
            buffer.escribir(msj+i);
        }
        System.out.println("Termino el hilo"+msj);
    }
    
}
