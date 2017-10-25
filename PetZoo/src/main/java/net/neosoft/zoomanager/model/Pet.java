package net.neosoft.zoomanager.model;

import javax.persistence.*;

@Entity
@Table(name = "pet")
public class Pet {
    @Id
    @Column(name = "petid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "type_pet")
    private String typePet;

    public String getTypePet() {return typePet;}
    public void setTypePet(String typePet) {this.typePet = typePet;}

    @Column(name = "name")
    private String namePet;

    public String getNamePet() {
        return namePet;
    }
    public void setNamePet(String namePet) {
        this.namePet = namePet;
    }

    @Column(name = "owner")
    private String ownerPet;

    public String getOwnerPet() {return ownerPet;}
    public void setOwnerPet(String ownerPet) {this.ownerPet = ownerPet;}

    @Column(name = "gender")
    private String genderPet;

    public String getGenderPet() {return genderPet;}
    public void setGenderPet(String genderPet) {this.genderPet = genderPet;}

    @Column(name = "description")
    private String descriptionPet;

    public String getDescriptionPet() {return descriptionPet;}
    public void setDescriptionPet(String descriptionPet) {this.descriptionPet = descriptionPet;}

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", typePet='" + typePet + '\'' +
                ", namePet='" + namePet + '\'' +
                ", ownerPet='" + ownerPet + '\'' +
                ", ownerPet='" + genderPet + '\'' +
                ", descriptionPet='" + descriptionPet + '\'' +
                '}';
    }
}
