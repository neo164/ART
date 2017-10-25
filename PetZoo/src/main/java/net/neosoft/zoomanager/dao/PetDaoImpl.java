package net.neosoft.zoomanager.dao;

import net.neosoft.zoomanager.model.Pet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public class PetDaoImpl implements PetDao {
    private static final Logger logger = LoggerFactory.getLogger(PetDaoImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addPet(Pet pet) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(pet);
        logger.info("Pet successfully saved. Pet details: " + pet);
    }

    @Override
    public void updatePet(Pet pet) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(pet);
        logger.info("Pet successfully update. Pet details: " + pet);
    }

    @Override
    public void removePet(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Pet pet = (Pet) session.load(Pet.class, new Integer(id));

        if(pet !=null){
            session.delete(pet);
        }
        logger.info("Pet successfully removed. Pet details: " + pet);
    }

    @Override
    public Pet getPetById(int id) {
        Session session =this.sessionFactory.getCurrentSession();
        Pet pet = (Pet) session.load(Pet.class, new Integer(id));
        logger.info("Pet successfully loaded. Pet details: " + pet);

        return pet;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Pet> listPets() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Pet> petList = session.createQuery("from Pet").list();

        for(Pet pet : petList){
            logger.info("Pet list: " + pet);
        }

        return petList;
    }

    @Override
    public Collection<Pet> getPets(String search) {
        Session session = this.sessionFactory.getCurrentSession();
        if(search==null||search.trim().isEmpty()){
            return session.createQuery("FROM Pet").list();
        }
        return session.createQuery("select c. from Pet where c.name like :search").
                setParameter("search", search.trim() + "%").list();
    }
}
