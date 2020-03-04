/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entreprise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cgay
 */
public class Membre {

    private TreeSet<Employe> lesEmployes;
    private final ArrayList<Object> entiers;

    public Membre() {
        this.entiers = new ArrayList<>();
        lesEmployes = new TreeSet<Employe>();
    }

    public void ajouter(Employe g) {
        lesEmployes.add(g);
    }

    @Override
    public String toString() {
        return "Membre de l'entreprise =" + lesEmployes + '}';
    }

    public void ajouterFichier() {
        List<Integer> entiers;
        Scanner scan = null;
        try {
            scan = new Scanner(new File("D:/Colin/doc perso/2A/ListeEmploye"));
            while(scan.hasNextInt())
            {
                String line = scan.next();
                String[] values = line.split(" ");
                int indice = Integer.valueOf(values[3]);
                String classe = values[4];
                if (values[4].equals("commercial")){
                    int indice2 = Integer.valueOf(values[5]);
                    Employe a = new Commercial(values[0], values[1], values[2], indice, indice2);
                }
                if (values[4].equals("responsable")){
                    Employe a = new Responsable(values[0], values[1], values[2], indice);
                }
                if (values[4].equals("employeDeBase")){
                    Employe a = new EmployeDeBase(values[0], values[1], values[2], indice);
                }
                     
                Employe a = new Employe(values[0], values[1], values[2], indice);
                lesEmployes.add(a);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Membre.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
