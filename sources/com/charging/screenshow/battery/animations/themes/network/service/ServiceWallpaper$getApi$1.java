package com.charging.screenshow.battery.animations.themes.network.service;

import b0.d;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/charging/screenshow/battery/animations/themes/network/service/ServiceWallpaper$getApi$1", "Lretrofit2/Converter$Factory;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ServiceWallpaper$getApi$1 extends Converter.Factory {
    @Override // retrofit2.Converter.Factory
    public final Converter responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        Intrinsics.f(type, "type");
        Intrinsics.f(annotations, "annotations");
        Intrinsics.f(retrofit, "retrofit");
        return new d(retrofit.nextResponseBodyConverter(this, type, annotations), 1);
    }
}
