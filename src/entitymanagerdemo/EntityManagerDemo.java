/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitymanagerdemo;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Address;
import model.Customer;

/**
 *
 * @author sarun
 */
public class EntityManagerDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Customer it = createData(1);
        Customer cus1 = new Customer();
        Address add1 = new Address();
        cus1.setFirstname("John");
        cus1.setLastname("Henry");
        cus1.setEmail("jh@mail.com");
        add1.setStreet("123/4 Viphavadee Rd.");
        add1.setCity("Bangkok");
        add1.setCountry("TH");
        add1.setZipcode("10900");
        
        
        Customer it2 = createData(2);
        Customer cus2 = new Customer();
        Address add2 = new Address();
        cus2.setFirstname("Marry");
        cus2.setLastname("Jane");
        cus2.setEmail("mj@mail.com");
        add2.setStreet("123/5 Viphavadee Rd.");
        add2.setCity("Bangkok");
        add2.setCountry("TH");
        add2.setZipcode("10900");
        
        
        Customer it3 = createData(3);
        Customer cus3 = new Customer();
        Address add3 = new Address();
        cus3.setFirstname("Peter");
        cus3.setLastname("Parker");
        cus3.setEmail("pp@mail.com");
        add3.setStreet("543/21 Fake Rd.");
        add3.setCity("Nonthaburi");
        add3.setCountry("TH");
        add3.setZipcode("20900");
        
        
        Customer it4 = createData(4);
        Customer cus4 = new Customer();
        Address add4 = new Address();
        cus4.setFirstname("Bruce");
        cus4.setLastname("Wayn");
        cus4.setEmail("bw@mail.com");
        add4.setStreet("678/90 Unreal Rd.");
        add4.setCity("Pathumthani");
        add4.setCountry("TH");
        add4.setZipcode("30500");
        
        List<Customer> cusList = findAllCustomer();
       printAllCustomer(cusList);
        
        
/*
//Customer customer = new Customer(1L, "Antony", "Balla", "tballa@mail.com"); 
        //Address address = new Address(1L, "Ritherdon Rd", "London", "8QE", "UK"); 
        //address.setCustomerFk(customer);
        //customer.setAddressId(address); 
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityManagerDemoPU");
        EntityManager em = emf.createEntityManager();
        //Customer customer = em.getReference(Customer.class, 1L);
        Customer customer = em.find(Customer.class, 1L);
        //customer.setFirstname("Prayuth");
        //customer.setAddressId(null);
        //Address address = em.find(Address.class, 1L);
        //address.setCustomerFk(customer);
        //Address address = customer.getAddressId();
        //address.setCity("Gotham");
        //address.setCustomerFk(null);
        
        em.getTransaction().begin();
        try {
            //em.persist(address);
            //em.persist(customer);
            //em.flush();
            //em.persist(address);
            //em.persist(customer);
            //em.refresh(customer);
            //em.detach(customer);
            //em.persist(customer);
            //em.merge(customer);
            //em.remove(customer);
            //em.persist(customer);
            //em.remove(address);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }*/
    }

    public void persist(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityManagerDemoPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    
    public static Customer createData(int id){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityManagerDemoPU");
        EntityManager em = emf.createEntityManager();
        Customer cus = em.find(Customer.class, id);
        
        em.close();
        
        return cus;
        
    }
    
    
    
    public static List<Customer> findAllCustomer() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityManagerDemoPU");
        EntityManager em = emf.createEntityManager();
        List<Customer> cusList = (List<Customer>) em.createNamedQuery("Customer.findAll").getResultList();
        em.close();
        return cusList;
    }
    
    public static void printAllCustomer(List<Customer> CustomerList) {
        for(Customer cus : CustomerList) {
           System.out.print(cus.getId() + " ");
           System.out.print(cus.getFirstname() + " ");
           System.out.println(cus.getLastname() + " ");
           System.out.println(cus.getEmail() + " ");
       }
    }
    
    
    
    
    
    
}
