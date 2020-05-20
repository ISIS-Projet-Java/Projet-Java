/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Version2;

/**
 *
 * @author Salomé Chevailler
 */
public class Commercial extends Employe {
    
    private int volumeVente;
    
      public Commercial(String nom, String prenom, String matricule, int indiceSalarial, int volumeVente) {
        super(nom, prenom, matricule, indiceSalarial);
        this.volumeVente=volumeVente;
    }
      
    public String toString(){
        return super.toString() + ", Volume mensuel de vente : " + volumeVente;
    }

    public void calculerSalaire(){
        salaire = (int)(indiceSalarial * 12 + 0.1 * volumeVente);
    }
    
    public void setVolumeVente(int volumeVente) {
        this.volumeVente = volumeVente;
    }
    
    
}
