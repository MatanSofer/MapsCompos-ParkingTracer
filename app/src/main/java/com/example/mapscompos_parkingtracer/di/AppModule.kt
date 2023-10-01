package com.example.mapscompos_parkingtracer.di

import android.app.Application
import androidx.room.Room
import com.example.mapscompos_parkingtracer.data.ParkingSpotDatabase
import com.example.mapscompos_parkingtracer.data.ParkingSpotRepositoryImp
import com.example.mapscompos_parkingtracer.domain.repository.ParkingSpotRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Singleton
    @Provides
    fun provideParkingSpotDatabase(app: Application):ParkingSpotDatabase{
        return Room.databaseBuilder(
            app,
            ParkingSpotDatabase::class.java,
            "parking_spots.db"
        ).build()
    }

    @Singleton
    @Provides
    fun provideParkingSpotRepository(db: ParkingSpotDatabase): ParkingSpotRepository {
        return ParkingSpotRepositoryImp(db.dao)
    }
}