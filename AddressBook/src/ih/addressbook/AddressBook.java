package ih.addressbook;

import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BaseContact> contacts = new ArrayList<>();

    public void addContact(BaseContact contact) {
        contacts.add(contact);
    }

    public void removeContact(BaseContact contact) {
        contacts.remove(contact);
    }

    public void updateContact(BaseContact oldContact, BaseContact newContact) {
        int index = contacts.indexOf(oldContact);
        if (index != -1) {
            contacts.set(index, newContact);
        }
    }


    public void printContacts() {
        System.out.println("Contact List:");
        for (BaseContact contact : contacts) {
            if (contact instanceof PersonalContact) {
                PersonalContact personalContact = (PersonalContact) contact;
                System.out.println("Personal Contact:");
                System.out.println("Name: " + personalContact.getName());
                System.out.println("Phone Number: " + personalContact.getPhoneNumber());
                System.out.println("Email: " + personalContact.getEmail());
                System.out.println("Relationship: " + personalContact.getRelationship());
                System.out.println("Birthday: " + personalContact.getBirthday());
            } else if (contact instanceof ProfessionalContact) {
                ProfessionalContact professionalContact = (ProfessionalContact) contact;
                System.out.println("Professional Contact:");
                System.out.println("Name: " + professionalContact.getName());
                System.out.println("Phone Number: " + professionalContact.getPhoneNumber());
                System.out.println("Email: " + professionalContact.getEmail());
                System.out.println("Job Title: " + professionalContact.getJobTitle());
                System.out.println("Organization: " + professionalContact.getOrganization());
            }
            System.out.println("------------------------");
        }
    }
}

