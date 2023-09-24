package ih.addressbook;

public class Main {
    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();

//            addressBook.addContact(contact);
//            addressBook.removeContact(contact);
//            addressBook.updateContact(oldContact, newContact);
//            addressBook.addAllContacts(contact);
//            addressBook.removeAllContacts(contact);
//            addressBook.printContacts();

        PersonalContact Kuba = new PersonalContact("Kuba", "111111111", "kuba@kuba.com","boyfriend","24.04.1996");
        PersonalContact Dominika = new PersonalContact("Dominika", "111111111", "domka@domka.com","friend","14.05.1995");
        PersonalContact Mama = new PersonalContact("Mama", "111111111", "mama@mama.com","mom","12.11.1965");
        PersonalContact MamaUpdated = new PersonalContact("Mama", "111111111", "mama@mama.com","mom","12.11.1965");
        PersonalContact Tata = new PersonalContact("Tata", "111111111", "tata@tata.com","dad","26.12.1668");
        ProfessionalContact Kasia = new ProfessionalContact("Kasia", "111111111", "kasia@kasia.com","project manager","LOFT");

        addressBook.addContact(Kuba);
        addressBook.addContact(Dominika);
        addressBook.addContact(Mama);
        addressBook.addContact(Tata);
        addressBook.addContact(Kasia);

        addressBook.printContacts();

        addressBook.removeContact(Kasia);

//        addressBook.printContacts();

    }
}