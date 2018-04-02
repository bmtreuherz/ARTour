package bmtreuherz.artour.Services

import bmtreuherz.artour.DTOs.Feature
import bmtreuherz.artour.DTOs.Location

/**
 * Created by Bradley on 3/19/18.
 */
class HttpClient {

    // Retrieves a list of Locations.
    fun getLocations(): List<Location>{
        // TODO: Implement with actual network call
        var list =  ArrayList<Location>()

        var reitzFeatures = ArrayList<Feature>()
        reitzFeatures.add(Feature("Grand Ballroom", "This is the Reitz Grand ballroom", 0))
        reitzFeatures.add(Feature("Printer Lab", "This is the Reitz Grand printer lab", 1))
        list.add(Location("Reitz Union", 29.646333, -82.347914, "This is the Reitz Untion!", reitzFeatures))

        var marstonFeatures = ArrayList<Feature>()
        marstonFeatures.add(Feature("French Fries", "These are the french fries", 2))
        list.add(Location("Marston Science Library", 29.648086, -82.344181, "This is the Marston Science Library", marstonFeatures))
        return list
    }
}