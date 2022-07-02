package com.vann.planvann

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class DataModel (
    var id : Long ?= 0,
    var title : String ?= "",
    var desc : String ?= ""
) : Parcelable