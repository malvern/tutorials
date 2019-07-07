package com.baeldung;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class AppleEntityUnitTest {

    @Test
    public void givenApple_whenCreatingAppleEntity_thenReturnApple() {
        Apple apple = new Apple("cameo", 2L);
        Packing<Apple> packingSugar = new Packing<>();
        packingSugar.setPackingContents(apple);
        assertEquals(apple, packingSugar.getPackingContents());


    }


}
