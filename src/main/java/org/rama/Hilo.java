package org.rama;

import static java.lang.Thread.sleep;

public class Hilo implements Runnable{

    private String message;
    private Buffer buffer;

    public Hilo(String message, Buffer buffer){
        this.message = message;
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i<50; i++)
            this.buffer.addElement(this.message+i);
    }
}
