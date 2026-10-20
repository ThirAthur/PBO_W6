package Studycase3;

public class Salesperson implements Comparable
{
    private String firstName;
    private String lastName;
    private int totalSales;

    public Salesperson(String first, String last, int sales)
    {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    public String toString()
    {
        return lastName + ", " + firstName + ":\t" + totalSales;
    }

    public boolean equals(Object other)
    {
        if (!(other instanceof Salesperson))
            return false;

        Salesperson person = (Salesperson) other;

        return lastName.equals(person.getLastName()) &&
               firstName.equals(person.getFirstName());
    }

    public int compareTo(Object other)
    {
        Salesperson person = (Salesperson) other;

        int result = Integer.compare(totalSales, person.totalSales);

        if (result == 0)
        {
            result = lastName.compareTo(person.lastName);

            if (result == 0)
                result = firstName.compareTo(person.firstName);
        }

        return result;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getSales()
    {
        return totalSales;
    }
}
