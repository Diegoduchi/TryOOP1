import java.time.LocalDate;
import java.time.Period;

public class Employee
{
    private String name;
    private LocalDate joinCompanyDate;

    public Employee(String name, LocalDate joinCompanyDate)
    {
        this.name = name;
        this.joinCompanyDate = joinCompanyDate;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public LocalDate getJoinCompanyDate()
    {
        return this.joinCompanyDate;
    }

    public void setJoinCompanyDate(LocalDate joinCompanyDate)
    {
        this.joinCompanyDate = joinCompanyDate;
    }

    public int getYearsOfExperience()
    {
        return Period.between(this.joinCompanyDate, LocalDate.now()).getYears();
    }
}
