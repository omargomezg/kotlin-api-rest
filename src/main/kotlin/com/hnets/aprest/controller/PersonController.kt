package com.hnets.aprest.controller

import com.hnets.aprest.model.Person
import com.hnets.aprest.persistence.PersonRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/person")
class PersonController(val repository: PersonRepository) {

    @GetMapping
    fun findAll() = repository.findAll()

    @PostMapping
    fun addPerson(@RequestBody person: Person)
            = repository.save(person)

}
