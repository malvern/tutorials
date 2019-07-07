package com.baeldung;

import java.util.List;

public class PackingApples {

    public List<? super Apple> packApples(List<? super Apple> apples) {
        return apples;
    }

    public List<? extends Apple> unpackApples(List<? extends Apple> apples) {
        return apples;
    }

}
