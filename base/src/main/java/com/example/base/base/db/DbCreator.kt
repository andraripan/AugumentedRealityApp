package com.example.base.base.db

import android.content.Context
import androidx.room.Room
import com.example.base.base.Config
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DbCreator @Inject constructor(
    context: Context,
    migrations: Migrations
) {
    val arDb: ArDb = Room
        .databaseBuilder(context, ArDb::class.java, Config.DbName)
        .addMigrations(*migrations.all())
        .fallbackToDestructiveMigration()
        .build()
}