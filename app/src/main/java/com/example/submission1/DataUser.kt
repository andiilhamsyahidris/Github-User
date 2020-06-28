package com.example.submission1

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parceler
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DataUser(
    var username: String = "",
    var names: String = "",
    var avatar: Int = 0,
    var company: String = "",
    var repository: Int = 0,
    var followers: String = "",
    var following: String = "",
    var followersInDetail: Int = 0,
    var followingInDetail: Int = 0
) : Parcelable {

    companion object : Parceler<DataUser> {
        override fun DataUser.write(parcel: Parcel, flags: Int) {
            parcel.writeString(username)
            parcel.writeString(names)
            parcel.writeInt(avatar)
            parcel.writeString(company)
            parcel.writeInt(repository)
            parcel.writeInt(followersInDetail)
            parcel.writeInt(followingInDetail)
        }

        override fun create(parcel: Parcel) = DataUser(parcel)
    }
    private constructor(parcel: Parcel) : this(
        username = parcel.readString().toString(),
        names = parcel.readString().toString(),
        avatar = parcel.readInt(),
        company = parcel.readString().toString(),
        repository = parcel.readInt(),
        followersInDetail = parcel.readInt(),
        followingInDetail = parcel.readInt()
    )

    override fun describeContents() = 0
}



