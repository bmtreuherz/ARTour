package bmtreuherz.artour.Utilities

import bmtreuherz.artour.DTOs.Feature

/**
 * Created by Bradley on 3/19/18.
 */
object HttpClient {

    fun getFeatures(): List<Feature>{
        var features = ArrayList<Feature>()
        features.add(Feature("Reitz Union", 0, 29.646333, -82.347914, "This is the Reitz Untion!"))
        features.add(Feature("Printer Lab", 1,  0.0, 1.0, "This is the Reitz Grand printer lab"))
        features.add(Feature("French Fries", 2,  5.2, 3.2, "These are the french fries"))
        return features
    }
}