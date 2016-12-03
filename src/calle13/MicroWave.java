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
    int temporizador;
    int areaCalentador;
    int ancho;
    int profundidad;
    int tiempocalentar;
    
    public void calcularAreaCalentador()
    {
        areaCalentador=ancho*profundidad;
    }
    public void Temporizador(int tiempo)
    {
        do {            
            
        } while (true);
    }
    public MicroWave(int ancho, int profundidad, String marca, String entradaelectrica) {
        super(marca, entradaelectrica);
        this.ancho=ancho;
        this.profundidad=profundidad;
        calcularAreaCalentador();
    }

    @Override
    void enceder() {
        
    }
}
