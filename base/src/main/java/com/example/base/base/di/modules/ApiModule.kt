package com.example.base.base.di.modules

import com.example.base.base.Config
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import dagger.Module
import dagger.Provides
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import okhttp3.logging.HttpLoggingInterceptor
import javax.inject.Singleton

@Module
class ApiModule {
    @Singleton
    @Provides
    internal fun provideRetrofit(): Retrofit {
        val httpClient = OkHttpClient.Builder()

//        if (BuildConfig.DEBUG) {
            val loggingInterceptor = HttpLoggingInterceptor()
            loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
            httpClient.addInterceptor(loggingInterceptor)
//        }

        return Retrofit.Builder()
            .baseUrl(Config.BeUri)
            .addConverterFactory(Json.nonstrict.asConverterFactory(MediaType.get("application/json")))
            .client(httpClient.build())
            .build()
    }

    //TODO add service here

}