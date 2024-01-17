package com.example.interviewtestapplication.db

import android.content.Context
import androidx.room.Database
import androidx.room.Entity
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.interviewtestapplication.data.Note

@Database(
    entities = [Note::class], version = 1
)
abstract class NotesDatabase : RoomDatabase() {


    companion object{
        @Volatile private var instance : NotesDatabase? =  null
        private val LOCK =  Any()



        operator fun invoke(context: Context) = instance ?: synchronized(LOCK){
            instance ?: buildDatabase(context).also {
                instance = it
            }

        }

        private fun buildDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            NotesDatabase::class.java,
            "notesDatabase").build()


    }
}