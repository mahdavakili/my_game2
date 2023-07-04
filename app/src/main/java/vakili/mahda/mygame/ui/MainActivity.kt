package vakili.mahda.mygame.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.os.CountDownTimer
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import vakili.mahda.mygame.R
import vakili.mahda.mygame.databinding.ActivityMainBinding
import vakili.mahda.mygame.utils.PrefConstant.DAY
import vakili.mahda.mygame.utils.PrefConstant.ENERGY
import vakili.mahda.mygame.utils.PrefConstant.HOUR
import vakili.mahda.mygame.utils.PrefConstant.MIN
import vakili.mahda.mygame.utils.PrefConstant.SECOND
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.ZoneOffset
import kotlin.time.Duration.Companion.minutes


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var sharedPreferences: SharedPreferences
    lateinit var editor:SharedPreferences.Editor
    var ener = 5
    @RequiresApi(Build.VERSION_CODES.O)
    var now = LocalDateTime.now()
    @RequiresApi(Build.VERSION_CODES.O)
    var second = now.toEpochSecond(ZoneOffset.UTC)
    lateinit var mon:String


    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var button5 = false
        var button10 = false
        var button15 = false
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupSharedPreferences()
        ener = sharedPreferences.getInt(ENERGY.toString(), 5)
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
            if (ener == 5){
                saveTime()
            }
            ener--
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


    @RequiresApi(Build.VERSION_CODES.O)
    private fun saveTime() {
        editor = sharedPreferences.edit()
        editor.putLong(SECOND, second)
        editor.commit()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun setupTimer() {
        val savedSecond = sharedPreferences.getLong(SECOND, 0)
        val enerDifference = 5-ener
        val secondDiffrence = (second-savedSecond)
        val rem = (secondDiffrence%300)*1000
        val div: Int = ((secondDiffrence-rem)/300).toInt()
        if (secondDiffrence<enerDifference*300){

            ener = ener + div
            object : CountDownTimer(rem, 1000) {

                override fun onTick(millisUntilFinished: Long) {
                    binding.time.setText("" + millisUntilFinished/ 1000)
                }

                override fun onFinish() {
                    ener++
                    editor = sharedPreferences.edit()
                    editor.putInt(getString(R.string.ENERGY), ener)
                    editor.commit()
                }
            }.start()
        }else{
            ener = 5
            editor = sharedPreferences.edit()
            editor.putInt(getString(R.string.ENERGY), ener)
            editor.commit()
            binding.time.text = "full"

        }


    }



    private fun setupSharedPreferences() {
        sharedPreferences = getSharedPreferences(ENERGY.toString(), MODE_PRIVATE)
        sharedPreferences = getSharedPreferences(SECOND, MODE_PRIVATE)


    }


}







