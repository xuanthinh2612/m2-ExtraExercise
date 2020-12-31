public class Bill extends Customer {
    private Customer customers;
    private int oldNumber = 0;
    private int newNumber;

    private final int PRICE = 750;

    public Bill(String name, int houseNumber, int id, int oldNumber, int newNumber) {
        super(name, houseNumber, id);
        this.oldNumber = oldNumber;
        this.newNumber = newNumber;
    }

    public Customer getCustomers() {
        return customers;
    }

    public void setCustomers(Customer customers) {
        this.customers = customers;
    }

    public int getOldNumber() {
        return oldNumber;
    }

    public void setOldNumber(int oldNumber) {
        this.oldNumber = oldNumber;
    }

    public int getNewNumber() {
        return newNumber;
    }

    public void setNewNumber(int newNumber) {
        this.newNumber = newNumber;
    }

    public int total() {
        return (newNumber - oldNumber) * PRICE;
    }

    @Override
    public String toString() {
        return super.toString() + ",So cu: " + oldNumber + ",So moi: " + newNumber + ",Tong tien: " + total();
    }
}
