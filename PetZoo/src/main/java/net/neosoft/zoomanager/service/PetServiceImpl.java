package net.neosoft.zoomanager.service;

import net.neosoft.zoomanager.dao.PetDao;
import net.neosoft.zoomanager.model.Pet;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

@Service
public class PetServiceImpl implements PetService {
    private PetDao petDao;

    public void setPetDao(PetDao petDao) {
        this.petDao = petDao;
    }

    @Override
    @Transactional
    public void addPet(Pet pet) {
        this.petDao.addPet(pet);
    }

    @Override
    @Transactional
    public void updatePet(Pet pet) {
        this.petDao.updatePet(pet);
    }

    @Override
    @Transactional
    public void removePet(int id) {
        this.petDao.removePet(id);
    }

    @Override
    @Transactional
    public Pet getPetById(int id) {
        return this.petDao.getPetById(id);
    }

    @Override
    @Transactional
    public List<Pet> listPets() {
        return this.petDao.listPets();
    }

    @Override
    @Transactional
    public Collection<Pet> getPets(String search) {
        return this.petDao.getPets(search);
    }
}
