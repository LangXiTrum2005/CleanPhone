package com.inmobi.media;

import okhttp3.adultoid;
import okhttp3.kowloon;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.s9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3221s9 {
    public static C3271u9 a(adultoid[] interceptors, kowloon dispatcher, adultoid[] networkInterceptors, C3158pk timeoutConfig, int i) {
        if ((i & 1) != 0) {
            interceptors = new adultoid[0];
        }
        if ((i & 2) != 0) {
            dispatcher = A9.b;
        }
        if ((i & 4) != 0) {
            networkInterceptors = new adultoid[0];
        }
        if ((i & 8) != 0) {
            timeoutConfig = new C3158pk(60L, 60L, 60L);
        }
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(networkInterceptors, "networkInterceptors");
        Intrinsics.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        return new C3271u9(interceptors, networkInterceptors, dispatcher, timeoutConfig);
    }
}
