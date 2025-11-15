package org.rama.Alejo;

public class Buffer{
    String[] buffer = new String[300];
    int tam = 0;
    public synchronized void escribir(String msj){
        buffer[tam]=msj;
        tam++;
    }
    public String leer(int pos){
        return (buffer[pos]);
    }
}