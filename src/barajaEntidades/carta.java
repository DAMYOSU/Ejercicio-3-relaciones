/*
 
 */
package barajaEntidades;

import java.util.ArrayList;

/**
 *
 * @author DAMY
 */
public class carta {
    
    
    private  int carta;
    private String palo;

    public carta() {
    }

    public carta(int carta, String palo) {
        this.carta = carta;
        this.palo = palo;
    }

    public int getCarta() {
        return carta;
    }

    public void setCarta(int carta) {
        this.carta = carta;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return  "carta= " + carta + " de " + palo + "\n";
    }

    
}