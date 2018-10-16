package com.donnelly.steve.scshuffle.network

import com.donnelly.steve.scshuffle.network.models.TrackLikesResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface SCServiceV2{
    companion object {
        const val SOUNDCLOUD_CLIENT_ID = "IhtlaRd6b0rFJltJuuJANoRF5c2CQB9a"
    }

    @GET("/users/{userId}/track_likes?client_id=$SOUNDCLOUD_CLIENT_ID")
    fun getLikes(@Path("userId") userId: Int, @Query("limit") limit: Int, @Query("offset") offset: Long?): Observable<TrackLikesResponse>

}