package com.inmobi.media;

import kotlinx.coroutines.cutely;
import kotlinx.coroutines.walach;
import okhttp3.adultoid;
import okhttp3.kowloon;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.u9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3271u9 {
    public final C3341x4 a;

    public C3271u9(adultoid[] interceptors, adultoid[] networkInterceptors, kowloon dispatcher, C3158pk timeoutConfig) {
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(networkInterceptors, "networkInterceptors");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        this.a = new C3341x4(interceptors, networkInterceptors, dispatcher, timeoutConfig);
    }

    public final walach a(Me request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return cutely.saneness(A9.c, null, null, new C3246t9(this, request, null), 3, null);
    }
}
