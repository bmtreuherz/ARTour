package bmtreuherz.artour.DTOs

/**
 * Created by Bradley on 3/19/18.
 */
class Feature {
    var name: String
    var description: String
    var beaconID: Int

    constructor(name: String, description: String, beaconID: Int){
        this.name = name
        this.description = description
        this.beaconID = beaconID
    }
}