/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemaanimais;

/**
 *
 * @author MAYCONDANIELDASILVA
 */
import java.util.Scanner;

public class SistemaAnimaisPOLIMORFISMO {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual especie de animal deseja cadastrar?");
        System.out.println("1 - Cachorro | 2 - Gato");
        int opcao = entrada.nextInt();
        entrada.nextLine(); // Limpar o buffer do scanner

        System.out.print("Digite o nome do Animal: ");
        String nome = entrada.nextLine();

        Pet p;

        if (opcao == 1) {
            p = new Cachorro(nome);
        } else {
            p = new Gato(nome);
        }

        p.emitirSom();

        entrada.close();
    }
}
