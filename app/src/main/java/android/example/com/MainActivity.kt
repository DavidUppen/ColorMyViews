package android.example.com

import android.example.com.databinding.ActivityMainBinding
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil

//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> =
            listOf(
                binding.boxOneText, binding.boxTwoText, binding.boxThreeText,
                binding.boxFourText, binding.boxFiveText, binding.consLayout
            )

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View){
        when(view.id){
//            // Boxes using Color class colors for background
//            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
//            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
//
//            // Boxes using Android color resources for background
//            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_blue_light)
//            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_blue_dark)
//            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_blue_bright)
//
//            else -> view.setBackgroundColor(Color.LTGRAY)

            //Boxes using Color class colors for background
            binding.boxOneText.id -> view.setBackgroundColor(Color.DKGRAY)
            binding.boxTwoText.id -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            binding.boxThreeText.id -> view.setBackgroundResource(android.R.color.holo_blue_light)
            binding.boxFourText.id -> view.setBackgroundResource(android.R.color.holo_blue_dark)
            binding.boxFiveText.id -> view.setBackgroundResource(android.R.color.holo_blue_bright)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}