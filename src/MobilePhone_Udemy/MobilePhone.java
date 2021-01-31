import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
        if (findContact(contact.getName()) >= 0){
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String name){
        for (int i = 0 ; i < this.myContacts.size() ; i++){
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        if (findContact(oldContact.getName()) >= 0){
            this.myContacts.set(findContact(oldContact.getName()), newContact);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeContact(Contact contact){
        if (findContact(contact.getName()) >= 0){
            this.myContacts.remove(findContact(contact.getName()));
            return true;
        } else {
            return false;
        }
    }

    public Contact queryContact(String name){
        int index = findContact(name);
        if (index >= 0 ){
            return this.myContacts.get(index);
        }
        return null;
    }

    public void printContacts(){
        int index;
        System.out.println("Contact list:");
        for (int i = 0; i < this.myContacts.size(); i++){
            index = i+1;
            System.out.println(index + ". " + this.myContacts.get(i).getName() + " -> " + this.myContacts.get(i).getPhoneNumber());
        }
    }
}
