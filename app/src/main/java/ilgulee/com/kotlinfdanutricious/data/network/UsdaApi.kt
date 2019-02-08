package ilgulee.com.kotlinfdanutricious.data.network

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface UsdaApi {

    @GET("search?format=json")              // Is appended to the base URL
    fun getFoods(
        @Query("q") searchTerm: String,     // Only non-optional parameter
        @Query("sort") sortBy: Char = 'r',  // Sorts by relevance by default
        @Query("ds") dataSource: String = "Standard Reference",
        @Query("offset") offset: Int = 0
    ): Call<ResponseBody>                   // Allows to retrieve raw JSON for now

}