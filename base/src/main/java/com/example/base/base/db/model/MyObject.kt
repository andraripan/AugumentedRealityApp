package com.example.base.base.db.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class MyObject (
    @PrimaryKey
    val id: String
)