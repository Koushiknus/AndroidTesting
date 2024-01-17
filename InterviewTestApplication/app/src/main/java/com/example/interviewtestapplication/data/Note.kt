package com.example.interviewtestapplication.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity
data class Note(
    @ColumnInfo(name = "title")
    val title : String,
    val note: String
) : Serializable{
    @PrimaryKey(autoGenerate = true)
    var id =0
}
