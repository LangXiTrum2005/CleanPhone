package com.charging.screenshow.battery.animations.themes.network.api;

import com.charging.screenshow.battery.animations.themes.network.entity.ChargingResponse;
import com.charging.screenshow.battery.animations.themes.network.entity.ImageCategoryResponse;
import com.charging.screenshow.battery.animations.themes.network.entity.ImageResponse;
import com.charging.screenshow.battery.animations.themes.network.entity.LiveResponse;
import io.reactivex.Observable;
import java.util.ArrayList;
import kotlin.Metadata;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001Jp\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0018\b\u0001\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00070\rj\b\u0012\u0004\u0012\u00020\u0007`\u000e2\u0018\b\u0001\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00070\rj\b\u0012\u0004\u0012\u00020\u0007`\u000eH'J2\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\nH'J,\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\nH'J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00040\u0003H'J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0013H'J\u0014\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00040\u0003H'¨\u0006\u0019"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/network/api/ApiWallpaper;", "", "getImagesByCategoryId", "Lio/reactivex/Observable;", "Lretrofit2/Response;", "Lcom/charging/screenshow/battery/animations/themes/network/entity/ImageResponse;", "categoryId", "", "sort", "limit", "", "offset", "types", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "uploaderTypes", "getLive", "Lcom/charging/screenshow/battery/animations/themes/network/entity/LiveResponse;", "getLive2", "Lretrofit2/Call;", "getChargingList", "Lcom/charging/screenshow/battery/animations/themes/network/entity/ChargingResponse;", "getChargingList2", "getAllCategories", "Lcom/charging/screenshow/battery/animations/themes/network/entity/ImageCategoryResponse;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ApiWallpaper {
    @GET("categories")
    Observable<Response<ImageCategoryResponse>> getAllCategories();

    @GET("charging-animation")
    Observable<Response<ChargingResponse>> getChargingList();

    @GET("charging-animation")
    Call<ChargingResponse> getChargingList2();

    @GET("data")
    Observable<Response<ImageResponse>> getImagesByCategoryId(@Query("category_id") String categoryId, @Query("sort") String sort, @Query("limit") int limit, @Query("offset") int offset, @Query("types") ArrayList<String> types, @Query("uploader_types") ArrayList<String> uploaderTypes);

    @GET("videos")
    Observable<Response<LiveResponse>> getLive(@Query("sort") String sort, @Query("limit") int limit, @Query("offset") int offset);

    @GET("videos")
    Call<LiveResponse> getLive2(@Query("sort") String sort, @Query("limit") int limit, @Query("offset") int offset);
}
