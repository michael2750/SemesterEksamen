/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author micha
 */
public class HandlerImplTest {

    private ArrayList<String> list;
    String[] array = new String[4];
    private ArrayList<Integer> intList;

    public HandlerImplTest() {
    }

    /**
     * Test of arrayToArrayList method, of class HandlerImpl.
     */
    @Test
    public void testArrayToArrayList() {
        System.out.println("arrayToArrayList");
        String str1 = "Test1";
        String str2 = "Test2";
        String str3 = "Test3";
        String[] data = new String[3];
        data[0] = str1;
        data[1] = str2;
        data[2] = str3;
        HandlerImpl instance = new HandlerImpl();
        list = instance.arrayToArrayList(data);
        assertNotNull(list.get(1));
        assertFalse(list.isEmpty());
        for (int i = 0; i < data.length; i++) {
            String expected = data[i];
            String actual = list.get(i);
            assertEquals(expected, actual);

        }
    }

    /**
     * Test of splitString method, of class HandlerImpl.
     */
    @Test
    public void testSplitString() {
        System.out.println("splitString");
        String str = "Hello, this text is long, please split it, so its easy to read";
        HandlerImpl instance = new HandlerImpl();
        array[0] = "Hello";
        array[1] = " this text is long";
        array[2] = " please split it";
        array[3] = " so its easy to read";
        String[] expResult = array;
        String[] result = instance.splitString(str);
        assertNotNull(array[3]);
        assertFalse(array[3].isEmpty());
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of sortList method, of class HandlerImpl.
     */
    @Test
    public void testSortListAscending() {
        System.out.println("sortListAscending");
        intList = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(5);
        expected.add(10);
        expected.add(10);
        expected.add(30);
        expected.add(540);
        intList.add(5);
        intList.add(10);
        intList.add(540);
        intList.add(3);
        intList.add(10);
        intList.add(30);
        HandlerImpl instance = new HandlerImpl();
        ArrayList<Integer> expResult = expected;
        ArrayList<Integer> result = instance.sortListAscending(intList);
        assertNotNull(intList.get(0));
        assertFalse(intList.isEmpty());
        assertEquals(expResult, result);
    }

    /**
     * Test of appendString method, of class HandlerImpl.
     */
    @Test
    public void testAppendString() {
        System.out.println("appendString");
        String str1 = "This is a ";
        String str2 = "test string";
        HandlerImpl instance = new HandlerImpl();
        String expResult = str1 + str2;
        String result = instance.appendString(str1, str2);
        assertNotNull(result);
        assertEquals(expResult, result);
    }

    
    /**
     * Test of getAvarage method, of class HandlerImpl.
     */
    @Test
    public void testGetAvarage() {
        System.out.println("getAvarage");
        int a = 5;
        int b = 10;
        int c = 15;
        int d = 20;
        HandlerImpl instance = new HandlerImpl();
        int expResult = (a + b + c + d) /4;
        int result = instance.getAvarage(a, b, c, d);
        assertEquals(expResult, result);
    }

    /**
     * Test of getLastValue method, of class HandlerImpl.
     */
    @Test
    public void testGetLastValue() {
        System.out.println("getLastValue");
        intList = new ArrayList<>();
        intList.add(5);
        intList.add(10);
        intList.add(20);
        intList.add(2);
        intList.add(300);
        intList.add(4);
        intList.add(12);
        HandlerImpl instance = new HandlerImpl();
        int expResult = 12;
        int result = instance.getLastValue(intList);
        assertNotNull(result);
        assertEquals(expResult, result);
    }

    
    /**
     * Test of createPerson method, of class HandlerImpl.
     */
    @Test
    public void testCreatePerson() {
        System.out.println("createPerson");
        Person person = new Person("Hans", "Svensen", 43);
        String firstName = person.getFirstName();
        String lastName = person.getLastName();
        int age = person.getAge();
        HandlerImpl instance = new HandlerImpl();
        instance.createPerson(firstName, lastName, age);
        String expResult = "Hans";
        String result = person.getFirstName();
        assertNotNull(person);
        assertEquals(expResult, result);
    }

    /**
     * Test of createPersons method, of class HandlerImpl.
     */
    @Test
    public void testAddPersons() {
        System.out.println("createPersons");
        HandlerImpl instance = new HandlerImpl();
        PersonData pd = new PersonData();
        ArrayList<Person> expResult = pd.getPersons();
        ArrayList<Person> result = instance.addPersons();
        assertNotNull(result);
        assertEquals(expResult, result);
    }

    /**
     * Test of isAtWork method, of class HandlerImpl.
     */
    @Test
    public void testIsAtWork() {
        System.out.println("isAtWork");
        int hour = 7;
        HandlerImpl instance = new HandlerImpl();
        boolean result = instance.isAtWork(hour);
        assertEquals(false, result);
        hour = 8;
        result = instance.isAtWork(hour);
        assertEquals(false, result);
        hour = 15;
        result = instance.isAtWork(hour);
        assertEquals(true, result);
        hour = 16;
        result = instance.isAtWork(hour);
        assertEquals(false, result);
    }

    /**
     * Test of isAdultCount method, of class HandlerImpl.
     */
    @Test
    public void testIsAdultCount() {
        System.out.println("isAdultCount");
        HandlerImpl instance = new HandlerImpl();
        int expResult = 3;
        int result = instance.isAdultCount();
        assertEquals(expResult, result);
    }

}
