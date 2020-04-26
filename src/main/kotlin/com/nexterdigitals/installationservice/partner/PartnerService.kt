package com.nexterdigitals.installationservice.partner

interface PartnerService {
    fun findByName(name: String): List<Partner>
    fun create(partner: Partner): Partner
    fun findAll(): List<Partner>
    fun find(partnerDto: PartnerDto): List<Partner>
}