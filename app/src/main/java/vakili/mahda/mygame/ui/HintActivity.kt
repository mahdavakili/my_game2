package vakili.mahda.mygame.ui

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import vakili.mahda.mygame.R
import vakili.mahda.mygame.utils.PrefConstant
import vakili.mahda.mygame.utils.PrefConstant.SHARED_PREFERENCE_NAME

class HintActivity : AppCompatActivity() {

    lateinit var sharedPreferences: SharedPreferences
    lateinit var editor:SharedPreferences.Editor


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hint)
        setupSharedPreferences()
        saveLoginState()
    }

    private fun saveLoginState() {
        editor = sharedPreferences.edit()
        editor.putBoolean(PrefConstant.IS_LOGGED_IN, true)
        editor.apply()
    }

    private fun setupSharedPreferences() {
        sharedPreferences = getSharedPreferences(SHARED_PREFERENCE_NAME, MODE_PRIVATE)
    }
}