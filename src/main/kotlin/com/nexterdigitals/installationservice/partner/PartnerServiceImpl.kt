package com.nexterdigitals.installationservice.partner

import org.springframework.data.mongodb.core.query.Criteria
import org.springframework.stereotype.Service

@Service
class PartnerServiceImpl(
        private val partnerRepository: PartnerRepository
): PartnerService {

    override fun findByName(name: String): List<Partner> {
        return partnerRepository.findByName(name)
    }

    override fun create(partner: Partner): Partner {
        return partnerRepository.save(partner)
    }

    override fun findAll(): List<Partner> {
        return partnerRepository.findAll()
    }

    override fun find(partnerDto: PartnerDto): List<Partner> {
        return partnerRepository.findByName(partnerDto.name!!)
    }
}