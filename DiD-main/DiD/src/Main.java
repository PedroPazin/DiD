import Classes.Classes;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void showClasses(){
        System.out.println("Escolha sua classe");

        // For que vai mostrar todas as classes na tela
        int i = 1;
        for(Classes c: Classes.values()){
            System.out.print(i + " -> " + c + " [");
            c.getClasse().getStats(); // Mostrara todos os status da classe
            System.out.println("]");
            i++;
        }

    }

    public static void main(String[] args) {
        // Input
        Scanner obj = new Scanner(System.in);

        System.out.println("=-=-=-=-=-=- Bem vindo Jogador -=-=-=-=-=-=");
        showClasses(); // Metodo para mostrar as classes
        String classe; // String que recebera o index da classe
        List<String> idxClasse = new ArrayList<>(Arrays.asList("1", "2", "3")); // Lista com os valores validos do index de classe
        // Loop infinito para o jogador escolher sua classe
        while(true){
            classe = obj.next().trim(); // Input da classe retirando os espaços vazios

            if(idxClasse.contains(classe)){ // Se o input conter algum item da lista, esta valido, entao saira do loop
               break;
            }

            // Caso o jogador digite um numero invalido
            System.out.println("Digite um numero de classe válido");
        }

        // Guardando a classe em uma variavel
        Classes classeJogador = Classes.values()[Integer.parseInt(classe)-1];


    }
}
