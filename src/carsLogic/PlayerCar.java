/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsLogic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Darkness
 */
public class PlayerCar {
    
    private Player condutor;
    private Car carroConductor;
    private Track pistaCarrera;

    public PlayerCar() {
        this.condutor = new Player();
        this.carroConductor = new Car();
        this.pistaCarrera = new Track();
    }
    
    public void asociarConductorCarro(List<List<String>> a){

        for (int i = 0; i < a.get(0).size(); i++) {
            System.out.println("Jugador "+(i+1)+": nombre: "+a.get(0).get(i)+" - Carro numero: "+a.get(1).get(i)+" - Carril: "+a.get(2).get(i));
        }

    }
}
