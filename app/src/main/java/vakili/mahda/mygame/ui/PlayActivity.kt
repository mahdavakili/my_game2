package vakili.mahda.mygame.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import vakili.mahda.mygame.R
import vakili.mahda.mygame.databinding.ActivityPlayBinding

class PlayActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPlayBinding
    var satoshi = 0
    var moves = 3
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlayBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textViewMoves.text = moves.toString()
        if(moves==0){
            binding.imageView1.isClickable= false
            binding.imageView2.isClickable= false
            binding.imageView3.isClickable= false
            binding.imageView4.isClickable= false
            binding.imageView5.isClickable= false
            binding.imageView6.isClickable= false
            binding.imageView7.isClickable= false
            binding.imageView8.isClickable= false
            binding.imageView9.isClickable= false
            binding.imageView10.isClickable= false
            binding.imageView11.isClickable= false
            binding.imageView12.isClickable= false
            binding.imageView13.isClickable= false
            binding.imageView14.isClickable= false
            binding.imageView15.isClickable= false
            binding.imageView16.isClickable= false
            binding.imageView17.isClickable= false
            binding.imageView18.isClickable= false
            binding.imageView19.isClickable= false
            binding.imageView20.isClickable= false
            binding.imageView21.isClickable= false
            binding.imageView22.isClickable= false
            binding.imageView23.isClickable= false
            binding.imageView24.isClickable= false
            binding.imageView25.isClickable= false
            binding.imageView26.isClickable= false
            binding.imageView27.isClickable= false
            binding.imageView28.isClickable= false
            binding.imageView29.isClickable= false
            binding.imageView30.isClickable= false


        }



        binding.imageButtonBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }


        binding.imageView1.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            binding.imageView1.isClickable= false
            moves--
            startActivity(intent)
        }
        binding.imageView2.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            startActivity(intent)
            binding.imageView2.isClickable= false
            moves--
            startActivity(intent)
        }
        binding.imageView3.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            binding.imageView3.isClickable= false
            moves--
            startActivity(intent)
        }
        binding.imageView4.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            binding.imageView4.isClickable= false
            moves--
            startActivity(intent)
        }
        binding.imageView5.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            binding.imageView5.isClickable= false
            moves--
            startActivity(intent)
        }
        binding.imageView6.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            binding.imageView6.isClickable= false
            moves--
            startActivity(intent)
        }
        binding.imageView7.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            binding.imageView7.isClickable= false
            moves--
            startActivity(intent)
        }
        binding.imageView8.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            binding.imageView8.isClickable= false
            moves--
            startActivity(intent)
        }
        binding.imageView9.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            binding.imageView9.isClickable= false
            moves--
            startActivity(intent)
        }
        binding.imageView10.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            binding.imageView10.isClickable= false
            moves--
            startActivity(intent)
        }
        binding.imageView11.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            binding.imageView11.isClickable= false
            moves--
            startActivity(intent)
        }
        binding.imageView12.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            binding.imageView12.isClickable= false
            moves--
            startActivity(intent)
        }
        binding.imageView13.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            binding.imageView13.isClickable= false
            moves--
            startActivity(intent)
        }
        binding.imageView14.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            binding.imageView14.isClickable= false
            moves--
            startActivity(intent)
        }
        binding.imageView15.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            binding.imageView15.isClickable= false
            moves--
            startActivity(intent)
        }
        binding.imageView16.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            binding.imageView16.isClickable= false
            moves--
            startActivity(intent)
        }
        binding.imageView17.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            binding.imageView17.isClickable= false
            moves--
            startActivity(intent)
        }
        binding.imageView18.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            binding.imageView18.isClickable= false
            moves--
            startActivity(intent)
        }
        binding.imageView19.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            binding.imageView19.isClickable= false
            moves--
            startActivity(intent)
        }
        binding.imageView20.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            binding.imageView20.isClickable= false
            moves--
            startActivity(intent)
        }
        binding.imageView21.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            binding.imageView21.isClickable= false
            moves--
            startActivity(intent)
        }
        binding.imageView22.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            binding.imageView22.isClickable= false
            moves--
            startActivity(intent)
        }
        binding.imageView23.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            binding.imageView23.isClickable= false
            moves--
            startActivity(intent)
        }
        binding.imageView24.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            binding.imageView24.isClickable= false
            moves--
            startActivity(intent)
        }
        binding.imageView25.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            binding.imageView25.isClickable= false
            moves--
            startActivity(intent)
        }
        binding.imageView26.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            binding.imageView26.isClickable= false
            moves--
            startActivity(intent)
        }
        binding.imageView27.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            binding.imageView27.isClickable= false
            moves--
            startActivity(intent)
        }
        binding.imageView28.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            binding.imageView28.isClickable= false
            moves--
            startActivity(intent)
        }
        binding.imageView29.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            binding.imageView29.isClickable= false
            moves--
            startActivity(intent)
        }
        binding.imageView30.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            binding.imageView30.isClickable= false
            moves--
            startActivity(intent)
        }

    }


}