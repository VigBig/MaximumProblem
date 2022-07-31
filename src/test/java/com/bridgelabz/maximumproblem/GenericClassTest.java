package com.bridgelabz.maximumproblem;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GenericClassTest {

    @Test
    public void MaxAtFirstPosition() {
        GenericClass genericClass = new GenericClass();
        int actual = genericClass.findMax(106,-92,3);
        assertEquals(106,actual);
    }


    @Test
    public void MaxAtSecondPosition() {
        GenericClass genericClass = new GenericClass();
        int actual = genericClass.findMax(14,98,76);
        assertEquals(98,actual);
    }

    @Test
    public void MaxAtThirdPosition() {
        GenericClass genericClass = new GenericClass();
        int actual = genericClass.findMax(-38,105,390);
        assertEquals(390,actual);
    }

}