package com.example.mapscompos_parkingtracer.data

import com.example.mapscompos_parkingtracer.domain.model.ParlkingSpot
import com.example.mapscompos_parkingtracer.domain.repository.ParkingSpotRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class ParkingSpotRepositoryImpl(
    private val dao: ParkingSpotDao
): ParkingSpotRepository {

    override suspend fun insertParkingSpot(spot: ParlkingSpot) {
        dao.insertParkingSpot(spot.toParkingSpotEntity())
    }

    override suspend fun deleteParkingSpot(spot: ParlkingSpot) {
        dao.deleteParkingSpot(spot.toParkingSpotEntity())
    }

    override fun getParkingSpots(): Flow<List<ParlkingSpot>> {
        return dao.getParkingSpots().map { spots ->
            spots.map { it.toParkingSpot() }
        }
    }
}