package basicasclasses;

import java.util.Date;
import java.util.UUID;

public class Entradas implements IOperacoes {

    private Date data;
    private UUID entradaID;
    private String descricao;

    public Entradas(double valor, String descricao) {
        this.entradaID = UUID.randomUUID();
        this.data = new Date();
        this.descricao = descricao;
    }


    public String descricaoZ(String descricao) {
        this.descricao = descricao;
        return this.descricao;
    }

    @Override
    public String toString() {
        return "Entrada: " +
                "\nData: " + data +  "\nDescrição: "  + this.descricao;

    }
}
