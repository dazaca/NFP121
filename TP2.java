/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 *
 * @author GPC
 */
public class TP2 {
	private JTextField entree = new JTextField( 6 );
	entree.
    
    /**
     * @param args the command line arguments
     */
    //= { 'h', 'e', 'l', 'l', 'o', '.' };
    //public static void main(String[] args = {"0","100","2006"}) {
    public static void main(String[] args) {
         // pour tous les paramètres de la ligne de commande
        int fahrenheit = 0;     // Pour la sauvegarde la valeur passée des degrés fahrenheit par l'utilisateur et l'utiliser dans la méthode qui la transformera en la valeur celsius.
        float celsius = 0;      // Pour la sauvegarde de la valeur obtenu à partir de la conversion faite par notre méthode.
        //int i;
        String[] Args = {"0","1","10","100","1000", "10000","100000"};
        
        for (String Arg : Args) { //for(int i = 0; i < Args.length; i++)
            fahrenheit = Integer.parseInt(Arg); //fahrenheit = Integer.parseInt(Arg[i]);
            celsius = fahrenheitEnCelsius(fahrenheit); // On passe la valeur du champ fahrenheit à la méthode de conversion, puis on assigne la valeur retournée par cette méthode au champ celsius.
            DecimalFormat df = new DecimalFormat ("#.#");
            df.setRoundingMode(RoundingMode.UP);
            System.out.println(fahrenheit + "\u00B0F -> " + df.format(celsius) + "\u00B0C.");
        }
        System.out.println(Args[3]);
    }
    
        /**
     * 
     * 
     * @param f
     *            la valeur en degré Fahrenheit
     * @return la conversion en degré Celsius
     */
    public static float fahrenheitEnCelsius(int f) {

       float c; 
       float div;
       //float conversion;
       //String conversionAUX;       
             
        //       div = (float)  ((float)5.0/ (float)9.0); 
        //       c =  div * ((float)f-(float)32.0);  
        //       conversion = Float.valueOf(df.format(c)); 
        //        return conversion; 
       
       div = (float)5/9; 
       c =  (div * (f-32));
       //c2 = (((int)c)*10)/10.0;
       
        //       DecimalFormat df = new DecimalFormat ("#.#");
        //       conversion = Float.valueOf(df.format(c)); 
        //       DecimalFormat df = new DecimalFormat("#.#");
        //       df.setRoundingMode(RoundingMode.UP);
        //       
        //       conversionAUX = df.format(c);
        //       conversion = Float.parseFloat(conversionAUX);
       return  c;
    }
    
}
