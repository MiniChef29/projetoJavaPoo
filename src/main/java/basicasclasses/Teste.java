package basicasclasses;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        Transacoes t = new Transacoes();

        t.entrada(23);
        t.mostrar();

        Transacoes n = new Transacoes();

        t.saida(12);
        t.mostrar();

        System.out.print(t.mostrarValorTotal());




    }
}
