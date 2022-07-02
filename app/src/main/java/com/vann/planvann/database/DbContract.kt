package com.vann.planvann.database

import android.provider.BaseColumns

object DbContract {

    object DataEntry : BaseColumns {
        const val TABLE_NAME = "entry"
        const val COLUMN_NAMA_TITLE = "title"
        const val COLUMN_NAMA_DESC = "desc"
    }

}