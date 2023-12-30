package com.example.testdrivendevelopment.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date
@Entity(tableName = "spends")
data class Spend (
    val date: Date,
    val amount : Int,
    val description : String
){
    @PrimaryKey(autoGenerate = true)
    var id :Long = 0
}