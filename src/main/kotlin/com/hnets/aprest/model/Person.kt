package com.hnets.aprest.model

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.OneToOne

@Entity
data class Person(
        @Id
        var rut: String,
        var firstName: String,
        var middleName: String,
        var lastName: String,
        var email: String,
        @OneToOne(mappedBy = "person")
        val user: User
)
