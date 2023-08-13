package com.example.guesstheno

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.guesstheno.databinding.ActivityMainBinding
import java.util.Random

private lateinit var binding : ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding
            .leftButton
            .setOnClickListener{
            /*
            Compare the numbers - response green or toast - reset the numbers
             */

            var leftNo = binding.leftButton.text.toString().toInt()
            var RightNo = binding.rightButton.text.toString().toInt()

Log.d("lftBt", leftNo.toString()+RightNo.toString())


            if(leftNo>RightNo){
                binding
                    .backgroundView
                    .setBackgroundColor(Color.GREEN)

                Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show()
            }else{
                binding
                    .backgroundView
                    .setBackgroundColor(Color.RED)

                Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show()
            }
                //Random number

                binding.leftButton.text = (1..99).random().toString()
                binding.rightButton.text = (1..99).random().toString()
        }

        //Right button
        binding
            .rightButton
            .setOnClickListener {
                var leftNo = binding.leftButton.text.toString().toInt()
                var RightNo = binding.rightButton.text.toString().toInt()
    print(leftNo)
                print(RightNo)


                if((leftNo<RightNo)){
                    binding
                        .backgroundView
                        .setBackgroundColor(Color.GREEN)

                    Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show()
                }else{
                    binding
                        .backgroundView
                        .setBackgroundColor(Color.RED)

                    Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show()
                }
                binding.leftButton.text = (1..99).random().toString()
                binding.rightButton.text = (1..99).random().toString()
            }
    }
}