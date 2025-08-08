package com.example.macde;

public class NativeAdder {

    static {
        System.loadLibrary( "native-adder");
    }
    public native int add( int a, int b );
}
