package Servicio;

import Dao.TicketDao;
import Entity.Ticket;

public class TicketServicio {
    private TicketDao td = new TicketDao();
    
    public int InsertTicket(Integer lectura,Integer cns){
        Ticket t = new Ticket(cns, lectura);
        int ret =td.InsertarTicket(t);
        
        return ret;
    }
}
