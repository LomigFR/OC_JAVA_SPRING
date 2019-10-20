package org.example.demo.ticket.webapp.listener;


import org.example.demo.ticket.business.impl.manager.ManagerFactory;
import org.example.demo.ticket.business.impl.manager.ProjetManagerImpl;
import org.example.demo.ticket.business.impl.manager.TicketManagerImpl;
import org.example.demo.ticket.webapp.rest.resource.AbstractResource;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DependencyInjectionListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // Création de l'instance de org.example.demo.ticket.business.manager.impl.manager.ManagerFactory
        ManagerFactory vManagerFactory = new ManagerFactory();

        // Ajout de l'injection des Managers dans la org.example.demo.ticket.business.manager.impl.manager.ManagerFactory
        vManagerFactory.setProjetManager(new ProjetManagerImpl());
        vManagerFactory.setTicketManager(new TicketManagerImpl());

        // Injection de l'instance de org.example.demo.ticket.business.manager.impl.manager.ManagerFactory dans la classe AbstractResource
        AbstractResource.setManagerFactory(vManagerFactory);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
