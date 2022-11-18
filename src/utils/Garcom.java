package utils;
import java.util.ArrayList;


public class Garcom {
    private int idGarcom;
    private String nome;
    private String cpf;
    private Integer dtaNascimento;
    private String email;
    private Integer telefone;
    private char sexo;
    private float salarioFixo;
    private ArrayList<Mesa> arlMesa;

    public Garcom(){

    }
    public Garcom(int idGarcom, String nome, String cpf, Integer dtaNascimento, String email, Integer telefone, char sexo, float salarioFixo, ArrayList<Mesa> arlMesa){
        this.idGarcom = idGarcom;
        this.nome = nome;
        this.cpf = cpf;
        this.dtaNascimento = dtaNascimento;
        this.email = email;
        this.telefone = telefone;
        this.sexo = sexo;
        this.salarioFixo = salarioFixo;
        this.arlMesa = arlMesa;
    }

    public void setIdGarcom(int idGarcom){
        this.idGarcom = idGarcom;
    }

    public int getIdGarcom() {
        return idGarcom;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setDtaNascimento(Integer dtaNascimento) {
        this.dtaNascimento = dtaNascimento;
    }

    public Integer getDtaNascimento() {
        return dtaNascimento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSalarioFixo(float salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public float getSalarioFixo() {
        return salarioFixo;
    }

    public void setArlMesa(ArrayList<Mesa> arlMesa) {
        this.arlMesa = arlMesa;
    }

    public ArrayList<Mesa> getArlMesa() {
        return arlMesa;
    }



}