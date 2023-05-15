package com.example.trent

import android.os.Parcel
import android.os.Parcelable

data class Supplies(val image:Int , val name:String ,val description: String) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(image)
        parcel.writeString(name)
        parcel.writeString(description)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Supplies> {
        override fun createFromParcel(parcel: Parcel): Supplies {
            return Supplies(parcel)
        }

        override fun newArray(size: Int): Array<Supplies?> {
            return arrayOfNulls(size)
        }
    }
}
