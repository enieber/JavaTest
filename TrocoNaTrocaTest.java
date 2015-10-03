package com.banco.troconatroca;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrocoNaTrocaTest {

    @Test
    public void TrocoZero(){
        TrocoNaTroca trt = new TrocoNaTroca();
        double result = trt.troco(10, 10);
        assertEquals(0, result, 1e-15);
    }

    @Test
    public void TrocoNegativo(){
        TrocoNaTroca trt = new TrocoNaTroca();
        double result = trt.troco(25, 20);
        assertEquals(0, result, 1e-15);
    }   

}
