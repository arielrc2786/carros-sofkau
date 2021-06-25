/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsLogic;

/**
 *
 * @author Darkness
 */
public class Player {
    
    String nombrejugador;

    public Player(){
        this.nombrejugador = "";
    }
    
    public Player(String nombre){
        this.nombrejugador = nombre;
    }

    public String getNombrejugador() {
        return nombrejugador;
    }

    public void setNombrejugador(String nombrejugador) {
        this.nombrejugador = nombrejugador;
    }
    
}
