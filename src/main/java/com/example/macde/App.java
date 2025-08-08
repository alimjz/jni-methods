package com.example.macde;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        NativeAdder nativeAdder = new NativeAdder();
        int add = nativeAdder.add(1, 2);
        System.out.println(add);
    }
}
