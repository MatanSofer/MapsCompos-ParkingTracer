package com.example.mapscompos_parkingtracer.data

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

interface ParkingSpotDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertParkSpot(spot: ParkingSpotEntity)

    @Delete
    suspend fun deleteParkingSpot(spot: ParkingSpotEntity)

    @Query("SELECT * FROM parkingspotentity")
    fun getParkingSpots(): Flow<List<ParkingSpotEntity>>
}