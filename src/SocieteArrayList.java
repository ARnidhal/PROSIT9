
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<Employé>{

    private ArrayList<Employé> arr;

    public SocieteArrayList() {
        this.arr = new ArrayList<>();
    }
    @Override
    public void ajouterEmployé( Employé e) {
        arr.add(e);

    }

    @Override
    public boolean rechercherEmployé(String nom) {
        for (Employé e : arr) {
            if (e.getNom().equals(nom)) {
                return true;
            }
            return false;
        }
    }


    @Override
    public boolean rechercherEmployé(Employé e) {
        return arr.contains(e);
    }

    @Override
    public void supprimerEmployé(Employé e) {
        arr.remove(e);

    }

    @Override
    public void displayEmployé() {
        for (Employé e : arr) {
            System.out.println(e.toString());
        }

    }

    @Override
    public void trierEmployéParld() {
        Collections.sort(arr);

    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        Collections.sort(arr, new Comparator<Employé>() {
            @Override
            public int compare(Employé e1, Employé e2) {
                int compareNom = e1.getNom().compareTo(e2.getNom());
                if (compareNom != 0) {
                    return compareNom;
                }
                int compareDepartement = e1.getNom_dep().compareTo(e2.getNom_dep());
                if (compareDepartement != 0) {
                    return compareDepartement;
                }
                return Integer.compare(e1.getGrade(), e2.getGrade());
            }
        });
    }

}

