package com.example.testdrivendevelopment.db

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.google.common.truth.Truth
import junit.framework.TestCase
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.io.IOException
import java.util.Date

@RunWith(AndroidJUnit4::class)
class SpendsDatabaseTest : TestCase(){

    private lateinit var db : SpendsDatabase
    private lateinit var dao: SpendDao
    @Before
    public override fun setUp() {
        val context  = ApplicationProvider.getApplicationContext<Context>()
        db = Room.inMemoryDatabaseBuilder(context,SpendsDatabase::class.java).build()
        dao = db.getSpendDao()
    }

    @Test
    fun writeAndReadFact() = runBlocking{
        val spend = Spend(100,"Laptop")
        dao.addSpend(spend)
      //  Truth.assertThat(dao.getLast20Spends().contains(spend)).isTrue()
    }

    @After
    @Throws(IOException::class)
    fun closeDb() {
        db.close()
    }
}