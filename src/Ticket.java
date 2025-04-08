public class Ticket
{
    private String description;
    private int requiredExperienceInYears;
    private int priority;
    private double amountOfHoursToSolveTicket;
    private Employee employee;

    public Ticket(String description, int requiredExperienceInYears, int priority, double amountOfHoursToSolveTicket, Employee employee)
    {
        this.description = description;
        this.requiredExperienceInYears = requiredExperienceInYears;
        this.priority = priority;
        this.amountOfHoursToSolveTicket = amountOfHoursToSolveTicket;
        this.employee = employee;
    }

    public String getDescription()
    {
        return this.description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public int getRequiredExperienceInYears()
    {
        return this.requiredExperienceInYears;
    }

    public void setRequiredExperienceInYears(int requiredExperienceInYears)
    {
        this.requiredExperienceInYears = requiredExperienceInYears;
    }

    public int getPriority()
    {
        return this.priority;
    }

    public void setPriority(int priority)
    {
        if (priority >= 1 && priority <= 5)
        {
            this.priority = priority;
        }
    }

    public double getAmountOfHoursToSolveTicket()
    {
        return this.amountOfHoursToSolveTicket;
    }

    public void setAmountOfHoursToSolveTicket(double amountOfHoursToSolveTicket)
    {
        this.amountOfHoursToSolveTicket = amountOfHoursToSolveTicket;
    }

    public Employee getEmployee()
    {
        return this.employee;
    }

    public void setEmployee(Employee employee)
    {
        if (employee.getYearsOfExperience() >= this.requiredExperienceInYears)
        {
            this.employee = employee;
        }
    }

    public boolean isEmployeeExperiencedEnough()
    {
        return this.requiredExperienceInYears <= this.employee.getYearsOfExperience();
    }
}
