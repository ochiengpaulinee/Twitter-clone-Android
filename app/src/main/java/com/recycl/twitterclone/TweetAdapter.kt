package com.recycl.twitterclone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.recycl.twitterclone.databinding.TweetListItemBinding

class TweetAdapter(var tweetList: List<TweetData>):RecyclerView.Adapter<TweetViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetViewHolder {
        val binding=
            TweetListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return TweetViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return tweetList.size
    }

    override fun onBindViewHolder(holder: TweetViewHolder, position: Int) {
        var currentTweet=tweetList.get(position)
        var binding=holder.binding
        binding.tvDisplayName.text=currentTweet.displayNames
        binding.tvHandle.text = currentTweet.handle
        binding.tvTweet.text=currentTweet.tweet
        binding.tvLIkeCount.text=currentTweet.likeCount.toString()
        binding.tvCommentCount.text=currentTweet.commentCount.toString()
        binding.tvRtCount.text=currentTweet.rtCount.toString()
    }

}
class TweetViewHolder(var binding: TweetListItemBinding):ViewHolder(binding.root)








