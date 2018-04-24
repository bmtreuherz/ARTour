package bmtreuherz.artour.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import bmtreuherz.artour.DTOs.Feature
import bmtreuherz.artour.R
import bmtreuherz.artour.Utilities.HttpClient
import kotlinx.android.synthetic.main.activity_description.*
import kotlinx.android.synthetic.main.nav_header.*
import bmtreuherz.artour.R.id.imageView
import android.graphics.drawable.Drawable
import android.view.View


class DescriptionActivity : AppCompatActivity() {

    private lateinit var featureTitleTV: TextView
    private lateinit var descriptionTitleTV: TextView
    private lateinit var featureImage: ImageView

    companion object {
        val TAG = DescriptionActivity::class.java.simpleName
        val BEACON_ID = "BeaconID"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description)

        featureTitleTV = findViewById(R.id.feature_title)
        descriptionTitleTV = findViewById(R.id.description_title)
        featureImage = findViewById(R.id.feature_image)
    }

    override fun onResume() {
        super.onResume()

        var beaconID = intent.getIntExtra(BEACON_ID, -1)
        var feature: Feature? = null
        var features = HttpClient.getFeatures()
        features.forEach {
            if (it.beaconID == beaconID){
                feature = it
            }
        }


        descriptionTitleTV.text = feature?.name
        featureTitleTV.text = feature?.description


        val uri = "@drawable/"+feature?.imageLink
        val imageResource = resources.getIdentifier(uri, null, packageName)
        val res = resources.getDrawable(imageResource)
        featureImage.setImageDrawable(res)


        //featureImage.setImageDrawable(feature?.imageLink);
        //featureImage.setImageDrawable()
        //change image here


        Log.d(TAG, "Found feature: " + feature?.name)
    }
}


