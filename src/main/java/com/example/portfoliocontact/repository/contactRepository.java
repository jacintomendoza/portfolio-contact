package com.example.portfoliocontact.repository;

import com.example.portfoliocontact.model.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface contactRepository extends MongoRepository<Contact, Long> {
}
