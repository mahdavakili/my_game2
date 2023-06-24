package vakili.mahda.mygame.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import vakili.mahda.mygame.R
import vakili.mahda.mygame.utils.PrefConstant
import vakili.mahda.mygame.utils.PrefConstant.ENERGY
import android.content.SharedPreferences as SharedPreferences


//
class SplashActivity : AppCompatActivity() {
    lateinit var sharedPreferences: SharedPreferences
    lateinit var editor:SharedPreferences.Editor
    var ener = 5
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
            setupSharedPreference()
            checkLoginStatus()
    }



    private fun setupSharedPreference() {
        sharedPreferences = getSharedPreferences(PrefConstant.SHARED_PREFERENCE_NAME, MODE_PRIVATE)    }


    private fun checkLoginStatus() {
        val isLoggedIn = sharedPreferences.getBoolean(PrefConstant.IS_LOGGED_IN, false)
        if (isLoggedIn) {
            val intent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(intent)
        } else {
            val intent = Intent(this, HintActivity::class.java)
            startActivity(intent)
            editor = sharedPreferences.edit()
            editor.putInt(ENERGY.toString(), ener)
            editor.commit()
        }    }
}