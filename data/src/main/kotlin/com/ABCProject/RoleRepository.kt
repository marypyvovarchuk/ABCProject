package com.ABCProject;

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RoleRepository : JpaRepository<BeaconData, Long> {
    abstract fun findByName(name: String): Role
}