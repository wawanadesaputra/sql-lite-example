package id.ac.polbeng.wawansaputra.sqlexample

import android.provider.BaseColumns

object DBContract {
    class UserEntry : BaseColumns {
        companion object {
            const val TABLE_NAME = "students"
            const val COLUMN_NIM = "nim"
            const val COLUMN_NAME = "name"
            const val COLUMN_AGE = "age"
        }
    }
}