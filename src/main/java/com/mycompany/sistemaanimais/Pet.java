/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaanimais;

/**
 *
 * @author MAYCONDANIELDASILVA
 */
public abstract class Pet {
    protected String nome;
    protected String modelo;

    public Pet(String nome) {
        this.nome = nome;
    }

    public abstract void emitirSom();
}
