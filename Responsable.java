/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Version2;

import java.util.HashSet;

/**
 *
 * @author Salomé Chevailler
 */
public class Responsable extends Employe {
    
    public Responsable(String nom, String prenom, String matricule, int indiceSalarial) {
        super(nom, prenom, matricule, indiceSalarial);
    }
    
    public void calculerSalaire(){
        salaire = indiceSalarial * 12;
    }
    
    private HashSet<Employe> lesSousEmployes;
    
}
