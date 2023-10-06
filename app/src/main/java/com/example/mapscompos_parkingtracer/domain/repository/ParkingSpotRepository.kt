package com.example.mapscompos_parkingtracer.domain.repository

import com.example.mapscompos_parkingtracer.domain.model.ParlkingSpot
import kotlinx.coroutines.flow.Flow

interface ParkingSpotRepository {

    suspend fun insertParkingSpot(spot: ParlkingSpot)

    suspend fun deleteParkingSpot(spot: ParlkingSpot)

    fun getParkingSpots(): Flow<List<ParlkingSpot>>
}