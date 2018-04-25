package bmtreuherz.artour.Activities

import android.content.Intent
import android.content.pm.PackageManager
import android.location.Location
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.view.MenuItem
import android.animation.ValueAnimator
import android.content.DialogInterface
import com.google.android.gms.maps.model.Circle
import com.google.android.gms.maps.model.CircleOptions
import bmtreuherz.artour.R
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import android.graphics.Color
import android.support.v4.content.LocalBroadcastManager
import android.support.v7.app.AlertDialog
import android.util.Log
import bmtreuherz.artour.ARTourApplication
import bmtreuherz.artour.DTOs.Feature
import bmtreuherz.artour.R.id.drawer_layout
import bmtreuherz.artour.R.id.nav_view
import bmtreuherz.artour.Utilities.BeaconEventBroadcastReceiver
import bmtreuherz.artour.Utilities.HttpClient
import java.util.jar.Manifest
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*

class MapActivity : NavigableActivity() {
    override fun getCurrentMenuItemID(): Int {
        return R.id.nav_map
    }

    override fun setLayout() {
        setContentView(R.layout.activity_map)
    }

    private lateinit var map: GoogleMap
    private lateinit var fusedLocationClient: FusedLocationProviderClient
    private lateinit var lastLocation: Location

    // Event Receiver
    private lateinit var beaconEventBroadcastReceiver: BeaconEventBroadcastReceiver
    // All features
    private lateinit var features: List<Feature>

    companion object {
        private const val LOCATION_PERMISSION_REQUEST_CODE = 1
    }

    private var onMapReadyCallback = object: OnMapReadyCallback{
        override fun onMapReady(googleMap: GoogleMap) {

            var locationList = listOf(listOf(29.647999, -82.344002),
                    listOf(29.647958, -82.344326), listOf(29.648381, -82.344295),
                    listOf(29.648257, -82.345280), listOf(29.648121, -82.345487),
                    listOf(29.648812, -82.343288), listOf(29.649065, -82.343736),
                    listOf(29.649111, -82.343736), listOf(29.649295, -82.343963),
                    listOf(29.649223, -82.343617), listOf(29.649125, -82.345061),
                    listOf(29.650302, -82.341549), listOf(29.650151, -82.342051),
                    listOf(29.650547, -82.342851), listOf(29.651459, -82.342897),
                    listOf(29.649571, -82.346503), listOf(29.650128, -82.346760),
                    listOf(29.649277, -82.346394), listOf(29.649397, -82.346529),
                    listOf(29.647123, -82.344737), listOf(29.646526, -82.342058),
                    listOf(29.649461, -82.339836), listOf(29.651233, -82.346558),
                    listOf(29.644342, -82.342917), listOf(29.646940, -82.341239),
                    listOf(29.648010, -82.350112), listOf(29.645783, -82.342167),
                    listOf(29.530469, -82.303161), listOf(29.642483, -82.369324),
                    listOf(29.649973, -82.748583), listOf(29.649488, -82.351118),
                    listOf(29.635939, -82.369814), listOf(29.676315, -82.370336),
                    listOf(29.637063, -82.370145), listOf(29.635264, -82.369307),
                    listOf(29.368329, -82.368329))

            var locations = mapOf(locationList[0] to "Marston Science Library", locationList[1] to "French Fries",
                    locationList[2] to "Computer Science & Engineering Building", locationList[3] to "The Hub",
                    locationList[4] to "International Student Center", locationList[5] to "Century Tower",
                    locationList[6] to "University Auditorium", locationList[7] to "Turlington Plaza",
                    locationList[8] to "Turlington Hall", locationList[9] to "The Potato",
                    locationList[10] to "Newell Hall", locationList[11] to "Criser Hall",
                    locationList[12] to "Peabody Hall", locationList[13] to "Plaza of the Americas",
                    locationList[14] to "Library West", locationList[15] to "Infirmary",
                    locationList[16] to "Student Rec", locationList[17] to "Honors Program",
                    locationList[18] to "Innovation Academy", locationList[19] to "Field and Fork",
                    locationList[20] to "Broward Hall", locationList[21] to "Tigert Hall",
                    locationList[22] to "Murphree", locationList[23] to "Safety",
                    locationList[24] to "Broward Dining Hall", locationList[25] to "Gator Dining",
                    locationList[26] to "Broward Rec", locationList[27] to "Lake Wauberg",
                    locationList[28] to "Counseling and Wellness Center", locationList[29] to "Ben Hill Griffin Stadium",
                    locationList[30] to "Stephen C. O'Connell Center", locationList[31] to "Florida Museum of Natural History",
                    locationList[32] to "Butterfly Rainforest", locationList[33] to "Harn Museum of Art",
                    locationList[34] to "Phillips Center for Performing Arts")

            map = googleMap

            map.uiSettings.isZoomControlsEnabled = true
            map.setOnMarkerClickListener(onMarkerClickListener)
            for (i in 0..locations.size)
                map.addCircle(CircleOptions()
                        .center(LatLng(locationList[i][0], locationList[i][1]))
                        .radius(20.0)
                        .strokeColor(Color.argb(255, 255, 255, 255))
                        .fillColor(Color.argb(40, 0, 102, 255))
                )

            setUpMap()
        }
    }

