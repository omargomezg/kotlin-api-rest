package com.hnets.aprest.model

import javax.persistence.*

@Entity
data class User(
        @Id
        var username: String,
        var password: String,
        var profile: String,
        @OneToOne(cascade = arrayOf(CascadeType.ALL), fetch = FetchType.LAZY, optional = true)
        @JoinColumn(name = "person_id", referencedColumnName = "rut")
        var person: Person
)
