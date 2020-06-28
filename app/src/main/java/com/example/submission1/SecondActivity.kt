package com.example.submission1

import android.graphics.Typeface
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_main.textGithub
import kotlinx.android.synthetic.main.activity_second.*

@Suppress("RECEIVER_NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //Retrieving Data
        val data = intent.getParcelableExtra<DataUser>("extra_data")

        Glide.with(this)
            .load(data.avatar)
            .apply(RequestOptions().override(200, 200))
            .into(avatarInDetail)

        nameInDetail.text = data.names
        usernameInDetail.text = data.username
        companyInDetail.text = data.company
        repositoryInDetail.text = data.repository.toString()
        followersInDetail.text = data.followersInDetail.toString()
        followingInDetail.text = data.followingInDetail.toString()

        // Custom Font
        val customText: Typeface = Typeface.createFromAsset(assets, "Fragmentcore.otf")
        textGithub.typeface = customText
        nameInDetail.typeface = customText
        usernameInDetail.typeface = customText
        companyInDetail.typeface = customText
        repositoryInDetail.typeface = customText
        followingInDetail.typeface = customText
        followersInDetail.typeface = customText
        textViewCompany.typeface = customText
        textViewRepository.typeface = customText
        textViewFollowers.typeface = customText
        textViewFollowing.typeface = customText
    }
}
