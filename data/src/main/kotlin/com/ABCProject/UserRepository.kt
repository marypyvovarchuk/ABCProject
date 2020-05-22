package com.ABCProject;

import java.util.*
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<BeaconData, Long>{
    abstract fun findByUserName(name: String): User
}