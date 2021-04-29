package com.example.tubespbd2021.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.androiddevs.runningappyt.db.Run
import com.androiddevs.runningappyt.db.RunDAO

@Database(
        entities = [Run::class],
        version = 1
)
@TypeConverters(Converters::class)
abstract class RunningDatabase : RoomDatabase() {

    abstract fun getRunDao(): RunDAO
}