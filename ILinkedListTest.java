/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ilinkedlist;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nick
 */
public class ILinkedListTest {
    
    public ILinkedListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of next method, of class ILinkedList.
     */
    @Test
    public void testNext() {
        System.out.println("next");
        ILinkedList instance = new ILinkedList();
        ILinkedList expResult = null;
        ILinkedList result = instance.next();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of last method, of class ILinkedList.
     */
    @Test
    public void testLast() {
        System.out.println("last");
        ILinkedList instance = new ILinkedList();
        ILinkedList expResult = null;
        ILinkedList result = instance.last();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of after method, of class ILinkedList.
     */
    @Test
    public void testAfter() {
        System.out.println("after");
        int n = 0;
        ILinkedList instance = new ILinkedList();
        ILinkedList expResult = null;
        ILinkedList result = instance.after(n);
        assertEquals(expResult, result);
        
    }
    
    

    /**
     * Test of detach method, of class ILinkedList.
     */
    @Test
    public void testDetach() {
        System.out.println("detach");
        ILinkedList instance = new ILinkedList();
        ILinkedList expResult = null;
        ILinkedList result = instance.detach();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of get method, of class ILinkedList.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        ILinkedList instance = new ILinkedList();
        Object expResult = null;
        Object result = instance.get();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of set method, of class ILinkedList.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        Object data = null;
        ILinkedList instance = new ILinkedList();
        instance.set(data);
       
    }

    /**
     * Test of setNext method, of class ILinkedList.
     */
    @Test
    public void testSetNext() {
        System.out.println("setNext");
        ILinkedList instance = new ILinkedList();
        instance.setNext(null);
       
    }

    /**
     * Test of append method, of class ILinkedList.
     */
    @Test
    public void testAppend() {
        System.out.println("append");
        ILinkedList instance = new ILinkedList();
        instance.append(null);
        
    }

    /**
     * Test of insert method, of class ILinkedList.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        ILinkedList instance = new ILinkedList();
        instance.insert(null);
        
    }
    
}
