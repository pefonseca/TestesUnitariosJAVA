package br.ce.wcaquino.servicos;

import br.ce.wcaquino.exceptions.NaoPodeDividirPorZeroException;
import org.junit.Before;
import org.junit.Test;

import java.net.CacheRequest;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {

    private Calculadora calc;

    @Before
    public void setup() {
        calc = new Calculadora();
    }

    @Test
    public void deveSomarDoisValores() {
        int a = 5;
        int b = 3;
        Calculadora calc = new Calculadora();

        int resultado = calc.somar(a, b);

        assertEquals(8, resultado);
    }

    @Test
    public void deveSubtrairDoisValores() {
        int a = 8;
        int b = 5;

        Calculadora calc = new Calculadora();

        int resultado = calc.subtrair(a, b);

        assertEquals(3, resultado);
    }

    @Test
    public void deveDividirDoisValoreS() throws NaoPodeDividirPorZeroException {
        int a = 6;
        int b = 3;

        int result = calc.divide(a, b);

        assertEquals(2, result);
    }

    @Test(expected = NaoPodeDividirPorZeroException.class)
    public void deveLancarExcecaoAoDividirPorZero() throws NaoPodeDividirPorZeroException {
        int a = 10;
        int b = 0;

        calc.divide(a, b);
    }

    @Test
    public void deveDividir() {
        String a = "6";
        String b = "3";

        int result = calc.divide(a, b);

        assertEquals(2, result);
    }
}
