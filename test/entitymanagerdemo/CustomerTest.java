/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitymanagerdemo;

import java.util.Collection;
import model.Address;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ASUS
 */
public class CustomerTest {
    
    public CustomerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Customer.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Customer instance = new Customer();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Customer.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Customer instance = new Customer();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstname method, of class Customer.
     */
    @Test
    public void testGetFirstname() {
        System.out.println("getFirstname");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.getFirstname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstname method, of class Customer.
     */
    @Test
    public void testSetFirstname() {
        System.out.println("setFirstname");
        String firstname = "";
        Customer instance = new Customer();
        instance.setFirstname(firstname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastname method, of class Customer.
     */
    @Test
    public void testGetLastname() {
        System.out.println("getLastname");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.getLastname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastname method, of class Customer.
     */
    @Test
    public void testSetLastname() {
        System.out.println("setLastname");
        String lastname = "";
        Customer instance = new Customer();
        instance.setLastname(lastname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Customer.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Customer.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Customer instance = new Customer();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAddressCollection method, of class Customer.
     */
    @Test
    public void testGetAddressCollection() {
        System.out.println("getAddressCollection");
        Customer instance = new Customer();
        Collection<Address> expResult = null;
        Collection<Address> result = instance.getAddressCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAddressCollection method, of class Customer.
     */
    @Test
    public void testSetAddressCollection() {
        System.out.println("setAddressCollection");
        Collection<Address> addressCollection = null;
        Customer instance = new Customer();
        instance.setAddressCollection(addressCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Customer.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Customer instance = new Customer();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Customer.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Customer instance = new Customer();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Customer.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