    private var onMarkerClickListener = object: GoogleMap.OnMarkerClickListener {
        override fun onMarkerClick(marker: Marker?): Boolean {
            return false
        }
    }

   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(onMapReadyCallback)

        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)


       //Sets instructions for what to do when you get close to a beacon on map screen and gives alertdialog
       val builder = AlertDialog.Builder(this)
       beaconEventBroadcastReceiver = BeaconEventBroadcastReceiver(object: BeaconEventBroadcastReceiver.BeaconEventDelegate{
           override fun onEnteredRange(beaconID: Int) {
               //adds the nearby feature to the features list
               Log.d("FEATURES", "Found one in Range")
               features.filter { it.beaconID == beaconID }

               //We will probably want to add vibration to alert user when dialog happens
               builder.setTitle("Nearby Beacon Detected")
               builder.setMessage("Would you like to get more information about this location?")
               builder.setPositiveButton("Yes", { dialogInterface: DialogInterface, i: Int ->
                   //Take the user to desription page for specific beacon here
               })
               builder.setNegativeButton("No", { dialogInterface: DialogInterface, i: Int ->
                   //If the user clicks no, exit the dialog and do nothing
               })
               builder.show()
           }

           override fun onExitedRange(beaconID: Int) {
               Log.d("FEATURES", "Found one exited  Range")
               features.filter { it.beaconID == beaconID }
               //will likely want to close out of alert dialog here
           }
       })

    }

    override fun onResume() {
        super.onResume()

        var featuresInRange = ARTourApplication.beaconsInRange
        features = HttpClient.getFeatures()
        for (featureInRange in featuresInRange){
            features
                    .filter { it.beaconID == featureInRange }
        }

        var filter = beaconEventBroadcastReceiver.createFilter()
        LocalBroadcastManager.getInstance(this).registerReceiver(beaconEventBroadcastReceiver, filter)
    }


    private fun setUpMap() {
        if (ActivityCompat.checkSelfPermission(this,
                android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                    arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION), LOCATION_PERMISSION_REQUEST_CODE)
            return
        }

        // 1
        map.isMyLocationEnabled = true
        map.mapType = GoogleMap.MAP_TYPE_NORMAL

        // 2
        fusedLocationClient.lastLocation.addOnSuccessListener(this) { location ->
            // Got last known location. In some rare situations this can be null.
            // 3
            if (location != null) {
                lastLocation = location
                val currentLatLng = LatLng(location.latitude, location.longitude)
                map.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLatLng, 18f))
            }
        }
    }
}

