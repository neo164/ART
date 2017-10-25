package net.neosoft.zoomanager.controller;

import net.neosoft.zoomanager.model.Pet;
import net.neosoft.zoomanager.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PetController {
    private PetService petService;

    @Autowired(required = true)
    @Qualifier(value = "petService")
    public void setPetService(PetService ps) {
        this.petService = ps;
    }

    @RequestMapping(value = "/pet", method = RequestMethod.GET)
    public String listPets(Model model){
        model.addAttribute("pet", new Pet());
        model.addAttribute("listPets", this.petService.listPets());

        return "pet";
    }

    @RequestMapping(value = "/pet/add", method = RequestMethod.POST)
    public String addPet(@ModelAttribute("pet") Pet pet){
        if(pet.getId() == 0){
            this.petService.addPet(pet);
        }else {
            this.petService.updatePet(pet);
        }

        return "redirect:/pet";
    }

    @RequestMapping("/remove/{id}")
    public String removePet(@PathVariable("id") int id){
        this.petService.removePet(id);

        return "redirect:/pet";
    }

    @RequestMapping("edit/{id}")
    public String editPet(@PathVariable("id") int id, Model model){
        model.addAttribute("pet", this.petService.getPetById(id));
        model.addAttribute("listPets", this.petService.listPets());

        return "pet";
    }

    @RequestMapping("petdata/{id}")
    public String petData(@PathVariable("id") int id, Model model){
        model.addAttribute("pet", this.petService.getPetById(id));

        return "petdata";
    }
}
