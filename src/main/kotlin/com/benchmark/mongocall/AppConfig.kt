package com.benchmark.mongocall

import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories
import javax.annotation.PostConstruct

@Configuration
@EnableMongoRepositories
class AppConfig(
    private val repo: FeatureRepository
) {
    @PostConstruct
    fun populateFeature() {
        repo.save(Feature(
            featureName = "FOCUS",
            isActive = true
        ))
    }
}