package com.recycl.twitterclone

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.recycl.twitterclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayTweets()
    }
    private fun displayTweets(){
        val tweet1=TweetData("","rose","rose232","rororororor",235,436,4698)
        val tweet2=TweetData("","pauline","paula@akoth","codiiiiing",12,20,67)
        val tweet3=TweetData("","rose","rose232","rororororor",235,436,4698)
        val tweet4=TweetData("","pauline","paula@akoth","codiiiiing",12,20,67)
        val tweet5=TweetData("","rose","rose232","rororororor",235,436,4698)
        val tweet6=TweetData("","pauline","paula@akoth","codiiiiing",12,20,67)
        val tweet7=TweetData("","rose","rose232","rororororor",235,436,4698)
        val tweet8=TweetData("","pauline","paula@akoth","codiiiiing",12,20,67)
        val tweet9=TweetData("","rose","rose232","rororororor",235,436,4698)
        val tweet10=TweetData("","pauline","paula@akoth","codiiiiing",12,20,67)
        val tweetList= listOf(tweet1,tweet2,tweet3,tweet4,tweet5,tweet6,tweet7,tweet8,tweet9,tweet10)
        val tvAdapter=TweetAdapter(tweetList)
        binding.rvTweets.layoutManager=LinearLayoutManager(this)
        binding.rvTweets.adapter=tvAdapter
    }
}










