import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import utils.*;

public class Main {
    private static List<Garcom> BD_Garcom = new ArrayList<>();// array para salvar os dados
    private static List<Mesa> BD_Mesa = new ArrayList<>();


    public static void main(String[] args) {
        Scanner loopOn = new Scanner(System.in);
        Menu();
        int loop = loopOn.nextInt();

        while (loop != 0) {

            switch (loop) {
                case 1:{
                    Scanner sc = new Scanner(System.in);
                    Scanner sa = new Scanner(System.in);
                    System.out.print("Informe o ID do garcom: ");
                    int idGarcom = sc.nextInt();

                    System.out.print("Nome: ");
                    String nome = sa.nextLine();

                    System.out.print("Cpf: ");
                    String cpf = sa.nextLine();

                    System.out.print("Data de Nascimento: ");
                    Integer dtaNascimento = sc.nextInt();

                    System.out.print("E-mail: ");
                    String email = sa.nextLine();

                    System.out.print("Telefone: ");
                    Integer telefone = sc.nextInt();

                    System.out.print("Sexo M/F : ");
                    char sexo = sa.next().charAt(0);

                    System.out.print("SalarioFixo: ");
                    float salarioFixo = sc.nextFloat();
                    Garcom g = new Garcom(idGarcom, nome, cpf, dtaNascimento, email, telefone, sexo, salarioFixo, null);

                    GravarGarcom(g);
                    break;
                }
                case 2:{
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Informar o garcom a ser editado pelo ID: ");
                    int idGarcom = sc.nextInt();
                    EditarGarcom(idGarcom);
                    break;
                }
                case 3: {
                    for (int i = 0; i < BD_Garcom.size(); i++) {
                        System.out.println("Garcom "+ i + " : " + BD_Garcom.get(i).getNome());
                    }

                }
                case 4: {
                    
                }
                case 5: {
                    
                }
                case 6: {
                    
                }
                case 7: {
                    
                }
                case 8: {
                    
                }
                case 9: {
                    
                }
                case 10: {
                    
                }
                case 11: {
                    
                }
                case 12: {
                    
                }
                case 0: {
                    System.out.printf("Obrigado por usar!");
                    return;
                }
                default: {
                    System.out.printf("Opcao invalida");
                }
            }
            Menu();
            loop = loopOn.nextInt();
        }
    }

    public static void GravarGarcom(Garcom g) {
        try {
            BD_Garcom.add(g);
            System.out.println("\n\nGarcom gravado com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao salvar Garcom");
        }
    }
    public static void EditarGarcom(int idGarcom) { //percorrer o vetor de garcom e descobrir qual tem o id X, dps disso informar qual vetor estaremos mudando os dados
        Scanner sc = new Scanner(System.in);
        int loop = 10;
        Integer varGarcom = null;
        for (int i = 0; i < BD_Garcom.size(); i++) {
            if (idGarcom == BD_Garcom.get(i).getIdGarcom()){
                varGarcom = idGarcom;

            }
        }
        while(loop != 0) {
            MenuEditarGarcom();
            int select = sc.nextInt();
            switch (select){
                case 1:{
                    System.out.print("Informar o novo nome: ");
                    String newNome = sc.nextLine();
                    BD_Garcom.get(varGarcom).setNome(newNome);
                    break;
                }
                case 2:{
                    System.out.println("Informar novo cpf: ");
                    String newCpf = sc.nextLine();
                    BD_Garcom.get(idGarcom).setCpf(newCpf);
                    break;
                }
                case 3:{
                    System.out.println("Informe a data somente numeros: ");
                    Integer newDtaNascimento = sc.nextInt();
                    BD_Garcom.get(idGarcom).setDtaNascimento(newDtaNascimento);
                    break;
                }
                case 4:{
                    System.out.println("Informe o e-mail: ");
                    String newEmail = sc.nextLine();
                    BD_Garcom.get(idGarcom).setEmail(newEmail);
                    break;
                }
                case 5:{
                    System.out.println("Informe o telefone: ");
                    Integer newTelefone = sc.nextInt();
                    BD_Garcom.get(idGarcom).setTelefone(newTelefone);
                    break;
                }
                case 6:{
                    System.out.println("Informe o sexo M/F: ");
                    char newSexo = sc.next().charAt(0);
                    BD_Garcom.get(idGarcom).setSexo(newSexo);
                    break;
                }
                case 7:{
                    System.out.println("Informe o salario: ");
                    float salario = sc.nextFloat();
                    BD_Garcom.get(idGarcom).setSalarioFixo(salario);
                    break;

                }
                case 0:{
                    System.out.println("Saindo do menu de alteracao...");
                    loop = 0;
                    return;
                }
                default:{
                    System.out.println("Opcao invalida");
                }
                System.out.print("Deseja fazer mais alguma alteracao: \n1-SIM\n2-NAO\nEscolha a opcao: ");
                loop = sc.nextInt();

            }
        }
        System.out.printf("Retornando ao menu principal...");
    }


    private static void Menu()
    {
        System.out.print("""
            \n
            1: Cadastrar Garcom:
            2: Editar Garcom:
            3: Relatorio de Garcom:
            4: Cadastrar Mesa:
            5: Remover Mesa:
            6: Reservar Mesa: 
            7: Limpar Mesa:
            8: Relatorio de mesas disponiveis para a quantidade de cliente: 
            9: Relatorio de mesas sendo atendidas por um garcom:
            10: Relatorio com todas as mesas livres e o garcom responsavel: 
            11: Relatorio de meses que o garcom esta atendendo: 
            12: Buscar garcom por e-mail: 
            13: Buscar mesa por numero:
            14: Buscar garcom responsavel pela mesa: 
            0: PARA SAIR

            Escolha a opcao desejada ---> : """);
    }
    private static void MenuEditarGarcom()
    {
        System.out.print("""
                Selecione a opcao desejada:
                1- Alterar NOME;
                2- Alterar CPF;
                3- Alterar DATA DE NASCIMENTO;
                4- Alterar E-MAIL;
                5- Alterar TELEFONE;
                6- Alterar SEXO;
                7- Alterar SALARIO;
                Escolha a opcao desejada ---> : """);
    }

}
