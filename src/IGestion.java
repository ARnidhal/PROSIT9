public interface IGestion <Employé>{
    public void ajouterEmployé(Employé e);
    public boolean rechercherEmployé(String nom);
    public boolean rechercherEmployé(Employé e);
    public void supprimerEmployé(Employé e);
    public void displayEmployé();
    public void trierEmployéParld();
    public void trierEmployeParNomDepartementEtGrade();
}
