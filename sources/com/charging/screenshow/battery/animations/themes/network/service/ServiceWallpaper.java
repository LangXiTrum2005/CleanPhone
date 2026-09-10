package com.charging.screenshow.battery.animations.themes.network.service;

import b0.b;
import com.charging.screenshow.battery.animations.themes.network.api.ApiWallpaper;
import com.charging.screenshow.battery.animations.themes.network.base.resource.ResourceExtKt;
import com.charging.screenshow.battery.animations.themes.utils.ase.AES128Util;
import com.google.gson.Gson;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/network/service/ServiceWallpaper;", "", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ServiceWallpaper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gson f13293a = new Gson();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ApiWallpaper f13294b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/network/service/ServiceWallpaper$Companion;", "", "", "TAG", "Ljava/lang/String;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public final ApiWallpaper a() {
        if (this.f13294b == null) {
            Retrofit.Builder builderBaseUrl = new Retrofit.Builder().baseUrl(AES128Util.a("E40E4FB4D5BEA241D7A5F2F16F11A9141DFEEE0F3B478EB1A66C9A2921E9467F166711392EE638D86CDC48374120BFC1"));
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.f13294b = (ApiWallpaper) builderBaseUrl.client(builder.connectTimeout(10L, timeUnit).readTimeout(10L, timeUnit).cache(null).writeTimeout(10L, timeUnit).hostnameVerifier(new b(1)).build()).addConverterFactory(new ServiceWallpaper$getApi$1()).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).addConverterFactory(GsonConverterFactory.create(new Gson())).build().create(ApiWallpaper.class);
        }
        ApiWallpaper apiWallpaper = this.f13294b;
        Intrinsics.c(apiWallpaper);
        return apiWallpaper;
    }

    public final Observable b(int i2, int i3, String categoryId, String str) {
        Intrinsics.f(categoryId, "categoryId");
        return ResourceExtKt.b(a().getImagesByCategoryId(categoryId, str, i2, i3, new ArrayList<>(), new ArrayList<>()), this.f13293a);
    }
}
