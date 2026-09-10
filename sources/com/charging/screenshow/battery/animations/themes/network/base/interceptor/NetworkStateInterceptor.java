package com.charging.screenshow.battery.animations.themes.network.base.interceptor;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/network/base/interceptor/NetworkStateInterceptor;", "Lokhttp3/Interceptor;", "UnknownNetworkException", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NetworkStateInterceptor implements Interceptor {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/network/base/interceptor/NetworkStateInterceptor$UnknownNetworkException;", "Ljava/io/IOException;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnknownNetworkException extends IOException {
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Intrinsics.f(chain, "chain");
        throw null;
    }
}
