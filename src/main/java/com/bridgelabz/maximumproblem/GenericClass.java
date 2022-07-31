package com.bridgelabz.maximumproblem;

public class GenericClass {

    public Integer findMax(Integer a, Integer b,Integer c){
        Integer max = a;

        if(max.compareTo(b)<0){
            max = b;
        }

        if(max.compareTo(c)<0){
            max = c;
        }

        return max;
    }

    public Float findMax(Float a, Float b,Float c){
        Float max = a;

        if(max.compareTo(b)<0){
            max = b;
        }

        if(max.compareTo(c)<0){
            max = c;
        }

        return max;
    }

    public String findMax(String a, String b,String c){
        String max = a;

        if(max.compareTo(b)<0){
            max = b;
        }

        if(max.compareTo(c)<0){
            max = c;
        }

        return max;
    }

}
