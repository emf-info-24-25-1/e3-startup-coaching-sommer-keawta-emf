package models;

public class Projet {
    public final static int NB_MAX_EMPLOYE = 5;
    private final String nom;
    private final double budget;
    private final String dateFin;
    private Employe[] employes;

    public Projet(String nom, double budget, String dateFin) {
        this.nom = nom;
        this.budget = budget;
        this.dateFin = dateFin;
        employes = new Employe[NB_MAX_EMPLOYE];
    }

    public String getNom() {
        return nom;
    }

    public double getBudget() {
        return budget;
    }

    public String getDateFin() {
        return dateFin;
    }

    public boolean ajouterEmployeProjet(Employe[] employes, Employe employe) {
        boolean ajoutReussi = false;
        if (employe != null) {
            for (int i = 0; i < employes.length; i++) {
                if (employes[i] == null) {
                    employes[i] = employe;
                    ajoutReussi = true;
                }
            }
        }
        return ajoutReussi;
    }

    public boolean retirerEmployeProjet(Employe[] employes, Employe employe) {
        boolean supressionReussie = false;
        if (employe != null) {
            for (int i = 0; i < employes.length; i++) {
                if (employes[i] == employe) {
                    employes[i] = null;
                    supressionReussie = true;
                }
            }
        }
        return supressionReussie;
    }

    public static void afficherEmployesProjet(Employe[] employes) {
        for (int i = 0; i < employes.length; i++) {
            System.out.println(employes[i]);
        }
    }

    public void afficherEmployesProjetInitiales(Employe[] employes) {
        for (int i = 0; i < employes.length; i++) {
            System.out.print(employes[i].getInitiales() + ",");
            if (i == (employes.length)) {
                System.out.print(employes[i].getInitiales());
            }
        }
    }

    @Override
    public String toString() {
        String resultat = nom + ", Budget: " + budget + " CHF, Date de fin: " + dateFin + ", Employes: [";
        for (int i = 0; i < employes.length; i++) {
            resultat += employes[i].getInitiales();
        }
        resultat += "]";
        return resultat;
    }
}