import java.util.ArrayList;

public class KanbanBoard
{
    private ArrayList<Column> columns;

    public KanbanBoard()
    {
        this.columns = new ArrayList<>();
        this.columns.add(new Column("To Do"));
        this.columns.add(new Column("In Progress"));
        this.columns.add(new Column("Done"));
    }

    public ArrayList<Column> getColumns()
    {
        return this.columns;
    }

    public void addColumn(Column column)
    {
        this.columns.add(column);
    }

    public ArrayList<Ticket> getAllTicketsPerEmployee(Employee employee)
    {
        ArrayList<Ticket> ticketsList = new ArrayList<>();

        for (Column column : this.columns)
        {
            ticketsList.addAll(column.getTicketsPerEmployee(employee));
        }

        return ticketsList;
    }

    public int getTotalNumberOfTickets()
    {
        int total = 0;

        for (Column column : this.columns)
        {
            total += column.getTickets().size();
        }

        return total;
    }

    public int getTotalNumberOfCompletedTickets()
    {
        int total = 0;

        for (Column column : this.columns)
        {
            if (column.getTitle().equals("Done"))
            {
                total += column.getTickets().size();
            }
        }

        return total;
    }

    public double getPercentageOfCompletedTickets()
    {
        return (double) this.getTotalNumberOfCompletedTickets() / this.getTotalNumberOfTickets() * 100;
    }
}
