package com.zensar.hibernate.main;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Product;

//HQL-Hibernate Query Language(Object Oriented Query Language)
public class HQLMain {

public static void main(String[] args) {
// TODO Auto-generated method stub
Configuration c=new Configuration().configure();
//singleton and heavy weight SessionFactory
SessionFactory f=c.buildSessionFactory();
//represents database connection and light weight
Session s=f.openSession();
Transaction t=s.beginTransaction();

//JPA Query
//Query q=s.createQuery("from Product");
//Query q=s.createQuery("from Product p where p.price>1005 and p.price<50000");  //here price is instance variable of Product class(Bean class)
//Query q=s.createQuery("from Product p where p.price between 2000 and 40000");
//Query q=s.createQuery("from Product p where p.brand like's%'");
/*Query q=s.createQuery("from Product p where p.name='Mobile'");
List<Product> products=q.getResultList();
for(Product p:products)
{
System.out.println(p);
}*/

//Query q=s.createQuery("select p.name,p.price from Product p");  //p is alias for Product class
//Query q=s.createQuery("select p.productId,p.name,p.brand from Product p");
/*Query q=s.createQuery("select p.price,p.brand,p.name from Product p");
List<Object[]> objects=q.getResultList();           //list of array of objects
for(Object[] ob:objects)
{
for(int i=0;i<ob.length;i++)
{
System.out.println(ob[i]);
}
}*/


Query q=s.createQuery("select max(p.price) from Product p");
Float maxPrice=(Float) q.getSingleResult();    //Float->Wrapper class
System.out.println("Max Price : "+maxPrice);

Query q1=s.createQuery("select min(p.price) from Product p");
Float minPrice=(Float) q1.getSingleResult();
System.out.println("Min Price : "+minPrice);

Query q2=s.createQuery("select sum(p.price) from Product p");
Double sumPrice=(Double) q2.getSingleResult();
System.out.println("Total Price : "+sumPrice);

Query q3=s.createQuery("select avg(p.price) from Product p");
Double avgPrice=(Double) q3.getSingleResult();
System.out.println("Average : "+avgPrice);

Query q4=s.createQuery("select count(p.price) from Product p");
Long countPrice=(Long) q4.getSingleResult();
System.out.println("Count Of Price : "+countPrice);


/*
//Using Depricated method createCriteria()
Criteria cr=s.createCriteria(Product.class);
List<Product> products=cr.list();
for(Product p:products)
{
System.out.println(p);
}*/










t.commit();   //in dml operations
s.close();

}

}

