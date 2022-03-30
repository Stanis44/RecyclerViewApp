package com.example.recyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Dice>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId =  arrayOf(
            R.drawable.dice_1,
            R.drawable.dice_2,
            R.drawable.dice_3,
            R.drawable.dice_4,
            R.drawable.dice_5,
            R.drawable.dice_6,
            R.drawable.dice_1,
            R.drawable.dice_2,
            R.drawable.dice_3,
            R.drawable.dice_4,
        )

        heading = arrayOf(
            "Dice 1",
            "Dice 2",
            "Dice 3",
            "Dice 4",
            "Dice 5",
            "Dice 6",
            "Dice 1",
            "Dice 2",
            "Dice 3",
            "Dice 4",
        )

        newRecyclerView = findViewById(R.id.recyclerView)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<Dice>()
        getUserData()



    }

    private fun getUserData() {
         for( i in  imageId.indices-1){
             val dice = Dice(imageId[i],heading[i])
             newArrayList.add(dice)
         }
        newRecyclerView.adapter = DiceAdapter(newArrayList)
    }
}