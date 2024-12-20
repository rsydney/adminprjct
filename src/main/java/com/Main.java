package com;

import com.services.ClasseService;
import com.services.CoursService;
import com.services.ModuleService;
import com.services.NiveauService;
import com.services.Impl.CoursServiceImpl;
import com.services.Impl.ClasseServiceImpl;
import com.services.Impl.ModuleServiceImpl;
import com.services.Impl.NiveauServiceImpl;
import com.views.AdminView;
import com.repository.ClasseRepository;
import com.repository.CoursRepository;
import com.repository.ModuleRepository;
import com.repository.NiveauRepository;
import com.repository.Impl.CoursRepositoryImpl;
import com.repository.Impl.ClasseRepositoryImpl;
import com.repository.Impl.ModuleRepositoryImpl;
import com.repository.Impl.NiveauRepositoryImpl;



public class Main {

    public static void main(String[] args) {
        // Initialisation des repositories
        CoursRepository coursRepository = new CoursRepositoryImpl();  
        ClasseRepository classeRepository = new ClasseRepositoryImpl();
        ModuleRepository moduleRepository = new ModuleRepositoryImpl();
        NiveauRepository niveauRepository = new NiveauRepositoryImpl();

        // Initialisation des services
        CoursService coursService = new CoursServiceImpl();
        ClasseService classeService = new ClasseServiceImpl();
        ModuleService moduleService = new ModuleServiceImpl();
        NiveauService niveauService = new NiveauServiceImpl();

        // Initialisation de la vue Admin
        AdminView viewAdmin = new AdminView();

        // Lancement du menu
        viewAdmin.afficherMenu();
    }
}