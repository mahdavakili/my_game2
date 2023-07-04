package vakili.mahda.mygame.ui

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import vakili.mahda.mygame.R
import vakili.mahda.mygame.databinding.ActivityHintBinding
import vakili.mahda.mygame.utils.PrefConstant.IS_LOGGED_IN



class HintActivity : AppCompatActivity() {

    lateinit var sharedPreferences: SharedPreferences
    lateinit var editor:SharedPreferences.Editor
    private lateinit var binding: ActivityHintBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHintBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupSharedPreferences()
        saveLoginState()
        binding.Play.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun saveLoginState() {
        editor = sharedPreferences.edit()
        editor.putBoolean(IS_LOGGED_IN, true)
        editor.apply()
    }

    private fun setupSharedPreferences() {
        sharedPreferences = getSharedPreferences(IS_LOGGED_IN, MODE_PRIVATE)
    }
}