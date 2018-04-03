package bmtreuherz.artour.Activities

import android.bluetooth.BluetoothManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.content.LocalBroadcastManager
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import bmtreuherz.artour.ARTourApplication
import bmtreuherz.artour.R
import bmtreuherz.artour.Utilities.BeaconEventBroadcastReceiver
import bmtreuherz.artour.Utilities.PermissionHelper
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*
import com.google.android.gms.common.ConnectionResult
import com.google.android.gms.common.GoogleApiAvailability

class MainActivity : NavigableActivity() {

    companion object {
        val TAG = MainActivity::class.java.simpleName
    }

    private lateinit var beaconEventBroadcastReceiver: BeaconEventBroadcastReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Create the broadcast receiver. This is how we will get notified when we enter or exit the region of a beacon
        beaconEventBroadcastReceiver = BeaconEventBroadcastReceiver(object:BeaconEventBroadcastReceiver.BeaconEventDelegate{
            override fun onEnteredRange(beaconID: Int) {
                Log.d(TAG, "Entered Range of Beacon: " + beaconID)

                // Note: At any time, we can get the beaconIDs of all beacons that are currently in range by using:
                var beacons = ARTourApplication.getBeaconsInRange()
            }

            override fun onExitedRange(beaconID: Int) {
                Log.d(TAG, "Exited Range of Beacon " + beaconID)
            }
        })
    }

    override fun onResume() {
        super.onResume()

        // When this activity is in the foreground, we want to register to receive beacon events.
        var filter = beaconEventBroadcastReceiver.createFilter()
        LocalBroadcastManager.getInstance(this).registerReceiver(beaconEventBroadcastReceiver, filter)

        // Check and request bluetooth permissions
        if (!PermissionHelper.hasScanningPermissions(this)){
            return
        }

        // Search for beacons. If we are already searching this will do nothing.
        (application as ARTourApplication).startSearchingForBeacons()
    }

    override fun onPause() {
        super.onPause()

        // When this activity goes in the background, don't receive notifications anymore.
        LocalBroadcastManager.getInstance(this).unregisterReceiver(beaconEventBroadcastReceiver)
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun getCurrentMenuItemID(): Int {
        return R.id.nav_home
    }

    override fun setLayout() {
        setContentView(R.layout.activity_main)
    }
}
