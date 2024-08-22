package com.example.backgroudlocationtracing

import android.health.connect.datatypes.ExerciseRoute.Location
import kotlinx.coroutines.flow.Flow

interface LocationClient {
    fun getLocationUpdates(interval:Long): Flow<android.location.Location>
    class LocationException(message:String):Exception(message)
}