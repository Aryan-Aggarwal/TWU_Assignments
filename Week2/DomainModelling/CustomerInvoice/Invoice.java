package CustomerInvoice;


public class Invoice {

    private int ID;
    private Customer customer;
    private double Amount;

    public Invoice(int invoiceID, Customer customer, double invoiceAmount) {
        this.ID = invoiceID;
        this.customer = customer;
        this.Amount = invoiceAmount;
    }

    public int getInvoiceID() {
        return ID;
    }

    public void setInvoiceID(int invoiceID) {
        this.ID = invoiceID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getInvoiceAmount() {
        return Amount;
    }

    public void setInvoiceAmount(double invoiceAmount) {
        this.Amount = invoiceAmount;
    }

    public int getCustomerID() {
        return customer.getCustomerID();
    }

    public String getCustomerName() {
        return customer.getCustomerName();
    }

    public int getCustomerDiscount() {
        return customer.getDiscountPercentage();
    }

    public double calculateFinalAmount() {
        return Amount - (Amount * customer.getDiscountPercentage() / 100);
    }

    @Override
    public String toString() {
        return "Invoice Details: \n" +
               "InvoiceID: " + ID + "\n" +
               customer.toString() +
               "InvoiceAmount: $" + Amount + "\n";
    }
}
