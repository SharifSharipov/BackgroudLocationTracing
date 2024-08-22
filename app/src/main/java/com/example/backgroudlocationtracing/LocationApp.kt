package com.example.backgroudlocationtracing

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build

class LocationApp:Application (){
    override fun onCreate() {
        super.onCreate()
       if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
           val chanel = NotificationChannel("location","Location", NotificationManager.IMPORTANCE_LOW)
           val notificationManager = getSystemService(NotificationManager::class.java)
           notificationManager.createNotificationChannel(chanel)
       }
    }
}