package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MathUtilTest {
    @Test //anotação -> rotulam
    void testMdcP1BImpar(){
        int a = 6, b = 3;
        int esperado = 3;
        int obtido = MathUtil.mdc(a, b);

        assertEquals(esperado, obtido);
    }

    @Test
    void testMdcP1BPar(){
        int a = 6, b = 2;
        int esperado = 2;
        int obtido = MathUtil.mdc(a, b);

        assertEquals(esperado, obtido);
    }

    @Test
    void testMdcP3(){
        int a = -6;
        int b = 0;
        int esperado = 6;
        int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }

    @Test
    void testMdcP5(){
        int a = 6, b = 2;
        int esperado = MathUtil.mdc(b,a);
        int obtido = MathUtil.mdc(a, b);

        assertEquals(esperado, obtido);
    }

    @Test
    void testMdcP7(){
        int a = 6, b = 2;
        int esperado = MathUtil.mdc(-a, b);
        int obtido = MathUtil.mdc(a, -b);

        assertEquals(esperado, obtido);
    }

    @Test
    void testMdcP8(){
        int a = 6;
        int esperado = 6;
        int obtido = MathUtil.mdc(a,a);

        assertEquals(esperado, obtido);
    }


    @Test
    void testMdcP8Negativo(){
        int a = -6;
        int esperado = 6;
        int obtido = MathUtil.mdc(a,a);

        assertEquals(esperado, obtido);
    }

    @Test
    void testMdcP12DoisPrimos(){
        int p = 7, a = p;
        int esperado = p;
        int obtido = MathUtil.mdc(p,a);

        assertEquals(esperado, obtido);
    }

    @Test
    void testMdcP12UmPrimo(){
        int p = 7, a = 2;
        int esperado = 1;
        int obtido = MathUtil.mdc(p,a);

        assertEquals(esperado, obtido);
    }

    @Test
    void testMdcCasoGeral30e12(){
        int a = 30, b = 12;
        int esperado = 6;
        int obtido = MathUtil.mdc(a,b);

        assertEquals(esperado, obtido);
    }

    @Test
    void testMdcCasoGeral12e9(){
        int a = 12, b = 9;
        int esperado = 3;
        int obtido = MathUtil.mdc(a,b);

        assertEquals(esperado, obtido);
    }



}
