package com.hnets.aprest.persistence

import com.hnets.aprest.model.Person
import org.springframework.data.repository.CrudRepository

interface PersonRepository : CrudRepository<Person, Long> {
}
