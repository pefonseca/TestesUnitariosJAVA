package br.ce.wcaquino.servicos;

import br.ce.wcaquino.exceptions.NaoPodeDividirPorZeroException;

public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) throws NaoPodeDividirPorZeroException {
        if(a == 0 || b == 0) {
            throw new NaoPodeDividirPorZeroException();
        }
        return a / b;
    }

    public int divide(String a, String b) {
        return Integer.parseInt(a) / Integer.parseInt(b);
    }
}
