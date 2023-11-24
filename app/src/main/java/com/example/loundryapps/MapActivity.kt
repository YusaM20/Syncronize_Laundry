package com.example.loundryapps

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions

class MapActivity : AppCompatActivity(), OnMapReadyCallback, GoogleMap.OnMarkerClickListener {
    private lateinit var mMap: GoogleMap
    private lateinit var lastLocation: android.location.Location
    private lateinit var fusedlLocationClient: FusedLocationProviderClient

    companion object{
        private const val LOCATION_REQUEST_CODE = 1
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        val mapFragment = supportFragmentManager.findFragmentById(R.id.mapFragment)
            as SupportMapFragment
        mapFragment.getMapAsync(this)

        fusedlLocationClient = LocationServices.getFusedLocationProviderClient(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        mMap.uiSettings.isZoomControlsEnabled = true
        mMap.setOnMarkerClickListener(this)
        setUpMap()
    }

    private fun setUpMap() {

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
            != PackageManager.PERMISSION_GRANTED) {

                ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION), LOCATION_REQUEST_CODE)
            return
        }
        mMap.isMyLocationEnabled = true
        fusedlLocationClient.lastLocation.addOnSuccessListener(this) {Location ->
            if (Location != null){
                lastLocation = Location
                val curretLatLong = LatLng(Location.latitude, Location.longitude)
                placeMarkerOnMap(curretLatLong)
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(curretLatLong,12f))

            }
        }
    }

    private fun placeMarkerOnMap(curretLatLong: LatLng) {
        val markerOptions = MarkerOptions().position(curretLatLong)
        markerOptions.title("$curretLatLong")
        mMap.addMarker(markerOptions)

    }

    override fun onMarkerClick(p0: Marker) = false
}