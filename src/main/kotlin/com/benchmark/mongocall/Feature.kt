package com.benchmark.mongocall

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document

@Document
class Feature(
    @Indexed
    @Id
    val featureName: String,
    val isActive: Boolean = false
)