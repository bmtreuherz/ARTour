package bmtreuherz.artour.Activities

import android.content.Context
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.view.View
import android.widget.Button
import bmtreuherz.artour.R
import kotlinx.android.synthetic.main.popup_language.*

/**
 * Created by Ben on 3/21/2018.
 */
class Language : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.popup_language)


        val langDM = getResources().getDisplayMetrics()
        val width = langDM.widthPixels
        val height = langDM.heightPixels
        getWindow().setLayout((width*.95).toInt(), (height*.95).toInt())

        //val preferences = Preferences(this)

        val buttonEnglish = findViewById<Button>(R.id.buttonEnglish)
        buttonEnglish.setOnClickListener {
            finish()
        }
    }

    //  Sets other checkboxes empty when one checkbox is clicked
    //Ensures only one option can be selected
    fun onCheckboxClicked(view: View) {

        when (view.getId()) {

            R.id.checkEnglish -> {
                setLanguage("English")
                checkChinese.setChecked(false)
                checkSpanish.setChecked(false)
            }
            R.id.checkSpanish -> {
                setLanguage("Spanish")
                checkChinese.setChecked(false)
                checkEnglish.setChecked(false)
            }
            R.id.checkChinese -> {
                setLanguage("Chinese")
                checkEnglish.setChecked(false)
                checkSpanish.setChecked(false)
            }

        }
    }

    fun setLanguage(langChosen:String) {
        val languagePreference = getSharedPreferences("langPreference", Context.MODE_PRIVATE)
        val langEditor = languagePreference.edit()
        langEditor.putString("lang", langChosen)
        langEditor.apply()

    }

    fun getLanguage() : String {
        val languagePreference = getSharedPreferences("langPreference", Context.MODE_PRIVATE)
        val language = languagePreference.getString("lang","English")
        return language
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}