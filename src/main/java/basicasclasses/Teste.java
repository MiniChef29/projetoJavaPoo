package basicasclasses;

public class Teste {
    public static void main(String[] args) {
        Transacoes t = new Transacoes();


        t.entrada(12, "Pagamento faculdade");
        t.saida(1, "Água");
        t.saida(3,"Luz");
        t.mostrarSaidas();
        System.out.println();
        t.mostrarEntradas();
        System.out.print(t. mostrarValorTotal());
        System.out.println();
        t.mostrarTudo();


    }
}
