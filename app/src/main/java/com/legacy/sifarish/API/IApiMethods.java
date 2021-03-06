package com.legacy.sifarish.API;

import com.legacy.sifarish.POJO.BuyItem;
import com.legacy.sifarish.POJO.FourSquareResponse;
import com.legacy.sifarish.POJO.PurchaseItem;
import com.legacy.sifarish.POJO.RecommendationItem;
import com.legacy.sifarish.POJO.UserPost;

import java.util.ArrayList;

import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.POST;
import retrofit.http.Query;

public interface IApiMethods {

    @GET("/users/self/checkins")
    FourSquareResponse search(
            @Query("oauth_token") String searchTerm,
            @Query("v") String date
    );

    @GET("/recommend")
    ArrayList<RecommendationItem> getRecommendation(@Query("userId") String userId, @Query("storeId") String storeId);

    @POST("/user")
    UserPost createUser(@Body UserPost user);

    @POST("/buy")
    BuyItem buyItem(@Body BuyItem bi);

    @Headers("Content-Type: application/json")
    @GET("/purchaseHistory")
    ArrayList<PurchaseItem> getHistory(@Query("userId") String userId);
}
