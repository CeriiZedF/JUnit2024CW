package org.example;

import java.lang.reflect.Method;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );

        Calculate calculate = new Calculate(10,20);

        System.out.println(calculate.summa());



    }
}
