package id.ac.polbeng.wawansaputra.sqlexample

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class StudentModel(
    val nim: String,
    val name: String,
    val age: String
) : Parcelable
