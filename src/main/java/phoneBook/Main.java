package phoneBook;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Rene","302-123-4567");
        phoneBook.add("Ces","302-756-4321");
        phoneBook.add("Alvaro","302-100-6969");

        phoneBook.addAll("Trey","302-111-2222","302-000-1111");
        System.out.println(phoneBook.lookup("Trey"));
        System.out.println(phoneBook.lookup("Alvaro"));

        phoneBook.remove("Ces");
        System.out.println(phoneBook);

        System.out.println( phoneBook.hasEntry("Rene"));
        System.out.println( phoneBook.hasEntry("Juan"));

        System.out.println(phoneBook.reverseLookUp("302-777-5555"));//random
        System.out.println(phoneBook.reverseLookUp("302-756-4321"));//ces number
        System.out.println(phoneBook.reverseLookUp("302-123-4567"));//rene
        phoneBook.add("Ces","302-756-4321");

        System.out.println(phoneBook.getAllContactNames());

    }
}
