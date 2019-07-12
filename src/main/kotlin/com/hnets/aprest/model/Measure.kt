package com.hnets.aprest.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "Medidas")
class Measure (
        @Id @Column(name = "IdMedida")
        var id: Int,
        @Column(name = "NomMedida")
        var name: String
)
