package com.example.testdrivendevelopment.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date
@Entity(tableName = "spends")
data class Spend (
    @ColumnInfo(name = "amount")
    val amount: Int,
    @ColumnInfo(name = "description")
    val description: String
) {
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0
}