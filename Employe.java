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
public class Employe implements Payable {

    protected String nom;
    protected String prenom;
    protected String matricule;
    protected int indiceSal;
    protected int salaire;
    protected int nbVente;

    public Employe(String nom, String prenom, String matricule, int indiceSal) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.indiceSal = indiceSal;

    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setMatricule(String Matricule) {
        this.matricule = matricule;
    }

    public void setIndiceSal(int IndiceSal) {
        this.indiceSal = indiceSal;
    }

    public void setSalaire(int Salaire) {
        this.salaire = salaire;
    }

    public void setNbVente(int NbVente) {
        this.nbVente = nbVente;
    }
    @Override
    public double calculerSalaire() {
        if (this instanceof Commercial) {
            salaire = (int) (indiceSal * 12 + 0.1 * this.nbVente);
        } else {
            salaire = indiceSal * 12;
        }
        return 0;
    }
    @Override
    public String toString() {
        return getClass().getSimpleName() + "nom=" + nom + ", prenom=" + prenom + ", matricule=" + matricule + ", indiceSal=" + indiceSal + ", salaire=" + salaire;
    }


}



