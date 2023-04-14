/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorymethod;

/**
 *
 * @author paulo
 */
public class Pessoa implements Atleta{
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    
    @Override
    public void correr(){
        System.out.println(this.nome+": Estou correndo");
    }

    @Override
    public void parar(){
        System.out.println(this.nome+": Parei");
    }
       
    
}
