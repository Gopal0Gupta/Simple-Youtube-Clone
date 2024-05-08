package com.example.youtubeclonebygopalgupta.network

import com.example.youtubeclonebygopalgupta.model.Video
import retrofit2.http.GET

interface SupabaseService {
    @GET("rest/v1/videos?select=*")
    suspend fun listVideos(): List<Video>
}
