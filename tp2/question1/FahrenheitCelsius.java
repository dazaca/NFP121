package question1;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius {

    /**
     * le point d'entrée de cette application, dont le commentaire est à
     * compléter
     * 
     * @param args
     *            ...
     */
    public static void main(String[] args) {
        // pour tous les paramètres de la ligne de commande
        int fahrenheit = 0;     // Pour la sauvegarde la valeur passée des degrés fahrenheit par l'utilisateur et l'utiliser dans la méthode qui la transformera en la valeur celsius.
        float celsius = 0;      // Pour la sauvegarde de la valeur obtenu à partir de la conversion faite par notre méthode.
        //int i;
        //String[] Args = {"0","1","10","100","1000", "10000","100000"};
        
        for (String Arg : args) { //for(int i = 0; i < Args.length; i++)
            fahrenheit = Integer.parseInt(Arg); //fahrenheit = Integer.parseInt(Arg[i]);
            celsius = fahrenheitEnCelsius(fahrenheit); // On passe la valeur du champ fahrenheit à la méthode de conversion, puis on assigne la valeur retournée par cette méthode au champ celsius.
            java.text.DecimalFormat df = new java.text.DecimalFormat("#.#");

            System.out.println(fahrenheit + "\u00B0F -> " + df.format(celsius) + "\u00B0C");
        }

                                                                                
    }

    /**
     * la méthode à compléter.
     * 
     * @param f
     *            la valeur en degré Fahrenheit
     * @return la conversion en degré Celsius
     */
    public static float fahrenheitEnCelsius(int f) {

        float c; 
               float div;              
               div = (float)5/9; 
               c =  (div * (f-32));
               return  c;
    }

}
