package com.example.mapscompos_parkingtracer.presentation

import com.example.mapscompos_parkingtracer.domain.model.ParlkingSpot
import com.google.android.gms.maps.model.LatLng

sealed class MapEvent {

    object ToggleFalloutMap: MapEvent()
    data class OnMapLongClick(val latLng: LatLng):MapEvent()
    data class OnInfoWindowLongClick(val spot: ParlkingSpot): MapEvent()
}
