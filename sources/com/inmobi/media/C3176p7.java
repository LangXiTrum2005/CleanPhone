package com.inmobi.media;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;

/* JADX INFO: renamed from: com.inmobi.media.p7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3176p7 implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        Intrinsics.f(chain, "chain");
        Response responseProceed = chain.proceed(chain.request());
        if (!responseProceed.isRedirect()) {
            return responseProceed;
        }
        String strHeader = responseProceed.isRedirect() ? responseProceed.header("Location") : null;
        if (strHeader != null) {
            try {
                new URL(strHeader);
                return responseProceed;
            } catch (MalformedURLException unused) {
            }
        }
        chain.call().cancel();
        throw new MalformedURLException(AbstractC3041h0.a("Invalid URL in Location header: ", strHeader));
    }
}
