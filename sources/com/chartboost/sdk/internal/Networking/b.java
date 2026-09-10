package com.chartboost.sdk.internal.Networking;

import com.unity3d.services.core.network.model.HttpRequest;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15780a;

        static {
            int[] iArr = new int[EndpointRepository.EndPoint.values().length];
            try {
                iArr[EndpointRepository.EndPoint.BANNER_GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f15780a = iArr;
        }
    }

    public static final String a(EndpointRepository.EndPoint endPoint) {
        Intrinsics.f(endPoint, "<this>");
        return a.f15780a[endPoint.ordinal()] == 1 ? EndpointRepository.a.DA.b() : EndpointRepository.a.AD_GET.b();
    }

    public static final URL b(EndpointRepository.EndPoint endPoint) {
        Intrinsics.f(endPoint, "<this>");
        return new URL(HttpRequest.DEFAULT_SCHEME, a(endPoint), endPoint.getDefaultValue());
    }

    public static final String a(URL url) {
        Intrinsics.f(url, "<this>");
        return android.support.v4.media.a.D(url.getProtocol(), "://", url.getHost());
    }
}
