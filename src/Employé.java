import java.util.Comparator;
public class Employé   {
    private int id;
    private String nom;
    private String prenom;
    private String nom_dep;
    private int grade;
    private int index;

    Employé()
    {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom_dep() {
        return nom_dep;
    }

    public void setNom_dep(String nom_dep) {
        this.nom_dep = nom_dep;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String toString() {
        return "Employé: id= " + id + " nom= " + nom + " prénom= "
                + prenom + " nom du dep= " +nom_dep + "grade= " +grade ;
    }

    public boolean equals(Object obj){
        if(obj==this)return true;
        if(obj==null)return false;
        if (obj instanceof Employé)
        {
            Employé e=(Employé)obj;
            if (id==e.id && nom.equals(e.nom))
                return true;
        }
        return false;
    }


    public int compare(Employé e1, Employé e2){
        return e1.grade-e2.grade;
    }


}
