/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author riosk
 */
import java.util.Scanner;
public class CreateGallerySimulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter the Month Day and Year of the simulation: ");
        String date = console.nextLine();
        
        System.out.println("Please enter the length of the simulation in minutes: ");
        int simMin = console.nextInt();
        SenateGallery sim = new SenateGallery(date);
        sim.initializeSenateGallery();
        sim.runSenateGallerySimulation(simMin);
        sim.outputStats();
        
        
    }
    
}
