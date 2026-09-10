package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Dispatcher;
import okhttp3.Interceptor;

/* JADX INFO: loaded from: classes5.dex */
public final class G5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2962c3 f22841a;

    public G5(Interceptor[] interceptors, Dispatcher dispatcher, C3055he timeoutConfig) {
        Intrinsics.f(interceptors, "interceptors");
        Intrinsics.f(dispatcher, "dispatcher");
        Intrinsics.f(timeoutConfig, "timeoutConfig");
        this.f22841a = new C2962c3(interceptors, dispatcher, timeoutConfig);
    }
}
