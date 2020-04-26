package com.nexterdigitals.installationservice.partner

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface PartnerRepository: MongoRepository<Partner, String> {
    fun findByName(name: String): List<Partner>
}