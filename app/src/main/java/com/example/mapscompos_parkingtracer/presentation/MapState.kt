package com.example.mapscompos_parkingtracer.presentation

import com.example.mapscompos_parkingtracer.domain.model.ParlkingSpot
import com.google.android.gms.maps.model.MapStyleOptions
import com.google.maps.android.compose.MapProperties

data class MapState(
    val properties: MapProperties = MapProperties(

    ),
    val isFalloutMap: Boolean = false,
    val parkingSpots: List<ParlkingSpot> = emptyList()
)
