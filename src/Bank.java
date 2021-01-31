import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    private Branch findBranch(String name){
        for (int i = 0; i < this.branches.size() ; i++){
            Branch branch = this.branches.get(i);
            if (branch.getName().equals(name)){
                return branch;
            }
        }
        return null;
    }

    public boolean addBranch(String name){
        if (findBranch(name) == null){
            this.branches.add(new Branch(name));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double transaction){
        if (findBranch(branchName) != null){
            return findBranch(branchName).newCustomer(customerName, transaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String CustomerName, double transaction){

        if (findBranch(branchName) != null){
            return findBranch(branchName).addCustomerTransaction(CustomerName, transaction);
        }
        return false;

    }

    public boolean listCustomers(String branchName, boolean print){
        Branch branch = findBranch(branchName);
        if (branch != null){
            if (print){
                System.out.println("Customer details for branch " + branch.getName());
                for (int i = 0; i < branch.getCustomers().size() ; i++){
                    System.out.println("Customer: " + branch.getCustomers().get(i).getName() + "[" + (i+1) + "]");
                    System.out.println("Transactions");
                    for (int j = 0; j < branch.getCustomers().get(i).getTransactions().size(); j++){
                        System.out.println("[" + (j+1) + "]  Amount " + branch.getCustomers().get(i).getTransactions().get(j));

                    }
                }

            }else{
                System.out.println("Customer details for branch " + branch.getName());
            for (int i = 0; i < branch.getCustomers().size() ; i++) {
                System.out.println("Customer: " + branch.getCustomers().get(i).getName() + "[" + (i + 1) + "]");
            }
            }
            return true;
        }
        return false;
    }
}
