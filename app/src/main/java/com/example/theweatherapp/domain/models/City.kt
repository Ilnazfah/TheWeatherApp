package com.example.theweatherapp.domain.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class City(@PrimaryKey val id: Long, val name: String) {
}