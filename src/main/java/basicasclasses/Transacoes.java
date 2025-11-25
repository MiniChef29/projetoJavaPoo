package basicasclasses;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Transacoes {

    private double valorTotal;
    private String tipo;
    Date data;


    List<IOperacoes> operacoesFinanceiras = new ArrayList<>();

    public void entrada(double valor, String descricao){
        Entradas e = new Entradas(valor, descricao);
        operacoesFinanceiras.add(e);
        this.valorTotal += valor;
    }

    public void saida(double valor, String descricao){
        Saidas s = new Saidas(valor, descricao);
        operacoesFinanceiras.add(s);
        this.valorTotal -= valor;
    }

    public void mostrarTudo() {
        operacoesFinanceiras.stream()
                .filter(e -> getTipo().equals( "E") || getTipo().equals("S"))
                .forEach(System.out::println);

    }

    public double mostrarValorTotal(){
        return this.valorTotal;

    }

    public void mostrarEntradas(){
        for(IOperacoes op : operacoesFinanceiras){
            if(op instanceof Entradas){
                System.out.println(op);
                System.out.println();
            }
        }
    }


    public void mostrarSaidas(){
        for (IOperacoes op : operacoesFinanceiras) {
            if(op instanceof Saidas){
                System.out.println(op);
                System.out.println();
            }
        }
    }


}
