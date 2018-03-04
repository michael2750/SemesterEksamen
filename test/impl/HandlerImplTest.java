/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author micha
 */
public class HandlerImplTest {
    
    public HandlerImplTest() {
    }
    
    /**
     * Test of switchList method, of class HandlerImpl.
     */
    @Test
    public void testSwitchList() {
        System.out.println("switchList");
        String str1 = "Test1";
        String str2 = "Test2";
        String str3 = "Test3";
        String[] data = new String[3];
        data[0] = str1;
        data [1] = str2;
        data[2] = str3;
        HandlerImpl instance = new HandlerImpl();
        ArrayList<String> expResult = new ArrayList<>();
        ArrayList<String> result = instance.switchList(data);
        assertEquals(expResult, result);
    }

    /**
     * Test of splitString method, of class HandlerImpl.
     */
    @Test
    public void testSplitString() {
        System.out.println("splitString");
        String str = "";
        HandlerImpl instance = new HandlerImpl();
        String[] expResult = null;
        String[] result = instance.splitString(str);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sortList method, of class HandlerImpl.
     */
    @Test
    public void testSortList() {
        System.out.println("sortList");
        ArrayList<Integer> data = null;
        HandlerImpl instance = new HandlerImpl();
        ArrayList<Integer> expResult = null;
        ArrayList<Integer> result = instance.sortList(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of appendString method, of class HandlerImpl.
     */
    @Test
    public void testAppendString() {
        System.out.println("appendString");
        String str1 = "";
        String str2 = "";
        HandlerImpl instance = new HandlerImpl();
        String expResult = "";
        String result = instance.appendString(str1, str2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createPersons method, of class HandlerImpl.
     */
    @Test
    public void testCreatePersons() {
        System.out.println("createPersons");
        Object person = null;
        ArrayList<Person> persons = null;
        HandlerImpl instance = new HandlerImpl();
        instance.createPersons(person, persons);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listPersons method, of class HandlerImpl.
     */
    @Test
    public void testListPersons() {
        System.out.println("listPersons");
        Person person = null;
        HandlerImpl instance = new HandlerImpl();
        ArrayList<Person> expResult = null;
        ArrayList<Person> result = instance.listPersons(person);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOldestPerson method, of class HandlerImpl.
     */
    @Test
    public void testGetOldestPerson() {
        System.out.println("getOldestPerson");
        ArrayList<Person> persons = null;
        HandlerImpl instance = new HandlerImpl();
        Person expResult = null;
        Person result = instance.getOldestPerson(persons);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getYoungestPerson method, of class HandlerImpl.
     */
    @Test
    public void testGetYoungestPerson() {
        System.out.println("getYoungestPerson");
        ArrayList<Person> persons = null;
        HandlerImpl instance = new HandlerImpl();
        Person expResult = null;
        Person result = instance.getYoungestPerson(persons);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAtWork method, of class HandlerImpl.
     */
    @Test
    public void testIsAtWork() {
        System.out.println("isAtWork");
        int hour = 0;
        ArrayList<Person> persons = null;
        HandlerImpl instance = new HandlerImpl();
        boolean expResult = false;
        boolean result = instance.isAtWork(hour, persons);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAdultCount method, of class HandlerImpl.
     */
    @Test
    public void testIsAdultCount() {
        System.out.println("isAdultCount");
        ArrayList<Person> person = null;
        HandlerImpl instance = new HandlerImpl();
        int expResult = 0;
        int result = instance.isAdultCount(person);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
