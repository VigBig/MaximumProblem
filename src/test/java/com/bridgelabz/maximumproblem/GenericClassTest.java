package com.bridgelabz.maximumproblem;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GenericClassTest {

    @Test
    public void IntegerMaxAtFirstPosition() {
        GenericClass<Integer> genericClass = new GenericClass<>();
        int actual = genericClass.testMaximum(106,-92,3);
        assertEquals(106,actual);
    }


    @Test
    public void IntegerMaxAtSecondPosition() {
        GenericClass<Integer> genericClass = new GenericClass<>();
        int actual = genericClass.testMaximum(14,98,76);
        assertEquals(98,actual);
    }

    @Test
    public void IntegerMaxAtThirdPosition() {
        GenericClass<Integer> genericClass = new GenericClass<>();
        int actual = genericClass.testMaximum(-38,105,390);
        assertEquals(390,actual);
    }

    @Test
    public void FloatMaxAtFirstPosition() {
        GenericClass<Float> genericClass = new GenericClass<>();
        float actual = genericClass.testMaximum(1.02f,-0.51f,0.001f);
        assertEquals(1.02f,actual,0);
    }


    @Test
    public void FloatMaxAtSecondPosition() {
        GenericClass<Float> genericClass = new GenericClass<>();
        float actual = genericClass.testMaximum(10.547f,99.99f,-1.23f);
        assertEquals(99.99f,actual,0);
    }

    @Test
    public void FloatMaxAtThirdPosition() {
        GenericClass<Float> genericClass = new GenericClass<>();
        float actual = genericClass.testMaximum(-3.62f,41.2f,94.5f);
        assertEquals(94.5f,actual,0);
    }

    @Test
    public void StringMaxAtFirstPosition() {
        GenericClass<String> genericClass = new GenericClass<>();
        String actual = genericClass.testMaximum("Apricot","Accent","Absolute");
        assertEquals("Apricot",actual);
    }


    @Test
    public void StringMaxAtSecondPosition() {
        GenericClass<String> genericClass = new GenericClass<>();
        String actual = genericClass.testMaximum("Catch","My","Dog");
        assertEquals("My",actual);
    }

    @Test
    public void StringMaxAtThirdPosition() {
        GenericClass<String> genericClass = new GenericClass<>();
        String actual = genericClass.testMaximum("Xylophone","Yellow","Zebra");
        assertEquals("Zebra",actual);
    }

}