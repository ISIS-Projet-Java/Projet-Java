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
public class Responsable extends Employes{
    
    public Responsable(String nom, String prenom, String Matricule, int IndiceSal) {
        super(nom, prenom, Matricule, IndiceSal);
    }
    private TreeSet<Employes> lesSousEmployes;

    @Override
    public String toString() {
        return "Responsable{" + "lesSousEmployes=" + lesSousEmployes + '}';
    }

    public TreeSet<Employes> getLesSousEmployes() {
        return lesSousEmployes;
    }

    public void setLesSousEmployes(TreeSet<Employes> lesSousEmployes) {
        this.lesSousEmployes = lesSousEmployes;
    }

    public int getNbVente() {
        return NbVente;
    }

    public void setNbVente(int NbVente) {
        this.NbVente = NbVente;
    }

    
    
}
