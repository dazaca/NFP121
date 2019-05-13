package question1;

/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius {

    /**
     * le point d'entr�e de cette application, dont le commentaire est �
     * compl�ter
     * 
     * @param args
     *            ...
     */
    public static void main(String[] args) {
        // pour tous les param�tres de la ligne de commande
        int fahrenheit = 0;     // Pour la sauvegarde la valeur pass�e des degr�s fahrenheit par l'utilisateur et l'utiliser dans la m�thode qui la transformera en la valeur celsius.
        float celsius = 0;      // Pour la sauvegarde de la valeur obtenu � partir de la conversion faite par notre m�thode.
        //int i;
        //String[] Args = {"0","1","10","100","1000", "10000","100000"};
        
        for (String Arg : args) { //for(int i = 0; i < Args.length; i++)
            fahrenheit = Integer.parseInt(Arg); //fahrenheit = Integer.parseInt(Arg[i]);
            celsius = fahrenheitEnCelsius(fahrenheit); // On passe la valeur du champ fahrenheit � la m�thode de conversion, puis on assigne la valeur retourn�e par cette m�thode au champ celsius.
            java.text.DecimalFormat df = new java.text.DecimalFormat("#.#");

            System.out.println(fahrenheit + "\u00B0F -> " + df.format(celsius) + "\u00B0C");
        }

                                                                                
    }

    /**
     * la m�thode � compl�ter.
     * 
     * @param f
     *            la valeur en degr� Fahrenheit
     * @return la conversion en degr� Celsius
     */
    public static float fahrenheitEnCelsius(int f) {

        float c; 
               float div;              
               div = (float)5/9; 
               c =  (div * (f-32));
               return  c;
    }

}
