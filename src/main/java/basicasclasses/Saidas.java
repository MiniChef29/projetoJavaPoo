package basicasclasses;

import java.util.Date;
import java.util.UUID;

public class Saidas  implements IOperacoes {
    private UUID id;
    private String descricao;
    private Date data;
    public Saidas(double numero, String descricao){
        id  = UUID.randomUUID();
        this.descricao = descricao;
        this.data = new Date();

    }


    public String descricao(String descricai) {
        return "";
    }

    @Override
    public String toString() {
        return "Saida: " +
                "\nData: " + this.data +
                "\nDescricao: " +  this.descricao;

    }
}
