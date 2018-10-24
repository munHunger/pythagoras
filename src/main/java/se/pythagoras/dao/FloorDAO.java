package se.pythagoras.dao;

import org.hibernate.Session;
import se.pythagoras.model.entity.Floor;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class FloorDAO extends DatabaseDAO {
    public List<Floor> getAll() {
        try (Session session = sessionFactory.openSession()){
            return session.createQuery("from Floor", Floor.class).list();
        }
    }

    public void save(Floor floor) {
        try(Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.save(floor);
            session.getTransaction().commit();
        }
    }
}
