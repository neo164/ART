package net.neosoft.zoomanager.service;

import net.neosoft.zoomanager.model.Pet;

import java.util.Collection;
import java.util.List;

public interface PetService {
    public void addPet(Pet pet);

    public void updatePet(Pet pet);

    public void removePet(int id);

    public Pet getPetById(int id);

    public List<Pet> listPets();

    Collection<Pet> getPets(String search);
}
