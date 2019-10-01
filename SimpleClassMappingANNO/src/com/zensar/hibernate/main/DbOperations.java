
package com.zensar.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Product;

public class DbOperations {

public static void main(String[] args) {

Configuration c = new Configuration().configure();
//singleton and heavy weight session factory
SessionFactory f = c.buildSessionFactory();
Session s = f.openSession(); //represents database connection & light weight
Transaction t = s.beginTransaction();

//insert new record
Product p = new Product(1006, "Tablet","HP",54565);
s.save(p);



t.commit();  //in dml operations
s.close();

}
}