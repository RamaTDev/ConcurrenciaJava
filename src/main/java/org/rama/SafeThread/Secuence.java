package org.rama.SafeThread;


public class Secuence {

    private static int value;

    /* NotSafeThread
    public   static int getNextValue(){
        return  value++;
    }*/

    //SafeThread
    public synchronized  static int getNextValue(){
        return  value++;
    }
}
