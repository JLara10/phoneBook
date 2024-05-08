package phoneBook;

import java.util.*;
//name : phoneNumber1, phoneNumber1
//name: phoneNumber

// String , ArrayList of Strings, Map of some king
//Map to hold name and phoneNumbers
//Key is String and values is arrayList of String

public class PhoneBook {
    private Map<String, List<String>> phoneRecord;

    public PhoneBook(){
        this(new HashMap<>());
    }

    public PhoneBook(Map<String, List<String>> phoneRecord) {

        this.phoneRecord = phoneRecord;
    }

    //Create a method to add a number to the phonebook

    public void add(String name, String phoneNumber){
        List<String> numbers = new ArrayList<>();
        numbers.add(phoneNumber);
        phoneRecord.put(name, numbers);  //put the record in the map
    }

    //Create a method to addAll Numbers to a phoneRecord
    public void addAll(String name, String... phoneNumbers){
        //put the record in the map by key and values
        List<String> numbers = phoneRecord.getOrDefault(name, new ArrayList<>());
        numbers.addAll(Arrays.asList(phoneNumbers));
        phoneRecord.put(name, numbers);
    }

    //Method to remove a person
    public void remove(String name){
        phoneRecord.remove(name);
    }

    //HasEntry - to check if entry exist
    public Boolean hasEntry(String name){
        //check if name exist in record and return true
        return phoneRecord.containsKey(name);
    }

    //lookUp (name) - return phone number(s)
    public List<String> lookup(String name){
        //return a list of phone numbers that belong to the name
        return phoneRecord.getOrDefault(name, new ArrayList<>());

    }

    //reverse lookUp (phoneNumber) - return phone name
    public String reverseLookUp(String phoneNumber){
        //Takes a phone number and returns the name attached to the number
        for(Map.Entry<String,List<String>> reverse : phoneRecord.entrySet()){
            if(reverse.getValue().contains(phoneNumber)){
                return reverse.getKey();
            }
        }
        return "not in here cuh";
    }

    //Get allContactNames in the phoneBook

    public List<String> getAllContactNames(){
        //need a list or container to store the names
        List<String> names = new ArrayList<>();
        //need to iterate through the map
        for(Map.Entry<String,List<String>> contacts: phoneRecord.entrySet()){
            names.add(contacts.getKey());
        }
        //add each name to the list or container
        //return the container
        return names;
    }


    //A way to represent the String Object


    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneRecord=" + phoneRecord +
                '}';
    }


}
