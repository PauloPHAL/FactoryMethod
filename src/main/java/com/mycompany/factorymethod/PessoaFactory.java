/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorymethod;

/**
 *
 * @author paulo
 */
public class PessoaFactory extends AtletaFactory{

    @Override
    public Atleta getAtleta(String nome) {
        return new Pessoa(nome);
    }
    
}
