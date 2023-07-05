package vakili.mahda.mygame.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import vakili.mahda.mygame.R
import vakili.mahda.mygame.databinding.ActivityPlayBinding
import vakili.mahda.mygame.databinding.ActivitySettingBinding

class SettingActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySettingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button.setOnClickListener {
            onBackPressed()
        }
    }
}