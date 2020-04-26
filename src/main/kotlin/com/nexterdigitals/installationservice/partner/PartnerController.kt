package com.nexterdigitals.installationservice.partner

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(path = ["/api/v1/partner"])
class PartnerController(
        private val partnerService: PartnerService
) {
    @PostMapping
    fun create(@RequestBody partner: Partner): Partner {
        return partnerService.create(partner)
    }

    @GetMapping
    fun find(partnerDto: PartnerDto): List<Partner> {
        return partnerService.find(partnerDto)
    }
}