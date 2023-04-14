/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorymethod;

/**
 *
 * @author paulo
 */
public class FactoryMethod {

    public static void main(String[] args) {
        //sem Factory
        //Pessoa atleta = new Pessoa("Caio");   
        //atleta.correr();
        //atleta.parar();
        //---------------------------------------
        //com factory
        PessoaFactory atletaFactory = new PessoaFactory();
        Pessoa atleta = (Pessoa) atletaFactory.getAtleta("Caio");
        atleta.correr();
        atleta.parar();
    }
}
