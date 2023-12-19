
import com.example.loundryapps.data.response.DetailUserResponse
import com.example.loundryapps.data.response.ItemsItem
import com.example.loundryapps.data.response.UserResponse
import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @GET("search/users")
    @Headers("Authorization: token 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")
    fun getUser(
        @Query("q") login: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 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")
    fun getDetailUser(@Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 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")
    fun getFollowers(@Path("username") username: String): Call<List<ItemsItem>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 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")
    fun getFollowing(@Path("username") username: String): Call<List<ItemsItem>>
}