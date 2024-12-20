package com.views;


import com.entity.Cours;
import com.entity.Classe;
import com.entity.Module;
import com.entity.Niveau;
import com.services.CoursService;
import com.services.ClasseService;
import com.services.ModuleService;
import com.services.NiveauService;

import java.util.List;
import java.util.Scanner;

public class AdminView {

    private final CoursService coursService;
    private final ClasseService classeService;
    private final ModuleService moduleService;
    private final NiveauService niveauService;

    public ViewAdmin(CoursService coursService, ClasseService classeService, ModuleService moduleService, NiveauService niveauService) {
        this.coursService = coursService;
        this.classeService = classeService;
        this.moduleService = moduleService;
        this.niveauService = niveauService;
    }

    public void afficherMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean continuer = true;

        while (continuer) {
            System.out.println("=== Menu Admin ===");
            System.out.println("1. Créer un cours");
            System.out.println("2. Créer une classe");
            System.out.println("3. Créer un module");
            System.out.println("4. Créer un niveau");
            System.out.println("5. Afficher les cours par niveau");
            System.out.println("6. Afficher les cours par classe");
            System.out.println("7. Afficher les cours par professeur");
            System.out.println("8. Quitter");
            System.out.print("Choisissez une option : ");
            int choix = scanner.nextInt();
            scanner.nextLine();  // Consomme la nouvelle ligne

            switch (choix) {
                case 1:
                    creerCours(scanner);
                    break;
                case 2:
                    creerClasse(scanner);
                    break;
                case 3:
                    creerModule(scanner);
                    break;
                case 4:
                    creerNiveau(scanner);
                    break;
                case 5:
                    afficherCoursParNiveau(scanner);
                    break;
                case 6:
                    afficherCoursParClasse(scanner);
                    break;
                case 7:
                    afficherCoursParProfesseur(scanner);
                    break;
                case 8:
                    continuer = false;
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Option invalide, essayez encore.");
            }
        }

        scanner.close();
    }

    private void creerCours(Scanner scanner) {
        System.out.print("Entrez le nom du cours : ");
        String nom = scanner.nextLine();
        System.out.print("Entrez le professeur du cours : ");
        String professeur = scanner.nextLine();
        Cours cours = new Cours(nom, prof);  
        coursService.create(cours);
        System.out.println("Cours créé avec succès !");
    }

    private void creerClasse(Scanner scanner) {
        System.out.print("Entrez le nom de la classe : ");
        String nom = scanner.nextLine();
        Classe classe = new Classe(nom);
        classeService.create(classe);
        System.out.println("Classe créée avec succès !");
    }

    private void creerModule(Scanner scanner) {
        System.out.print("Entrez le nom du module : ");
        String nom = scanner.nextLine();
        Module module = new Module(nom);
        moduleService.create(module);
        System.out.println("Module créé avec succès !");
    }

    private void creerNiveau(Scanner scanner) {
        System.out.print("Entrez le nom du niveau : ");
        String nom = scanner.nextLine();
        Niveau niveau = new Niveau(nom);
        niveauService.create(niveau);
        System.out.println("Niveau créé avec succès !");
    }

    private void afficherCoursParNiveau(Scanner scanner) {
        System.out.print("Entrez le niveau : ");
        String niveau = scanner.nextLine();
        List<Cours> coursList = coursService.findByNiveau(niveau);
        coursList.forEach(cours -> System.out.println(cours));
    }

    private void afficherCoursParClasse(Scanner scanner) {
        System.out.print("Entrez la classe : ");
        String classe = scanner.nextLine();
        List<Cours> coursList = coursService.findByClasse(classe);
        coursList.forEach(cours -> System.out.println(cours));
    }

    private void afficherCoursParProfesseur(Scanner scanner) {
        System.out.print("Entrez le professeur : ");
        String professeur = scanner.nextLine();
        List<Cours> coursList = coursService.findByProf(prof);
        coursList.forEach(cours -> System.out.println(cours));
    }
}

