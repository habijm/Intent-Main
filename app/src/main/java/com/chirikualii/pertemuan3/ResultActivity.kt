package com.chirikualii.pertemuan3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chirikualii.pertemuan3.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    lateinit var binding : ActivityResultBinding

    var resultA = ""
    var resultB = ""

    var teamA =""
    var teamB =""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        teamA=intent.getStringExtra("timA") ?: "Team A"

        teamB=intent.getStringExtra("timB") ?: "Team B"

        binding.tvResultA.text = teamA

        binding.tvResultB.text = teamB
        /**
         * TODO
          tampilkan data dari activity match seperti pada layout [activity_result.XML]
         **/


    }
}