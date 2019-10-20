package org.example.demo.ticket.business.impl.manager;

import org.example.demo.ticket.business.contract.manager.ProjetManager;
import org.example.demo.ticket.business.contract.manager.TicketManager;

public class ManagerFactory {

    /**
     * Accès et paramétrage du ProjetManager :
     */
    private ProjetManager projetManager;

    public ProjetManager getProjetManager(){
        return this.projetManager;
    }

    public void setProjetManager(ProjetManager pProjetManager) {
        this.projetManager = pProjetManager;
    }

    /**
     * Accès et paramétrage du TicketManager :
     */
    private TicketManager ticketManager;

    public TicketManager getTicketManager(){
        return this.ticketManager;
    }

    public void setTicketManager(TicketManagerImpl pTicketManager) {
        this.ticketManager = pTicketManager;
    }
}
