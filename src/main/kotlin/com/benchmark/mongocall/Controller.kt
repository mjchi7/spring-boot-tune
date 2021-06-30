package com.benchmark.mongocall

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller(
    private val repo: FeatureRepository
) {

    @GetMapping(
        path = ["/api/v1/{featureName}"],
        produces = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun getFeature(@PathVariable featureName: String): QueryResponse {
        return repo.findByFeatureName(featureName)
            ?.let {
                QueryResponse(it.isActive)
            }
            ?: QueryResponse(false)
    }
}

data class QueryResponse(
    val isActive: Boolean
)