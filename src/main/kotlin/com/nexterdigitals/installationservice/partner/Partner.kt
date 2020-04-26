package com.nexterdigitals.installationservice.partner

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Partner(
        @Id var id: String?,
        var name: String
)