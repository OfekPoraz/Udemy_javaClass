import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    private Customer findCustomer(String name){
        for (int i = 0; i < this.customers.size(); i++){
            Customer customer = this.customers.get(i);
            if (customer.getName().equals(name)){
                return customer;
            }

        }
        return null;
    }

    public boolean newCustomer(String name, double transactions){
        if (findCustomer(name) == null){
            this.customers.add(new Customer(name, transactions));
            return true;
        }
        return false;

    }

    public boolean addCustomerTransaction(String name, double transaction){
        if (findCustomer(name) != null){
            findCustomer(name).addTransaction(transaction);
            return true;
        }

        return false;

    }


}
