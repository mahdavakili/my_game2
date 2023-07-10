package vakili.mahda.mygame.ui

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.CallSuper
import androidx.appcompat.app.AlertDialog
import vakili.mahda.mygame.R
import vakili.mahda.mygame.databinding.ActivityPlayBinding
import vakili.mahda.mygame.databinding.BoxlayoutBinding
import kotlin.random.Random

class PlayActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPlayBinding
    private lateinit var binding2: BoxlayoutBinding
    var satoshi = 0
    var moves = 3
    var list = intArrayOf(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)
    var win = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlayBinding.inflate(layoutInflater)
        binding2 = BoxlayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textViewMoves.text = moves.toString()
        binding.textView8.text = satoshi.toString()
        setupBox()
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



        binding.backButton.setOnClickListener {

            onBackPressed()

        }


        binding.imageView1.setOnClickListener {
            binding.imageView1.isClickable= false
            moves -= 1
            binding.textViewMoves.text = moves.toString()
            win = list[0]
            setupDialogBox()
        }
        binding.imageView2.setOnClickListener {
            binding.imageView2.isClickable= false
            moves -= 1
            binding.textViewMoves.text = moves.toString()
            win = list[1]
            setupDialogBox()
        }
        binding.imageView3.setOnClickListener {
            binding.imageView3.isClickable= false
            moves -= 1
            binding.textViewMoves.text = moves.toString()
            win = list[2]
            setupDialogBox()
        }
        binding.imageView4.setOnClickListener {
            binding.imageView4.isClickable= false
            moves -= 1
            binding.textViewMoves.text = moves.toString()
            win = list[3]
            setupDialogBox()
        }
        binding.imageView5.setOnClickListener {
            binding.imageView5.isClickable= false
            moves -= 1
            binding.textViewMoves.text = moves.toString()
            win = list[4]
            setupDialogBox()
        }
        binding.imageView6.setOnClickListener {
            binding.imageView6.isClickable= false
            moves -= 1
            binding.textViewMoves.text = moves.toString()
            win = list[5]
            setupDialogBox()
        }
        binding.imageView7.setOnClickListener {
            binding.imageView7.isClickable= false
            moves -= 1
            binding.textViewMoves.text = moves.toString()
            win = list[6]
            setupDialogBox()
        }
        binding.imageView8.setOnClickListener {
            binding.imageView8.isClickable= false
            moves -= 1
            binding.textViewMoves.text = moves.toString()
            win = list[7]
            setupDialogBox()
        }
        binding.imageView9.setOnClickListener {
            binding.imageView9.isClickable= false
            moves -= 1
            binding.textViewMoves.text = moves.toString()
            win = list[8]
            setupDialogBox()
        }
        binding.imageView10.setOnClickListener {
            binding.imageView10.isClickable= false
            moves -= 1
            binding.textViewMoves.text = moves.toString()
            win = list[9]
            setupDialogBox()
        }
        binding.imageView11.setOnClickListener {
            binding.imageView11.isClickable= false
            moves -= 1
            binding.textViewMoves.text = moves.toString()
            win = list[10]
            setupDialogBox()
        }
        binding.imageView12.setOnClickListener {
            binding.imageView12.isClickable= false
            moves -= 1
            binding.textViewMoves.text = moves.toString()
            win = list[11]
            setupDialogBox()
        }
        binding.imageView13.setOnClickListener {
            binding.imageView13.isClickable= false
            moves -= 1
            binding.textViewMoves.text = moves.toString()
            win = list[12]
            setupDialogBox()
        }
        binding.imageView14.setOnClickListener {
            binding.imageView14.isClickable= false
            moves -= 1
            binding.textViewMoves.text = moves.toString()
            win = list[13]
            setupDialogBox()
        }
        binding.imageView15.setOnClickListener {
            binding.imageView15.isClickable= false
            moves -= 1
            binding.textViewMoves.text = moves.toString()
            win = list[14]
            setupDialogBox()
        }
        binding.imageView16.setOnClickListener {
            binding.imageView16.isClickable= false
            moves -= 1
            binding.textViewMoves.text = moves.toString()
            win = list[15]
            setupDialogBox()
        }
        binding.imageView17.setOnClickListener {
            binding.imageView17.isClickable= false
            moves -= 1
            binding.textViewMoves.text = moves.toString()
            win = list[16]
            setupDialogBox()
        }
        binding.imageView18.setOnClickListener {
            binding.imageView18.isClickable= false
            moves -= 1
            binding.textViewMoves.text = moves.toString()
            win = list[17]
            setupDialogBox()
        }
        binding.imageView19.setOnClickListener {
            binding.imageView19.isClickable= false
            moves -= 1
            binding.textViewMoves.text = moves.toString()
            win = list[18]
            setupDialogBox()
        }
        binding.imageView20.setOnClickListener {
            binding.imageView20.isClickable= false
            moves -= 1
            binding.textViewMoves.text = moves.toString()
            win = list[19]
            setupDialogBox()
        }
        binding.imageView21.setOnClickListener {
            binding.imageView21.isClickable= false
            moves -= 1
            binding.textViewMoves.text = moves.toString()
            win = list[20]
            setupDialogBox()
        }
        binding.imageView22.setOnClickListener {
            binding.imageView22.isClickable= false
            moves -= 1
            binding.textViewMoves.text = moves.toString()
            win = list[21]
            setupDialogBox()
        }
        binding.imageView23.setOnClickListener {
            binding.imageView23.isClickable= false
            moves -= 1
            binding.textViewMoves.text = moves.toString()
            win = list[22]
            setupDialogBox()
        }
        binding.imageView24.setOnClickListener {
            binding.imageView24.isClickable= false
            moves -= 1
            binding.textViewMoves.text = moves.toString()
            win = list[23]
            setupDialogBox()
        }
        binding.imageView25.setOnClickListener {
            binding.imageView25.isClickable= false
            moves -= 1
            binding.textViewMoves.text = moves.toString()
            win = list[24]
            setupDialogBox()
        }
        binding.imageView26.setOnClickListener {
            binding.imageView26.isClickable= false
            moves -= 1
            binding.textViewMoves.text = moves.toString()
            win = list[25]
            setupDialogBox()
        }
        binding.imageView27.setOnClickListener {
            binding.imageView27.isClickable= false
            moves -= 1
            binding.textViewMoves.text = moves.toString()
            win = list[26]
            setupDialogBox()
        }
        binding.imageView28.setOnClickListener {
            binding.imageView28.isClickable= false
            moves -= 1
            binding.textViewMoves.text = moves.toString()
            win = list[27]
            setupDialogBox()
        }
        binding.imageView29.setOnClickListener {
            binding.imageView29.isClickable= false
            moves -= 1
            binding.textViewMoves.text = moves.toString()
            win = list[28]
            setupDialogBox()
        }
        binding.imageView30.setOnClickListener {
            binding.imageView30.isClickable= false
            moves -= 1
            binding.textViewMoves.text = moves.toString()
            win = list[29]
            fun onClick(v: View?) {
                setupDialogBox()
            }
        }

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
        val textView = view.findViewById<TextView>(/* id = */ R.id.textView2)
        textView.text = "you win $win"
        val dialog = AlertDialog.Builder(this)

            .setView(view)
//            .setCancelable(false)
            .create()
        addButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {

                satoshi += win
                binding.textView8.text = satoshi.toString()
                dialog.hide()
            }
//        binding2.addButton.setOnClickListener {
//            satoshi += win
//            dialog.hide()
//        }
        })
        dialog.show()
    }


}