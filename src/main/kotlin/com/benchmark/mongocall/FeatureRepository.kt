package com.benchmark.mongocall

import org.springframework.data.mongodb.repository.MongoRepository

interface FeatureRepository : MongoRepository<Feature, String>{
    fun findByFeatureName(featureName: String): Feature?
}