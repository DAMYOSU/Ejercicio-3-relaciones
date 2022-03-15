/*
 
 */
package barajamain;

import barajaEntidades.carta;
import barajaServicios.barajaServicios;
import java.util.ArrayList;

/**
 *
 * @author DAMY
 */
public class BarajaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ArrayList<carta> cartas = new ArrayList<>();

        carta c1 = new carta();
        barajaServicios b1 = new barajaServicios();

        b1.cargaCartas(c1);
        b1.barajar();
        b1.darCartas();
        b1.cartasDisponibles();
        b1.darCartas();
        b1.cartasDisponibles();
        b1.cartasMonton();
        b1.cartasDisponibles();

    }
}
