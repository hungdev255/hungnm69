package hibernate;

import entity.Car;
import entity.Vehicle;
import org.hibernate.Session;
import service.ManagerVehicle;

import javax.persistence.Query;
import java.util.List;

public class HibernateRun {
    public static void main(String[] args) {
        List a = null;
        ManagerVehicle manageVehicle = new ManagerVehicle();
        manageVehicle.run();

//        try {
//            Session session = HibernateManager.getSessionFactory().openSession();
//            session.beginTransaction();
//
//        Query query =session.createNativeQuery("{call new_procedure}", Car.class);
//        a=query.getResultList();
//            a.stream().forEach(System.out::println);
//
//            Query query =session.createNativeQuery("{call SP_GET_VEHICLE_BY_ID(?)}");
//            query.setParameter(1,2);
//            a=query.getResultList();
//            a.stream().forEach(System.out::println);
//
//            session.getTransaction().commit();
//            session.close();
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
    }
}
