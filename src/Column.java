import java.util.ArrayList;

public class Column
{
    private String title;
    private ArrayList<Ticket> tickets;

    public Column(String title)
    {
        this.title = title;
        this.tickets = new ArrayList<>();
    }

    public String getTitle()
    {
        return this.title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public ArrayList<Ticket> getTickets()
    {
        return this.tickets;
    }

    public void addTicket(Ticket ticket)
    {
        this.tickets.add(ticket);
    }

    public ArrayList<Ticket> getTicketsPerEmployee(Employee employee)
    {
        ArrayList<Ticket> ticketsList = new ArrayList<>();

        for (Ticket ticket : this.tickets)
        {
            if (ticket.getEmployee().equals(employee))
            {
                ticketsList.add(ticket);
            }
        }

        return ticketsList;
    }
}
