import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class KanbanBoardTest
{
    private KanbanBoard kanbanBoard;
    private Employee employee;
    private Ticket ticket;
    private Ticket ticket1;
    private Ticket ticket2;
    private Ticket ticket3;
    private Ticket ticket4;
    private Ticket ticket5;
    private Column todo;
    private Column inProgress;
    private Column done;

    @BeforeEach
    void setUp()
    {
        kanbanBoard = new KanbanBoard();
        employee = new Employee("Diego", LocalDate.of(2004, 11, 30));
        ticket = new Ticket("ticket", 5, 3, 2, employee);
        ticket1 = new Ticket("ticket", 5, 3, 2, employee);
        ticket2 = new Ticket("ticket", 5, 3, 2, employee);
        ticket3 = new Ticket("ticket", 5, 3, 2, employee);
        ticket4 = new Ticket("ticket", 5, 3, 2, employee);
        ticket5 = new Ticket("ticket", 5, 3, 2, employee);

        todo = kanbanBoard.getColumns().getFirst();
        inProgress = kanbanBoard.getColumns().get(1);
        done = kanbanBoard.getColumns().get(2);
    }

    @Test
    void getPercentageOfCompletedTickets_noTicketsCompleted_shouldReturn0()
    {
        inProgress.addTicket(ticket);
        inProgress.addTicket(ticket1);
        inProgress.addTicket(ticket2);
        inProgress.addTicket(ticket3);

        assertEquals(0, kanbanBoard.getPercentageOfCompletedTickets());
    }

    @Test
    void getPercentageOfCompletedTickets_3OutOf6TicketsCompleted_shouldReturn50()
    {
        inProgress.addTicket(ticket);
        inProgress.addTicket(ticket1);
        inProgress.addTicket(ticket2);
        done.addTicket(ticket3);
        done.addTicket(ticket4);
        done.addTicket(ticket5);

        double result = kanbanBoard.getPercentageOfCompletedTickets();

        assertEquals(50, result);
    }

    @Test
    void getPercentageOfCompletedTickets_6OutOf6TicketsCompleted_shouldReturn100()
    {
        done.addTicket(ticket);
        done.addTicket(ticket1);
        done.addTicket(ticket2);
        done.addTicket(ticket3);
        done.addTicket(ticket4);
        done.addTicket(ticket5);

        double result = kanbanBoard.getPercentageOfCompletedTickets();

        assertEquals(100, result);
    }
}