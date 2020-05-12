package com.example.augumentedrealityapp.util

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.provider.Settings
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat


object CameraPermissionHelper {
    private val CAMERA_PERMISSION_CODE = 0
    private val CAMERA_PERMISIION = Manifest.permission.CAMERA
    fun hasCameraPermission(activity: Activity): Boolean {
        return (ContextCompat.checkSelfPermission(activity, CAMERA_PERMISIION) == PackageManager.PERMISSION_GRANTED)
    }

    fun requestCameraPermission(activity: Activity){
        ActivityCompat.requestPermissions(
            activity, arrayOf(CAMERA_PERMISIION), CAMERA_PERMISSION_CODE)
    }

    fun shouldShowRequestPermissionRationale(activity: Activity) : Boolean {
        return ActivityCompat.shouldShowRequestPermissionRationale(activity, CAMERA_PERMISIION)
    }

    fun launchPermissionSettings(activity: Activity){
        val intent = Intent()
        intent.setAction(Settings.ACTION_APPLICATION_DETAILS_SETTINGS)
        intent.setData(Uri.fromParts("package", activity.packageName, null))
        activity.startActivity(intent)
    }
}