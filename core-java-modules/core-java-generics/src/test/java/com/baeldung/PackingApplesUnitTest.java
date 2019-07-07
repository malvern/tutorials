package com.baeldung;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PackingApplesUnitTest {

    @Test
    public void whenPackingApples_thenReturnedPackedApples() {
        Cameo cameo = new Cameo("Cameo", 2L, "brown");
        Fuji fuji = new Fuji("fuji", 1L, "green");
        Fuji fujiTwo = new Fuji("fuji", 2L, "green");
        PackingApples packingApples = new PackingApples();
        List<Apple> unpackedApples = new ArrayList<>();
        unpackedApples.add(fuji);
        unpackedApples.add(cameo);
        final List<? super Apple> packApples = packingApples.packApples(unpackedApples);
        packApples.add(fujiTwo);

        //final Apple apple = packApples.get(0); compilation error
        assertEquals(Arrays.asList(fuji, cameo, fujiTwo), packApples);

    }

    @Test
    public void whenUnPackingApples_thenReturnedUnPackedApples() {
        Cameo cameo = new Cameo("Cameo", 2L, "brown");
        Fuji fuji = new Fuji("fuji", 1L, "green");
        Fuji fujiTwo = new Fuji("fuji", 2L, "green");
        PackingApples packingApples = new PackingApples();
        List<Apple> packedApples = new ArrayList<>();
        packedApples.add(fuji);
        packedApples.add(cameo);
        final List<? extends Apple> apples = packingApples.unpackApples(packedApples);
        // apples.add(fujiTwo);  compilation error
        assertEquals(Arrays.asList(fuji, cameo), apples);
    }


}
