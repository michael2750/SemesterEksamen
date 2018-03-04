/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestereksamen;

import impl.Person;
import java.util.ArrayList;

/**
 *
 * @author micha
 */
public interface Handler {
    

    
    public ArrayList<String> switchList(String[] data);
    
    public String[] splitString(String str);
    
    public ArrayList<Integer> sortList(ArrayList<Integer> data);
    
    public String appendString(String str1, String str2);
    
    public void createPersons(Object person, ArrayList<Person> persons);
    
    public ArrayList<Person> listPersons(Person person);
    
    public Person getOldestPerson(ArrayList<Person> persons);
    
    public Person getYoungestPerson(ArrayList<Person> persons);
    
    public boolean isAtWork(int hour, ArrayList<Person> persons);
   
    public int isAdultCount(ArrayList<Person> person);
    
}
