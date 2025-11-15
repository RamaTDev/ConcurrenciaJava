package org.rama;

public class Buffer {
    private final String[] buffer;
    private  int pos = 0;

    public Buffer(){
        this.buffer = new String[100];
    }

    public  void addElement(String string){
        this.buffer[pos]=string;
        this.pos++;
    }

    public String leer(int pos){
        return this.buffer[pos];
    }

    public  void showBuffer(){
        for (int i = 0; i < this.buffer.length; i++) {
            System.out.println("["+i+"]"+this.buffer[i]);
        }
    }



}
