/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastelesfactory;

/**
 *
 * @author R.Fuentes
 */
public class FactoryPatternPasteles {
    
    public static void main(String[] args) {
        // chocolate
        Pasteles Pastel = PastelesFactory.getPasteles("chocolate");
        Pastel.sabor();

        // Vainilla
          Pastel = PastelesFactory.getPasteles("vainilla");
        Pastel.sabor();

        // create a working dog
          Pastel = PastelesFactory.getPasteles("fresa");
        Pastel.sabor();

    }

}
