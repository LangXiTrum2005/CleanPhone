package com.chartboost.sdk.internal.Networking;

import com.chartboost.sdk.impl.qf;
import com.unity3d.services.core.network.model.HttpRequest;
import java.net.URL;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements EndpointRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qf f15778a;

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.Networking.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0179a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15779a;

        static {
            int[] iArr = new int[EndpointRepository.EndPoint.values().length];
            try {
                iArr[EndpointRepository.EndPoint.INTERSTITIAL_GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EndpointRepository.EndPoint.REWARDED_GET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EndpointRepository.EndPoint.PREFETCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f15779a = iArr;
        }
    }

    public a(qf sdkConfiguration) {
        Intrinsics.f(sdkConfiguration, "sdkConfiguration");
        this.f15778a = sdkConfiguration;
    }

    public final URL a(EndpointRepository.EndPoint endPoint) {
        int i2 = C0179a.f15779a[endPoint.ordinal()];
        if (i2 == 1) {
            return a(endPoint, String.format("webview/%s/interstitial/get", Arrays.copyOf(new Object[]{this.f15778a.y}, 1)));
        }
        if (i2 == 2) {
            return a(endPoint, String.format("webview/%s/reward/get", Arrays.copyOf(new Object[]{this.f15778a.y}, 1)));
        }
        if (i2 != 3) {
            return null;
        }
        String webviewPrefetchEndpoint = this.f15778a.f14950z;
        Intrinsics.e(webviewPrefetchEndpoint, "webviewPrefetchEndpoint");
        return a(endPoint, webviewPrefetchEndpoint);
    }

    @Override // com.chartboost.sdk.internal.Networking.EndpointRepository
    public URL getEndPointUrl(EndpointRepository.EndPoint endPoint) {
        Intrinsics.f(endPoint, "endPoint");
        URL urlA = a(endPoint);
        return urlA == null ? b.b(endPoint) : urlA;
    }

    @Override // com.chartboost.sdk.internal.Networking.EndpointRepository
    public void restoreDefaults() {
    }

    @Override // com.chartboost.sdk.internal.Networking.EndpointRepository
    public void setEndpoint(EndpointRepository.EndPoint endPoint, String host, String path) {
        Intrinsics.f(endPoint, "endPoint");
        Intrinsics.f(host, "host");
        Intrinsics.f(path, "path");
        throw new IllegalStateException("Cannot set endpoint");
    }

    public final URL a(EndpointRepository.EndPoint endPoint, String str) {
        return new URL(HttpRequest.DEFAULT_SCHEME, b.a(endPoint), android.support.v4.media.a.C("/", str));
    }
}
