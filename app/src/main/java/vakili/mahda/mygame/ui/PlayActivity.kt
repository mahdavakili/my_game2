package vakili.mahda.mygame.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import vakili.mahda.mygame.R
import vakili.mahda.mygame.databinding.ActivityPlayBinding
import vakili.mahda.mygame.utils.PrefConstant
import vakili.mahda.mygame.utils.PrefConstant.SATOSHI
import kotlin.properties.Delegates
import kotlin.random.Random

class PlayActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPlayBinding
    lateinit var sharedPreferences: SharedPreferences
    lateinit var editor:SharedPreferences.Editor
    var satoshi = 0
    var moves = 3
    var list = intArrayOf(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)
    var win = 100
    var satoshiWin = 0
     var button5 = true
     var button10 = true
     var button15 = true




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlayBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupSharedPreferences()
        getIntentData()
        satoshi = sharedPreferences.getInt(SATOSHI.toString(), 0)
        binding.textViewMoves.text = moves.toString()
        binding.textView8.text = satoshi.toString()
        setupButtons()
        setupBox()








        binding.backButton.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


        binding.imageView1.setOnClickListener {
            binding.imageView1.isClickable= false
            setupMoves()
            win = list[0]
            binding.imageView1.alpha= 0F
            binding.imageView012.alpha= 1F
            setupSatoshiWin()
            setupDialogBox()
        }
        binding.imageView2.setOnClickListener {
            binding.imageView2.isClickable= false
            setupMoves()
            win = list[1]
            binding.imageView2.alpha= 0F
            binding.imageView022.alpha= 1F
            setupSatoshiWin()
            setupDialogBox()
        }
        binding.imageView3.setOnClickListener {
            binding.imageView3.isClickable= false
            setupMoves()
            win = list[2]
            binding.imageView3.alpha= 0F
            binding.imageView032.alpha= 1F
            setupSatoshiWin()
            setupDialogBox()
        }
        binding.imageView4.setOnClickListener {
            binding.imageView4.isClickable= false
            setupMoves()
            win = list[3]
            binding.imageView4.alpha= 0F
            binding.imageView042.alpha= 1F
            setupSatoshiWin()
            setupDialogBox()
        }
        binding.imageView5.setOnClickListener {
            binding.imageView5.isClickable= false
            setupMoves()
            win = list[4]
            binding.imageView5.alpha= 0F
            binding.imageView052.alpha= 1F
            setupSatoshiWin()
            setupDialogBox()
        }
        binding.imageView6.setOnClickListener {
            binding.imageView6.isClickable= false
            setupMoves()
            win = list[5]
            binding.imageView6.alpha= 0F
            binding.imageView062.alpha= 1F
            setupSatoshiWin()
            setupDialogBox()
        }
        binding.imageView7.setOnClickListener {
            binding.imageView7.isClickable= false
            setupMoves()
            win = list[6]
            binding.imageView7.alpha= 0F
            binding.imageView072.alpha= 1F
            setupSatoshiWin()
            setupDialogBox()
        }
        binding.imageView8.setOnClickListener {
            binding.imageView8.isClickable= false
            setupMoves()
            win = list[7]
            binding.imageView8.alpha= 0F
            binding.imageView082.alpha= 1F
            setupSatoshiWin()
            setupDialogBox()
        }
        binding.imageView9.setOnClickListener {
            binding.imageView9.isClickable= false
            setupMoves()
            win = list[8]
            binding.imageView9.alpha= 0F
            binding.imageView092.alpha= 1F
            setupSatoshiWin()
            setupDialogBox()
        }
        binding.imageView10.setOnClickListener {
            binding.imageView10.isClickable= false
            setupMoves()
            win = list[9]
            binding.imageView10.alpha= 0F
            binding.imageView102.alpha= 1F
            setupSatoshiWin()
            setupDialogBox()
        }
        binding.imageView11.setOnClickListener {
            binding.imageView11.isClickable= false
            setupMoves()
            win = list[10]
            binding.imageView11.alpha= 0F
            binding.imageView112.alpha= 1F
            setupSatoshiWin()
            setupDialogBox()
        }
        binding.imageView12.setOnClickListener {
            binding.imageView12.isClickable= false
            setupMoves()
            win = list[11]
            binding.imageView12.alpha= 0F
            binding.imageView122.alpha= 1F
            setupSatoshiWin()
            setupDialogBox()
        }
        binding.imageView13.setOnClickListener {
            binding.imageView13.isClickable= false
            setupMoves()
            win = list[12]
            binding.imageView13.alpha= 0F
            binding.imageView132.alpha= 1F
            setupSatoshiWin()
            setupDialogBox()
        }
        binding.imageView14.setOnClickListener {
            binding.imageView14.isClickable= false
            setupMoves()
            win = list[13]
            binding.imageView14.alpha= 0F
            binding.imageView142.alpha= 1F
            setupSatoshiWin()
            setupDialogBox()
        }
        binding.imageView15.setOnClickListener {
            binding.imageView15.isClickable= false
            setupMoves()
            win = list[14]
            binding.imageView15.alpha= 0F
            binding.imageView152.alpha= 1F
            setupSatoshiWin()
            setupDialogBox()
        }
        binding.imageView16.setOnClickListener {
            binding.imageView16.isClickable= false
            setupMoves()
            win = list[15]
            binding.imageView16.alpha= 0F
            binding.imageView162.alpha= 1F
            setupSatoshiWin()
            setupDialogBox()
        }
        binding.imageView17.setOnClickListener {
            binding.imageView17.isClickable= false
            setupMoves()
            win = list[16]
            binding.imageView17.alpha= 0F
            binding.imageView172.alpha= 1F
            setupSatoshiWin()
            setupDialogBox()
        }
        binding.imageView18.setOnClickListener {
            binding.imageView18.isClickable= false
            setupMoves()
            win = list[17]
            binding.imageView18.alpha= 0F
            binding.imageView182.alpha= 1F
            setupSatoshiWin()
            setupDialogBox()
        }
        binding.imageView19.setOnClickListener {
            binding.imageView19.isClickable= false
            setupMoves()
            win = list[18]
            binding.imageView19.alpha= 0F
            binding.imageView192.alpha= 1F
            setupSatoshiWin()
            setupDialogBox()
        }
        binding.imageView20.setOnClickListener {
            binding.imageView20.isClickable= false
            setupMoves()
            win = list[19]
            binding.imageView20.alpha= 0F
            binding.imageView202.alpha= 1F
            setupSatoshiWin()
            setupDialogBox()
        }
        binding.imageView21.setOnClickListener {
            binding.imageView21.isClickable= false
            setupMoves()
            win = list[20]
            binding.imageView21.alpha= 0F
            binding.imageView212.alpha= 1F
            setupSatoshiWin()
            setupDialogBox()
        }
        binding.imageView22.setOnClickListener {
            binding.imageView22.isClickable= false
            setupMoves()
            win = list[21]
            binding.imageView22.alpha= 0F
            binding.imageView222.alpha= 1F
            setupSatoshiWin()
            setupDialogBox()
        }
        binding.imageView23.setOnClickListener {
            binding.imageView23.isClickable= false
            setupMoves()
            win = list[22]
            binding.imageView23.alpha= 0F
            binding.imageView232.alpha= 1F
            setupSatoshiWin()
            setupDialogBox()
        }
        binding.imageView24.setOnClickListener {
            binding.imageView24.isClickable= false
            setupMoves()
            win = list[23]
            binding.imageView24.alpha= 0F
            binding.imageView242.alpha= 1F
            setupSatoshiWin()
            setupDialogBox()
        }
        binding.imageView25.setOnClickListener {
            binding.imageView25.isClickable= false
            setupMoves()
            win = list[24]
            binding.imageView25.alpha= 0F
            binding.imageView252.alpha= 1F
            setupSatoshiWin()
            setupDialogBox()
        }
        binding.imageView26.setOnClickListener {
            binding.imageView26.isClickable= false
            setupMoves()
            win = list[25]
            binding.imageView26.alpha= 0F
            binding.imageView262.alpha= 1F
            setupSatoshiWin()
            setupDialogBox()
        }
        binding.imageView27.setOnClickListener {
            binding.imageView27.isClickable= false
            setupMoves()
            win = list[26]
            binding.imageView27.alpha= 0F
            binding.imageView272.alpha= 1F
            setupSatoshiWin()
            setupDialogBox()
        }
        binding.imageView28.setOnClickListener {
            binding.imageView28.isClickable= false
            setupMoves()
            win = list[27]
            binding.imageView28.alpha= 0F
            binding.imageView282.alpha= 1F
            setupSatoshiWin()
            setupDialogBox()
        }
        binding.imageView29.setOnClickListener {
            binding.imageView29.isClickable= false
            setupMoves()
            win = list[28]
            binding.imageView29.alpha= 0F
            binding.imageView292.alpha= 1F
            setupSatoshiWin()
            setupDialogBox()
        }
        binding.imageView30.setOnClickListener {
            binding.imageView30.isClickable= false
            setupMoves()
            win = list[29]
            binding.imageView30.alpha= 0F
            binding.imageView302.alpha= 1F
            setupSatoshiWin()
            setupDialogBox()

        }

    }

    private fun setupMoves() {
        moves -= 1
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
    }

    private fun getIntentData() {
         button5 = intent.getBooleanExtra("BUTTON5", false)
         button10 = intent.getBooleanExtra("BUTTON10", false)
         button15 = intent.getBooleanExtra("BUTTON15", false)


    }

    private fun setupButtons() {

        if (button5){
            var sum = 0
            val randomValues = List(5) { Random.nextInt( 29) }
            for (i in 0..5){

                    list[randomValues[i]] = 2

            }


        }
        if (button10){
            var sum = 0
            val randomValues = List(10) { Random.nextInt( 29) }
            for (i in 0..10){

                    list[randomValues[i]] = 2

            }

        }
        if (button15){
            var sum = 0
            val randomValues = List(15) { Random.nextInt( 29) }
            for (i in 0..15){

                    list[randomValues[i]] = 2

            }

        }

    }

    private fun setupSatoshiWin() {
        if(win==1) {
            satoshiWin = Random.nextInt(1, 10)
        }else satoshiWin=0
    }

    private fun setupBox() {
        val randomValues = List(3) { Random.nextInt( 29) }
        for (i in 0..2){
            list[randomValues[i]] = 1
        }
    }

    @SuppressLint("MissingInflatedId")
    private fun setupDialogBox() {

        val view = LayoutInflater.from(this).inflate(R.layout.boxlayout,null)
        val addButton = view.findViewById<Button>(R.id.addButton)
        val textView = view.findViewById<TextView>( R.id.textView2)
        textView.text = "you win $satoshiWin"
        val dialog = AlertDialog.Builder(this)

            .setView(view)
            .setCancelable(false)
            .create()
        addButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {

                satoshi += satoshiWin
                binding.textView8.text = satoshi.toString()
                saveSatoshi()
                dialog.hide()
            }

        })
        dialog.show()
    }

    private fun saveSatoshi() {
        editor = sharedPreferences.edit()
        editor.putInt(SATOSHI.toString(), satoshi)
        editor.commit()    }

    private fun setupSharedPreferences() {
        sharedPreferences = getSharedPreferences(SATOSHI.toString(), MODE_PRIVATE)


    }

}