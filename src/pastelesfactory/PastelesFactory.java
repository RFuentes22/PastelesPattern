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
public class PastelesFactory {
    public static Pasteles getPasteles(String sabor){
        switch (sabor){
        case "chocolate":
            return new Chocolate();
        case "vainilla":
            return new Vainilla();
        case "fresa":
            return new Fresa();
        }
        return null;
    }
}
