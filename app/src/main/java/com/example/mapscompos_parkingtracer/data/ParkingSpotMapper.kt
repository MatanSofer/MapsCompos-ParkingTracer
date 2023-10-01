package com.example.mapscompos_parkingtracer.data

import com.example.mapscompos_parkingtracer.domain.model.ParlkingSpot

fun ParkingSpotEntity.toParkingSpot(): ParlkingSpot {
    return ParlkingSpot(
        lat = lat,
        lng = lng,
        id = id
    )
}
    fun ParlkingSpot.toParkingSpotEntity(): ParkingSpotEntity {
        return  ParkingSpotEntity(
            lat = lat,
            lng = lng,
            id = id
        )
}