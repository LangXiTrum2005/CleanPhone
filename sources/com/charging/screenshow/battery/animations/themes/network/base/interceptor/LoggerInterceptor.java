package com.charging.screenshow.battery.animations.themes.network.base.interceptor;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/network/base/interceptor/LoggerInterceptor;", "Lokhttp3/Interceptor;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoggerInterceptor implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Intrinsics.f(chain, "chain");
        return chain.proceed(chain.request());
    }
}
