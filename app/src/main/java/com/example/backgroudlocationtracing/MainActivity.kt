package com.example.backgroudlocationtracing

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.app.ActivityCompat
import com.example.backgroudlocationtracing.ui.theme.BackgroudLocationTracingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityCompat.requestPermissions(
            this,
            arrayOf(
                android.Manifest.permission.ACCESS_COARSE_LOCATION,
                android.Manifest.permission.ACCESS_FINE_LOCATION
            ),
            0
        )
        enableEdgeToEdge()
        setContent {
            BackgroudLocationTracingTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { 
                    Button(onClick = {
                        Inent(applicationContext ,LocationService::class.java).aply{
                            action = LocationService.ACTION_START
                            startService(this   )
                        }
                    }) {
                        Text(text = "Start")
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(onClick = {
                        Inent(applicationContext ,LocationService::class.java).aply{
                            action = LocationService.ACTION_STOP
                            startService(this   )
                        }
                    }) {
                        Text(text = "Stop")
                    }
               
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BackgroudLocationTracingTheme {
        Greeting("Android")
    }
}