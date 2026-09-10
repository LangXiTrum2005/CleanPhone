package com.chartboost.sdk.impl;

import android.os.Build;
import com.chartboost.sdk.internal.Networking.NetworkHelper;
import java.security.KeyManagementException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f13672a = new a(null);

    public static final class a {
        public a() {
        }

        public final SSLSocketFactory a() throws KeyManagementException {
            SSLContext sSLContext = Build.VERSION.SDK_INT >= 29 ? SSLContext.getInstance("TLSv1.3") : SSLContext.getInstance("TLSv1.2");
            if (NetworkHelper.a()) {
                sSLContext.init(null, new X509TrustManager[]{nf.c()}, null);
            } else {
                sSLContext.init(null, null, null);
            }
            sSLContext.createSSLEngine();
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            Intrinsics.e(socketFactory, "getSocketFactory(...)");
            return socketFactory;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final SSLSocketFactory a() {
        return f13672a.a();
    }
}
