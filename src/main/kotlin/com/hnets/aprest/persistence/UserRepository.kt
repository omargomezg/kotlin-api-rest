package com.hnets.aprest.persistence

import com.hnets.aprest.model.User
import org.springframework.data.repository.CrudRepository

interface UserRepository: CrudRepository<User, String> {
}
