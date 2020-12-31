public class Customer {
    private String name;
    private int houseNumber;
    private int id;

    public Customer(String name, int houseNumber, int id) {
        this.name = name;
        this.houseNumber = houseNumber;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Ten chu ho: "+name+",So nha: "+houseNumber+",Ma so cong to: "+id;
    }
}
