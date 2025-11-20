public class Main {
    public static void main(String[] args) {

        DepartementHashSet gestion = new DepartementHashSet();

        Departement d1 = new Departement(1, "Informatique", 30);
        Departement d2 = new Departement(2, "RH", 10);
        Departement d3 = new Departement(3, "Finance", 20);

        gestion.ajouterDepartement(d1);
        gestion.ajouterDepartement(d2);
        gestion.ajouterDepartement(d3);

        gestion.afficherDepartements();
        gestion.trierDepartementsParId();
        gestion.trierDepartementsParNomEtNombreEmployes();
    }
}
