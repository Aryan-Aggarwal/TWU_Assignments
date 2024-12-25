package CustomerInvoice;

class Customer {

    private int customerID;
    private String customerName;
    private int discountPercentage;

    public Customer(int customerID, String customerName, int discountPercentage) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.discountPercentage = discountPercentage;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public String toString() {
        return "Customer Details: \n" +
               "CustomerID: " + customerID + "\n" +
               "CustomerName: " + customerName + "\n" +
               "Discount: " + discountPercentage + "%\n";
    }
}