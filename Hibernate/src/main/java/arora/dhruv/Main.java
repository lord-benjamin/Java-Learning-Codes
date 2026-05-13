package arora.dhruv;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        Student s1 = new Student();
        s1.setRollNo(1234);
        s1.setName("John");
        s1.setAge(23);

        Configuration cfg = new Configuration();  // Initialize the Hibernate Configuration object to bootstrap the framework
        cfg.addAnnotatedClass(arora.dhruv.Student.class);  // Inform Hibernate which entity class is mapped to a database table
        cfg.configure();  // Loads settings from hibernate.cfg.xml (DB URL, credentials, dialect, etc.)

        SessionFactory sf = cfg.buildSessionFactory();  // Create a Thread-safe, immutable cache of compiled mappings (heavyweight; one per DB)
        Session s = sf.openSession();  // Open a short-lived connection (Session) to perform database operations  // We can open session any number of times

        Transaction trans = s.beginTransaction();  // Start a unit of work (Transaction) to ensure data integrity/atomicity

        s.persist(s1);  // Make the transient 's1' object persistent; schedules an SQL INSERT statement  // saves the data in table

        trans.commit();  // Finalize the transaction by flushing changes to the database permanently  // commits the changes we are making

        System.out.println(s1);
    }
}
