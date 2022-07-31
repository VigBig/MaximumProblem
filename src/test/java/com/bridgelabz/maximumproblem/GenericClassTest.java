package com.bridgelabz.maximumproblem;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GenericClassTest {

    @Test
    public void IntegerMaxAtFirstPosition() {
        GenericClass genericClass = new GenericClass();
        int actual = genericClass.findMax(106,-92,3);
        assertEquals(106,actual);
    }


    @Test
    public void IntegerMaxAtSecondPosition() {
        GenericClass genericClass = new GenericClass();
        int actual = genericClass.findMax(14,98,76);
        assertEquals(98,actual);
    }

    @Test
    public void IntegerMaxAtThirdPosition() {
        GenericClass genericClass = new GenericClass();
        int actual = genericClass.findMax(-38,105,390);
        assertEquals(390,actual);
    }

    @Test
    public void FloatMaxAtFirstPosition() {
        GenericClass genericClass = new GenericClass();
        float actual = genericClass.findMax(1.02f,-0.51f,0.001f);
        assertEquals(1.02f,actual,0);
    }


    @Test
    public void FloatMaxAtSecondPosition() {
        GenericClass genericClass = new GenericClass();
        float actual = genericClass.findMax(10.547f,99.99f,-1.23f);
        assertEquals(99.99f,actual,0);
    }

    @Test
    public void FloatMaxAtThirdPosition() {
        GenericClass genericClass = new GenericClass();
        float actual = genericClass.findMax(-3.62f,41.2f,94.5f);
        assertEquals(94.5f,actual,0);
    }

    @Test
    public void StringMaxAtFirstPosition() {
        GenericClass genericClass = new GenericClass();
        String actual = genericClass.findMax("Apricot","Accent","Absolute");
        assertEquals("Apricot",actual);
    }


    @Test
    public void StringMaxAtSecondPosition() {
        GenericClass genericClass = new GenericClass();
        String actual = genericClass.findMax("Catch","My","Dog");
        assertEquals("My",actual);
    }

    @Test
    public void StringMaxAtThirdPosition() {
        GenericClass genericClass = new GenericClass();
        String actual = genericClass.findMax("Xylophone","Yellow","Zebra");
        assertEquals("Zebra",actual);
    }

}