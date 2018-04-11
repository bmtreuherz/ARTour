package bmtreuherz.artour.Activities

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Button
import bmtreuherz.artour.R
import kotlinx.android.synthetic.main.content_language.*

/**
 * Created by Ben on 3/21/2018.
 */
class LanguageActivity : NavigableActivity() {

    override fun getCurrentMenuItemID(): Int {
        return R.id.nav_language
    }

    override fun setLayout() {
        setContentView(R.layout.activity_language)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*
        Code for button, keeping in for now in case we need to use it
        val buttonEnglish = findViewById<Button>(R.id.buttonEnglish)
        buttonEnglish.setOnClickListener {
            finish()
        }
        */
    }

    //  Sets other checkboxes empty when one checkbox is clicked
    //Ensures only one option can be selected
    fun onCheckboxClicked(view: View) {

        when (view.getId()) {

            R.id.checkEnglish -> {
                Preferences.setLang("English")
                //setLanguage("English")
                checkChinese.setChecked(false)
                checkSpanish.setChecked(false)
            }
            R.id.checkSpanish -> {
                //setLanguage("Spanish")
                Preferences.setLang("Spanish")
                checkChinese.setChecked(false)
                checkEnglish.setChecked(false)
            }
            R.id.checkChinese -> {
                //setLanguage("Chinese")
                Preferences.setLang("Chinese")
                checkEnglish.setChecked(false)
                checkSpanish.setChecked(false)
            }

        }
    }
}