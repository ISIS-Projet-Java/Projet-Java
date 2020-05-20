/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Version2;

import static java.awt.PageAttributes.MediaType.A;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.scene.input.KeyCode.A;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;

/**
 *
 * @author Salomé Chevailler
 */
public class Entreprise {

    private TreeSet<Employe> lesEmployes;

    public Entreprise() {

        try {
            this.scan = new Scanner(new File("D:/Colin/doc perso/2A/ListeEmploye"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Membre.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.entiers = new ArrayList<>();
        lesEmployes = new TreeSet<Employe>();
    }

    public void ajouter(Employe g){
        lesEmployes.add(g);
    }

    @Override
    public String toString() {
        return "Membres de l'entreprise =" + lesEmployes + '}';
    }

    public void ajouterFichier(){

        List<Integer> entiers;
        Scanner scan;

        While (scan.hasNextInt()){

            String line=scan.next();
            String[] values= line.split(" ");
            int indice = Integer.valueOf(values[3]);
            Employe a = new Employe(values[0], values[1],values[2],indice) {};
            lesEmployes.add(a);
    }
    }
}


