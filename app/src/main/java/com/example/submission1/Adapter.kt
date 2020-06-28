package com.example.submission1

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.cardviewuser.view.*

class Adapter(private val listDataUser: ArrayList<DataUser>): RecyclerView.Adapter<Adapter.CardViewViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder
    {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.cardviewuser, parent, false)
        return CardViewViewHolder(view)
    }
    override fun getItemCount(): Int
    {
        return listDataUser.size
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int)
    {
        val user = listDataUser[position]

        Glide.with(holder.itemView.context)
            .load(user.avatar)
            .apply(RequestOptions().override(220, 440))
            .into(holder.avatar)

        holder.username.text = user.username
        holder.names.text = user.names
        holder.followers.text = user.followers
        holder.following.text = user.following

        holder.toDetail.setOnClickListener { view ->
            val moveToDetail = Intent(view.context, SecondActivity::class.java)
            moveToDetail.putExtra("extra_data", user)
            view.context.startActivity(moveToDetail)
        }
    }
    inner class CardViewViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        val username = itemView.userName
        val names = itemView.nameUser
        val avatar = itemView.avatar
        val followers = itemView.followers
        val following = itemView.following
        val toDetail = itemView.toDetail
    }
}
