/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelplace;

/**
 *
 * @author user
 */
public class TravelPlace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        continentAsia1 ca = new continentAsia1("Perak", " Pulau Pangkor");
        System.out.println("Asia Continent : " + ca.toString());
        
        continentEurope ce = new continentEurope("Norway", " Pulau Lyngor");
        System.out.println("Europe Continent : " + ce.toString());
    }
    
}
