package com.example.portfoliocontact.controller;

import com.example.portfoliocontact.model.Contact;
import com.example.portfoliocontact.repository.contactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ResponseBody
@CrossOrigin
@RestController
public class contactController {

    @Autowired
    private contactRepository contactRepo;

    @GetMapping(value = "/")
    public String getPage() {
        return "Welcome";
    }

    @PostMapping(value="/addContact")
    public String saveContact(@RequestBody Contact contact){
        contactRepo.save(contact);
        return "Saved...";
    }

    @GetMapping(value = "/contacts")
    public List<Contact> getContacts() {
        return contactRepo.findAll();
    }

    @PutMapping(value = "/update/{id}")
    public String updateContact(@PathVariable long id, @RequestBody Contact contact){
        Contact updatedContact = contactRepo.findById(id).get();
        updatedContact.setFullName(contact.getFullName());
        updatedContact.setEmail(contact.getEmail());
        updatedContact.setComment(contact.getComment());
        contactRepo.save(updatedContact);
        return "Updated...";
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteContact(@PathVariable long id){
        Contact deleteContact = contactRepo.findById(id).get();
        contactRepo.delete(deleteContact);
        return "Deleted contact with the id: "+id;
    }

}
