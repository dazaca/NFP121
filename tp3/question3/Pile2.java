package question3;

import question1.PilePleineException;
import question1.PileVideException;

import java.util.Stack;

public class Pile2<T> implements PileI<T>{
    /** par d�l�gation : utilisation de la class Stack */
    private Stack<T> stk;
    /** la capacit� de la pile */
    private int capacit�;

    /** Cr�ation d'une pile.
     * @param taille la "taille maximale" de la pile, doit �tre > 0
     */
    public Pile2(int taille){
        // � compl�ter
    }

    public Pile2(){
        // � compl�ter
    }

    public void empiler(T o) throws PilePleineException{
        // � compl�ter
    }

    public T depiler() throws PileVideException{
        // � compl�ter
    }

    public T sommet() throws PileVideException{
        // � compl�ter
    }

    // recopier ici toutes les autres m�thodes
    // qui ne sont pas modifi�es en fonction
    // du type des �l�ments de la pile

} // Pile2