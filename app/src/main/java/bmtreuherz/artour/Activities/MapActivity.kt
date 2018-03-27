package bmtreuherz.artour.Activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.view.MenuItem
import bmtreuherz.artour.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*

class MapActivity : NavigableActivity() {

    override fun getCurrentMenuItemID(): Int {
        return R.id.nav_map
    }

    override fun setLayout() {
        setContentView(R.layout.activity_map)
    }

}
