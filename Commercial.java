/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entreprise;

/**
 *
 * @author cgay
 */
public class Commercial extends Employe{
    
    public Commercial(String nom, String prenom, String matricule, int indiceSal, int nombreDeVente) {
        super(nom, prenom, matricule, indiceSal);
        this.nbVente = nombreDeVente;
    }

    @Override
    public String toString() {
        return super.toString()+",nb de vente"+nbVente ;
    }
    
   
}
