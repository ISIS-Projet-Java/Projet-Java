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
public class Employe {
    protected String nom;
     protected String prenom;
     protected String Matricule;
     protected int IndiceSal;
     protected int Salaire;
     protected int NbVente;
 
    public Employe(String nom, String prenom, String Matricule, int IndiceSal) {
        this.nom = nom;
        this.prenom = prenom;
        this.Matricule = Matricule;
        this.IndiceSal = IndiceSal;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setMatricule(String Matricule) {
        this.Matricule = Matricule;
    }

    public void setIndiceSal(int IndiceSal) {
        this.IndiceSal = IndiceSal;
    }

    public void setSalaire(int Salaire) {
        this.Salaire = Salaire;
    }

    public void setNbVente(int NbVente) {
        this.NbVente = NbVente;
    }


    @Override
    public String toString() {
        return "Employes{" + "nom=" + nom + ", prenom=" + prenom + ", Matricule=" + Matricule + ", IndiceSal=" + IndiceSal + ", Salaire=" + Salaire + ", NbVente=" + NbVente + '}';
    }
    
}
