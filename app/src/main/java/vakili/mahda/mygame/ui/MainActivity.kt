package vakili.mahda.mygame.ui

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import vakili.mahda.mygame.R
import vakili.mahda.mygame.databinding.ActivityMainBinding
import vakili.mahda.mygame.utils.PrefConstant
import vakili.mahda.mygame.utils.PrefConstant.ENERGY



class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var sharedPreferences: SharedPreferences
    lateinit var editor:SharedPreferences.Editor
//    val defaultValue = resources.getInteger(R.integer.ENERGY)
//    var ener = sharedPreferences.getInt(getString(R.string.ENERGY), defaultValue)
     var ener = 5

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var button5 = false
        var button10 = false
        var button15 = false
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupSharedPreferences()
        ener = sharedPreferences.getInt(PrefConstant.ENERGY.toString(), 5)
        setupTimer()
        binding.energyButton.text = ener.toString()
        if (ener==0){
            binding.playButton.isClickable= false
        }




        binding.settingButton.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            startActivity(intent)
        }

        binding.playButton.setOnClickListener {
            val intent = Intent(this, PlayActivity::class.java)
            ener = ener - 1
            editor = sharedPreferences.edit()
            editor.putInt(getString(R.string.ENERGY), ener)
            editor.commit()
            startActivity(intent)

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

        binding.button5.setOnClickListener{
            if (button5 == false) {
                binding.textView5.alpha= 0F
                binding.textView10.alpha= 1F
                binding.textView15.alpha= 1F
                binding.imageView5.alpha = 1F
                binding.imageView10.alpha = 0F
                binding.imageView15.alpha = 0F
                button5 = true
                button10 = false
                button15 = false

            }else{
                binding.textView5.alpha= 1F
                binding.imageView5.alpha = 0F
                button5 = false
            }

        }
        binding.button10.setOnClickListener{
            if (button10 == false) {
                binding.textView5.alpha= 1F
                binding.textView10.alpha= 0F
                binding.textView15.alpha= 1F
                binding.imageView5.alpha = 0F
                binding.imageView10.alpha = 1F
                binding.imageView15.alpha = 0F
                button5 = false
                button10 = true
                button15 = false
            }else{
                binding.textView10.alpha= 1F
                binding.imageView10.alpha = 0F
                button10 = false
            }
        }
        binding.button15.setOnClickListener{
            if (button15 == false) {
                binding.textView5.alpha= 1F
                binding.textView10.alpha= 1F
                binding.textView15.alpha= 0F
                binding.imageView5.alpha = 0F
                binding.imageView10.alpha = 0F
                binding.imageView15.alpha = 1F
                button5 = false
                button10 = false
                button15 = true
            }else{
                binding.textView15.alpha= 1F
                binding.imageView15.alpha = 0F
                button15 = false
            }
        }





        }

    private fun setupTimer() {

        if(ener == 5){binding.time.text = "full"}else {
            val timer = object : CountDownTimer(20000, 1000) {
                override fun onTick(millisUntilFinished: Long) {
                    binding.time.setText("" + millisUntilFinished / 1000)
                }

                override fun onFinish() {
                    ++ener
                    binding.energyButton.text = ener.toString()
                    editor = sharedPreferences.edit()
                    editor.putInt(getString(R.string.ENERGY), ener)
                    editor.commit()
                    startActivity(intent)
                }
            }
            timer.start()
        }
    }

    private fun setupSharedPreferences() {
        sharedPreferences = getSharedPreferences(ENERGY.toString(), MODE_PRIVATE)
    }


}





