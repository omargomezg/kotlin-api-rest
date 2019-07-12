package com.hnets.aprest.model

import javax.persistence.*

@Entity
class Product (
        @Id @Column(name = "idArticulo")
        var sku: String = "",
        @Column(name = "nomArticulo")
        var name: String = "",
        @ManyToOne @JoinColumn(name = "id_medida")
        var measure: Measure
)
