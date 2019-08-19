package com.unotalks.unit;

public class RunNTimes implements RunN{

    public void runNTimeMehtodPrint(int n) {
        for(int i=0; i<n; i++) {
            print();
        }
    }

    public void print(){
        System.out.println("print");
    }

}
