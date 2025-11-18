package basicasclasses;

import java.util.ArrayList;

public class Transacoes {
    private Entradas e;
    private Saidas s;
    private double valorTotal;

    ArrayList<IOperacoes> operacoesFinanceiras = new ArrayList<>();

    public void entrada(double valor){
        this.e = new Entradas(valor);
        operacoesFinanceiras.add(e);
        this.valorTotal += valor;

    }

    public void saida(double valor){
        this.s = new Saidas(valor);
        operacoesFinanceiras.add(s);
        this.valorTotal -= valor;
    }

    public void mostrar(){
        for(IOperacoes e : operacoesFinanceiras ){
            System.out.println(e);
        }
    }

    public double mostrarValorTotal(){
        return this.valorTotal;
    }

}
