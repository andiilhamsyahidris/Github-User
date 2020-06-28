package com.example.submission1

object Users
{
    private val username = arrayOf(
        "JakeWharton",
        "amitshekhariitbhu",
        "romainguy",
        "chrisbanes",
        "tipsy",
        "ravi8x",
        "jasoet",
        "budioktaviyan",
        "hendisantika",
        "sidiqpermana"
    )
    private val names = arrayOf(
        "Jake Wharton",
        "Amit Shekhar",
        "Romain Guy",
        "Chris Banes",
        "David",
        "Ravi Tamada",
        "Deny Prasetyo",
        "Budi Oktaviyan",
        "Hendi Santika",
        "Sidiq Permana"
    )
    private val avatar = arrayOf(
        R.drawable.user1,
        R.drawable.user2,
        R.drawable.user3,
        R.drawable.user4,
        R.drawable.user5,
        R.drawable.user6,
        R.drawable.user7,
        R.drawable.user8,
        R.drawable.user9,
        R.drawable.user10
    )
    private val company = arrayOf(
        "Google, Inc.",
        "@MindOrksOpenSource",
        "Google",
        "@google working on @android",
        "Working Group Two",
        "AndroidHive | Droid5",
        "@gojek-engineering",
        "@KotlinID",
        "@JVMDeveloperID @KotlinID @IDDevOps",
        "Nusantara Beta Studio"
    )
    private val repository = arrayOf(
        102,
        37,
        9,
        30,
        56,
        28,
        44,
        110,
        1064,
        65
    )
    private val followers = arrayOf(
        "Followers: 56995",
        "Followers: 5153",
        "Followers: 7972",
        "Followers: 14725",
        "Followers: 788",
        "Followers: 18628",
        "Followers: 277",
        "Followers: 178",
        "Followers: 428",
        "Followers: 465"
    )
    private val following = arrayOf(
        "Following: 12",
        "Following: 2",
        "Following: 0",
        "Following: 1",
        "Following: 0",
        "Following: 3",
        "Following: 39",
        "Following: 23",
        "Following: 61",
        "Following: 10"
    )
    private val followersInDetail = arrayOf(
        56995,
        5153,
        7972,
        14725,
        788,
        18628,
        277,
        178,
        428,
        465
    )
    private val followingInDetail = arrayOf(
        12,
        2,
        0,
        1,
        0,
        3,
        39,
        23,
        61,
        10
    )
    val listDataUser: ArrayList<DataUser>
    get()
    {
        val list = arrayListOf<DataUser>()
        for (position in username.indices)
        {
            val data = DataUser()
            data.username = username[position]
            data.names = names[position]
            data.avatar = avatar[position]
            data.company = company[position]
            data.repository = repository[position]
            data.followers = followers[position]
            data.following = following[position]
            data.followersInDetail = followersInDetail[position]
            data.followingInDetail = followingInDetail[position]
            list.add(data)
        }
        return list
    }
}