package com.baeldung;

import java.util.List;

public class GenericIllustration {

    public int addingNumbers(List<? extends Number> list) {
        int sum = 0;
        for (Number x : list)
            sum += x.intValue();
        return sum;
    }
/* behind scenes
    public int addingNumbers(List list){
        int sum =0;
        for(Object object: list){
            Number number = (Number)object;
            sum += number.intValue();
        }
        return sum;
    }*/
}
