package vakili.mahda.mygame.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.os.CountDownTimer
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import vakili.mahda.mygame.databinding.ActivityMainBinding
import vakili.mahda.mygame.utils.PrefConstant.ENERGY
import vakili.mahda.mygame.utils.PrefConstant.LEVEL
import vakili.mahda.mygame.utils.PrefConstant.SATOSHI
import vakili.mahda.mygame.utils.PrefConstant.SECOND
import java.time.LocalDateTime
import java.time.ZoneOffset


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var sharedPreferences: SharedPreferences
    lateinit var editor:SharedPreferences.Editor
    var ener = 0
    @RequiresApi(Build.VERSION_CODES.O)
    var now = LocalDateTime.now()
    @RequiresApi(Build.VERSION_CODES.O)
    var second = now.toEpochSecond(ZoneOffset.UTC)
    var satoshi = 0
    var button5 = false
    var button10 = false
    var button15 = false
    var level = 0


    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("SuspiciousIndentation", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupSharedPreferences()
        ener = sharedPreferences.getInt(ENERGY.toString(), 5)
        // get level saved
        level = sharedPreferences.getInt(LEVEL.toString(), 0)
        satoshi = sharedPreferences.getInt(SATOSHI.toString(), 0)

        setupTimer()
        binding.energyButton.text = ener.toString()
        // show level
        binding.textViewLevel.text = "Level $level"
        binding.textViewBalanceValue.text = satoshi.toString()

        if (ener==0){
            binding.playButton.isClickable= false
        }



        binding.settingButton.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
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
            binding.textViewBalanceExchange.text = button5.toString()
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


        binding.playButton.setOnClickListener {
            val intent = Intent(this, PlayActivity::class.java)
            with(intent)
            {
                putExtra("BUTTON5", button5)
                putExtra("BUTTON10", button10)
                putExtra("BUTTON15", button15)
            }

            if (ener == 5){
                saveTime()
            }
            level +=1
            saveLevel()
            ener -= 1
            if (ener==0){
                binding.playButton.isClickable= false
            }
            saveEnergy()
            startActivity(intent)


        }


        }



    @SuppressLint("SetTextI18n")
    @RequiresApi(Build.VERSION_CODES.O)
    private fun setupTimer() {
        val savedSecond = sharedPreferences.getLong(SECOND, 0)
        val enerDiff = 5-ener
        val secondDiff = (second-savedSecond)
        val rem = (300-(secondDiff%300))*1000
        val rem2 = secondDiff%300
        val div: Int = ((secondDiff-rem2)/300).toInt()
        if (secondDiff<enerDiff*300){

            ener += div
            object : CountDownTimer(rem, 1000) {


                override fun onTick(millisUntilFinished: Long) {
                    binding.time.text = "" + millisUntilFinished/ 1000
                }

                override fun onFinish() {
                    ener += 1
                    saveEnergy()
                    binding.energyButton.text = ener.toString()
                }
            }.start()
        }else{
            ener = 5
            saveEnergy()
            binding.time.text = "Full"

        }


    }



    private fun setupSharedPreferences() {
        sharedPreferences = getSharedPreferences(ENERGY.toString(), MODE_PRIVATE)
        // get shared-preferences
        sharedPreferences = getSharedPreferences(LEVEL.toString(), MODE_PRIVATE)
        //
        sharedPreferences = getSharedPreferences(SECOND, MODE_PRIVATE)
        sharedPreferences = getSharedPreferences(SATOSHI.toString(), MODE_PRIVATE)



    }

    private fun saveEnergy() {
        editor = sharedPreferences.edit()
        editor.putInt(ENERGY.toString(), ener)
        editor.commit()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun saveTime() {
        editor = sharedPreferences.edit()
        editor.putLong(SECOND, second)
        editor.commit()
    }
    // save level
    private fun saveLevel() {
        editor = sharedPreferences.edit()
        editor.putInt(LEVEL.toString(), level)
        editor.commit()    }

}








