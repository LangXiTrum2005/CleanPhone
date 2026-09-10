package com.inmobi.media;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: renamed from: com.inmobi.media.zc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3340zc implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        Intrinsics.f(chain, "chain");
        Request request = chain.request();
        request.tag();
        Response responseProceed = chain.proceed(request);
        Intrinsics.e(responseProceed, "proceed(...)");
        return responseProceed;
    }
}
