package lk.sankalpa.D24.util;

import lk.sankalpa.D24.entity.Customer;

import lk.sankalpa.D24.entity.Items;
import lk.sankalpa.D24.entity.Order_Details;
import lk.sankalpa.D24.entity.Orders;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfigeration {
    public static FactoryConfigeration factoryConfigeration;
    private SessionFactory session;

//    onfiguration configuration=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Customer.class);


    private FactoryConfigeration(){
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Customer.class).
                addAnnotatedClass(Items.class).
                addAnnotatedClass(Orders.class).
                addAnnotatedClass(Order_Details.class);
         session=configuration.buildSessionFactory();


    }

    public static FactoryConfigeration getInstance(){
        return (factoryConfigeration ==null )? factoryConfigeration = new FactoryConfigeration() : factoryConfigeration;

    }

    public Session getSession (){
        return session.openSession();
    }

}
