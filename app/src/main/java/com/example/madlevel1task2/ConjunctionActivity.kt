package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityConjunctionBinding

class ConjunctionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityConjunctionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConjunctionBinding.inflate(layoutInflater)
        binding.btnSubmit.setOnClickListener {onSubmit()}
        setContentView(binding.root)
    }

    private fun onSubmit() {
        checkAnswers()
    }

    private fun checkAnswers() {
        val answer1 = binding.inputTrueTrue.text.toString()
        val answer2 = binding.inputTrueFalse.text.toString()
        val answer3 = binding.inputFalseTrue.text.toString()
        val answer4 = binding.inputFalseFalse.text.toString()

        if (answer1 == getString(R.string.True) && answer2 == getString(R.string.False) && answer3 == getString(R.string.False) && answer4 == getString(R.string.False))
        {
            onCorrect()
        }
        else
            onIncorrect()
    }

    private fun onCorrect() {
        Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_SHORT).show()
    }

    private fun onIncorrect() {
        Toast.makeText(this, getString(R.string.incorrect), Toast.LENGTH_SHORT).show()
    }
}