/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demodebug;

/**
 *
 * @author alumne
 */
public class DebugArrayLaMasovera {
    
    public static void main(String[] args) {
        String[] diesSetmana = 
            { "Dilluns", "Dimarts", "Dimecres", "Dijous", "Divendres", "Dissabte", "Diumenge" };
        
        String[] calendariMasovera = 
            { "Menja llums", "Menja naps", "Menja nespres", 
                "Menja nous", "Menja faves tendres", "Tot s'ho gasta", "Tot s'ho menja"};
        
        final int DIES_SETMANA = 7;
        final String ESTRIBILLO_LAMASOVERA = "Oh lai la, la masovera se'n va al mercat!";
        
        System.out.println("CANÇÓ DE LA MASOVERA");
        for(int i = 0; i < DIES_SETMANA; i++) {
            System.out.println("El " + diesSetmana[i]);
            System.out.println("La masovera " + calendariMasovera[i]);
            System.out.println(ESTRIBILLO_LAMASOVERA);
        }      
    }
}
