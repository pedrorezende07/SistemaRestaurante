package utils;
//import java.lang.reflect.Array;
//import java.util.ArrayList;

public class Mesa {
    private int idMesa;
    private int capacidade;
    private String situacao;

    private Garcom g;

    public Mesa(){

    }
    public Mesa(int idMesa, int capacidade, String situacao, Garcom g){
       this.idMesa = idMesa;
       this.capacidade = capacidade;
       this.situacao = situacao;
       this.g = g;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public void setG(Garcom g) {
        this.g = g;
    }

    public Garcom getG() {
        return g;
    }
}
