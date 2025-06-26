package models;

public class Startup {
    private String nom;
    private Employe[] employes;
    private Projet[] projets;

    public Startup(String nom) {
        this.nom = nom;
        employes = new Employe[0];
        projets = new Projet[0];
    }

    public boolean ajouterEmployeStartup(Employe[] employes, Employe employe) {
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

    public boolean retirerEmployeStartup(Employe[] employes, Employe employe) {
        boolean supressionReussie = false;
        if (employe != null) {
            for (int i = 0; i < employes.length; i++) {
                if (employes[i] == employe) {
                    for (int j = i; j < employes.length - 1; j++) {
                        employes[j] = employes[j + 1];
                    }
                }
                supressionReussie = true;
            }
        }
        return supressionReussie;
    }

    public boolean ajouterProjetStartup(Projet[] projets, Projet projet) {
        boolean ajoutReussi = false;
        if (projet != null) {
            for (int i = 0; i < projets.length; i++) {
                if (projets[i] == null) {
                    projets[i] = projet;
                    ajoutReussi = true;
                }
            }
        }
        return ajoutReussi;
    }

    public boolean retirerProjetStartup(Projet[] projets, Projet projet) {
        boolean supressionReussie = false;
        if (projet != null) {
            for (int i = 0; i < projets.length; i++) {
                if (projets[i] == projet) {
                    for (int j = i; j < projets.length - 1; j++) {
                        projets[j] = projets[j + 1];
                    }
                }
                supressionReussie = true;
            }
        }
        return supressionReussie;
    }

    public static double calculerBudgetTotal(Projet[] projets, Projet projet) {
        double budgetTotal = 0;
        for (int i = 0; i < projets.length; i++) {
            budgetTotal += projet.getBudget();
        }
        return budgetTotal;
    }

    public static void afficherEmployesStartup(Employe[] employes, Employe employe) {
        for (int i = 0; i < employes.length; i++) {
            System.out.println(employes[i]);
        }
    }

    public static boolean affecterEmployeProjet(Employe[] employes, Projet[] projets) {
        boolean ajoutReussi = false;
        for (int i = 0; i < projets.length; i++) {
            projets[i].ajouterEmployeProjet(employes, null);
            ajoutReussi = true;
        }
        return ajoutReussi;
    }

    @Override
    public String toString() {
        String resultat = "Startup" + nom + "\nEmployés:\n";
        for (int i = 0; i < employes.length; i++) {
            resultat += "- " + employes[i].toString();
        }
        resultat += "\nProjets:\n";
        for (int i = 0; i < projets.length; i++) {
            resultat += "- " + projets[i].toString();

        }
        
        return resultat;
    }
}