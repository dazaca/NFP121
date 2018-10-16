package question3;

/**
 * NFP121 TpIntroduction, usage de BlueJ et du "Submitter".
 * 
 * @version septembre 2009
 * @author � compl�ter
 * @see java.lang.String, java.lang.Math
 */
public class AuditeurCNAM {
    /** l'attribut nom de chaque auditeur. */
    private String nom;
    /** l'attribut prenom de chaque auditeur. */
    private String prenom;
    /** l'attribut matricule de chaque auditeur. */
    private String matricule;

    /**
     * "Cr�ation", le constructeur d'un auditeur avec son nom, son pr�nom et son
     * matricule.
     * 
     * @param nom
     *            le nom de l'auditeur
     * @param prenom
     *            son pr�nom
     * @param matricule
     *            sur la carte d'inscription, pr�s de la photo
     */
    public AuditeurCNAM(String nom, String prenom, String matricule) {
            this.nom = nom;
            this.prenom = prenom;
            this.matricule = matricule;
    }

    /**
     * le login au Cnam : 6 premi�res lettres du nom suivies de la premi�re
     * lettre du pr�nom s�par�es de '_' . le login retourn� est en minuscules,
     * le trait d'union, ou sp�ciaux <i>(pour unix)</i> sont remplac�s par des
     * '_' pas de caract�res accentu�s pour le login voir les classes
     * pr�d�fines, java.lang.String : les m�thodes replaceAll, toLowerCase et
     * substring java.lang.Math : la m�thode min<br>
     * <b>BlueJ : Menu Aide</b>
     * 
     * @return le login du Cnam simplifi�, sans les adaptations dues aux
     *         homonymes...
     */
    public String login() {
            String nomL;
            String prenomL;
            nomL=this.nom();
            nomL=nomL.replaceAll("[0-9]","");
            nomL=sansAccents(nomL).toLowerCase().substring(0, Math.min(nomL.length(),6)).replaceAll("[^a-z]","_");
            prenomL=this.prenom();
            prenomL=prenomL.replaceAll("[0-9]","");
            prenomL=sansAccents(prenomL).toLowerCase().substring(0,1).replaceAll("[^a-z]","_");   

            return nomL+"_"+prenomL;
    }

    /**
     * Lecture du nom de l'auditeur.
     * 
     * @return son nom
     */
    public String nom() {
        return this.nom;
    }

    /**
     * Lecture du pr�nom de l'auditeur.
     * 
     * @return son pr�nom
     */
    public String prenom() {
        return this.prenom;
    }

    /**
     * Lecture du matricule de l'auditeur.
     * 
     * @return son matricule
     */
    public String matricule() {
        return this.matricule;
    }

    /**
     * m�thode toString ( m�thode red�finie de la classe Object).
     * 
     * @return la concat�nation du nom, du pr�nom et du login, selon cette
     *         syntaxe
     *         <code>nom() + " " + prenom() +  " login : " + login()</code>
     */
    @Override
    public String toString() {
        return nom() + " " + prenom() + " login : " + login();
    }
    
    /** Retourne une cha�ne en rempla�ant les caract�res accentu�s par les caract�res non-accentu�s correspondants.
* @param s la cha�ne accentu�e initiale
* @return la cha�ne non accentu�e
*/
public String sansAccents(String s) {
        String sAccents = "��������������������������������������������������������";
        String sSansAccents ="aaaaaaeeeeooooooiiiiuuuuyncyaaaaaaeeeeooooooiiiiuuuuyncy";
        int longueur = sAccents.length();
        for (int i=0;i<longueur;i++) {
            s = s.replace(sAccents.charAt(i),sSansAccents.charAt(i));
        }
        return s;
}

}
