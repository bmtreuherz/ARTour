package bmtreuherz.artour.DTOs

/**
 * Created by Bradley on 3/19/18.
 */
class Location {
    var name: String
    var long: Double
    var lat: Double
    var description: String
    var features: List<Feature>

    constructor(name: String, long: Double, lat: Double, description: String, features: List<Feature>){
        this.name = name
        this.long = long
        this.lat = lat
        this.description = description
        this.features = features
    }
}