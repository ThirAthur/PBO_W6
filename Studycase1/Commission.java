package Studycase1;

public class Commission extends Hourly{
    private double totalSales;
    private double commissionRate;

    public Commission(String nama, String address, 
                        String phone, String socSecNumber, double rate, double commission)
    {
        super(nama, address, phone, socSecNumber, rate);

        commissionRate = commission;
        totalSales = 0;
    }

    public void addSales(double sales)
    {
        totalSales += sales;
    }

    public double pay()
    {
        double payment = super.pay() + (totalSales * commissionRate);

        totalSales = 0;

        return payment;
    }

    public String toString()
    {
        String result = super.toString();

        result += "\nTotal Sales: " + totalSales;

        return result;
    }
}