package com.example.peaktools_todolist.data

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import java.text.DateFormat

//stores tasks in the database
@Entity(tableName = "task_table")
@Parcelize
data class Task(
    val name: String,
    val important: Boolean = false,
    val completed: Boolean = false,
    val created: Long = System.currentTimeMillis(),
    //each object needs to be identified with the primary key
    @PrimaryKey(autoGenerate = true) val id: Int = 0
) : Parcelable {
    //format the date
    //we put it in the body because it will be dynamically calculated from above
    val createdDateFormatted: String
        get() = DateFormat.getDateTimeInstance().format(created)
}