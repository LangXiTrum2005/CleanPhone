package com.charging.screenshow.battery.animations.themes.download;

import androidx.room.e;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/download/HttpUtil;", "", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HttpUtil {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f13255b = LazyKt.a(LazyThreadSafetyMode.X, new e(10));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OkHttpClient f13256a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/download/HttpUtil$Companion;", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public final void a(String url, DownloadTask$start$1 downloadTask$start$1) {
        Intrinsics.f(url, "url");
        Request requestBuild = new Request.Builder().url(url).build();
        OkHttpClient okHttpClient = this.f13256a;
        Intrinsics.c(okHttpClient);
        okHttpClient.newCall(requestBuild).enqueue(downloadTask$start$1);
    }
}
