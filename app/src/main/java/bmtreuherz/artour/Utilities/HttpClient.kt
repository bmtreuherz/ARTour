package bmtreuherz.artour.Utilities

import bmtreuherz.artour.DTOs.Feature

/**
 * Created by Bradley on 3/19/18.
 */
object HttpClient {

    fun getFeatures(): List<Feature>{
        var features = ArrayList<Feature>()
        features.add(Feature("Reitz Union", 0, 29.646333, -82.347914, "This building, officially called the J " +
                "Wayne Reitz Student Union, was " +
                "named for the University’s 5 th president. The Reitz Union was" +
                "completed in 1967. The Reitz is a student resource, and offers" +
                "many services and opportunities for all UF students.", ))
        features.add(Feature("Marston Science Library", 1,  0.0, 1.0,
                "The University of Florida Marston Science Library (MSL) is the science and " +
                        "engineering library of the University of Florida located in Gainesville, Florida, and " +
                        "is administered by the university's George A. Smathers Libraries system."
            +"The Marston Science Library hosts the university's extensive collections in agriculture," +
                        " biological sciences, chemical and physical sciences,"
            +" engineering, mathematics and statistics. ", ))
        //description from https://www.collegemagazine.com/first-let-take-selfie-famous-university-florida-landmarks/
        features.add(Feature("French Fries", 123,  5.2, 3.2,
                "Deceivingly named after a delicious fried snack, the French Fries are actually " +
                        "a series of yellow beams that crisscross together to form a monument " +
                        "called “Alachua,” named after Alachua County where UF is located. Built " +
                        "between Marston Library and the Computer Science and Engineering Building, " +
                        "this site serves as the meeting place for the “get to know UF” scavenger hunts " +
                        "that take place during freshmen welcome week where peppy upperclassmen try to " +
                        "distract new students from the horrors of on campus living and the lack of variety " +
                        "within the dining halls.", ))
        return features
    }
}