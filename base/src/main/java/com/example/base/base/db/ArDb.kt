package com.example.base.base.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.base.base.db.model.MyObject


@Database(
    entities = [MyObject::class],
    version = Migrations.DB_VERSION,
    exportSchema = true
)
abstract class ArDb : RoomDatabase(){
    // TODO ad dao here
}