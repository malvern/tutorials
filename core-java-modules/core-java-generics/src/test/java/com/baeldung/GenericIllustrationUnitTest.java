package com.baeldung;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

@RunWith(JUnit4.class)
public class GenericIllustrationUnitTest {

    @Test
    public void whenAddingNumbers_thenReturnTotalSum() {
        GenericIllustration genericIllustration = new GenericIllustration();
        final int sum = genericIllustration.addingNumbers(Arrays.asList(1, 2L, 4.00, 5));
        assertEquals(12, sum);
    }
}
