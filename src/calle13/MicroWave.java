/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calle13;

/**
 *
 * @author Jair
 */
public class MicroWave extends Electrodomestico {
    int temperatura;
    int temporuzador;
    int areaCalentador;

    public MicroWave(String marca, String entradaelectrica) {
        super(marca, entradaelectrica);
    }

    @Override
    void enceder() {
        
    }
}
