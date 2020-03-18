/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entreprise;

import java.util.TreeSet;

/**
 *
 * @author cgay
 */
public class Responsable extends Employe{
    
    public Responsable(String nom, String prenom, String matricule, int indiceSal) {
        super(nom, prenom, matricule, indiceSal);
    }
    private TreeSet<Employe> lesSousEmployes;
    /*
        @Override
    public String toString() {
        return "Responsable{" + "lesSousEmployes=" + lesSousEmployes + '}';
    }

    public TreeSet<Employe> getLesSousEmployes() {
        return lesSousEmployes;
    }

    public void setLesSousEmployes(TreeSet<Employe> lesSousEmployes) {
        this.lesSousEmployes = lesSousEmployes;
    }
*/


}
