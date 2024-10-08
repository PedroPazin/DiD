import Classes.Classes;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void chooseClass(){
        System.out.println("Escolha sua classe");

        int i = 1;
        for(Classes c: Classes.values()){
            System.out.print(i + " -> " + c + " [");
            c.getClasse().getStats();
            System.out.println("]");
            i++;
        }


    }

    public static void main(String[] args) {
        // Input
        Scanner obj = new Scanner(System.in);

        System.out.println("=-=-=-=-=-=- Bem vindo Jogador -=-=-=-=-=-=");
        chooseClass(); // Metodo para escolher a classe

    }
}