package `in`.blueplanetapps.chatwiseassignment

import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("photos")
    suspend fun getImages(): Response<List<Image>>
}
