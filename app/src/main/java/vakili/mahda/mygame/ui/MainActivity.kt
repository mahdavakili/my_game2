package vakili.mahda.mygame.ui

import android.app.Activity
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import vakili.mahda.mygame.R
import vakili.mahda.mygame.databinding.ActivityMainBinding
import vakili.mahda.mygame.utils.PrefConstant.ENERGY



class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var sharedPreferences: SharedPreferences
    lateinit var editor:SharedPreferences.Editor
//    val defaultValue = resources.getInteger(R.integer.ENERGY)
//    var ener = sharedPreferences.getInt(getString(R.string.ENERGY), defaultValue)
     var ener = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupSharedPreferences()

        binding.energyButton.text = ener.toString()





        binding.settingButton.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            startActivity(intent)
        }

        binding.playButton.setOnClickListener {
                val intent = Intent(this, PlayActivity::class.java)
                if (ener> 0) {
                    startActivity(intent)
                }else {
                    binding.playButton.isClickable= false
                }
                ENERGY = ENERGY - 1
                ener = ener - 1
                setupTimer()
                binding.energyButton.text = ener.toString()
                editor = sharedPreferences.edit()
                editor.putInt(getString(R.string.ENERGY), ener)
                editor.commit()

            }



        binding.inviteButton.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            startActivity(intent)
        }
        binding.shopButton.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            startActivity(intent)
        }
        binding.energyButton.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            startActivity(intent)
        }



    }

    private fun setupTimer() {
        if (ener<5){
          val timer = object: CountDownTimer(20000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                binding.time.setText( ""+ millisUntilFinished / 1000)
            }

            override fun onFinish() {
                ++ener
                binding.energyButton.text = ener.toString()
                if(ener >= 5){binding.time.text = "full"}
            }
           }
         timer.start()
        }
    }

    private fun setupSharedPreferences() {
        sharedPreferences = getSharedPreferences(ENERGY.toString(), MODE_PRIVATE)
    }


}





