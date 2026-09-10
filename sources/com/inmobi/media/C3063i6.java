package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.i6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3063i6 extends AbstractC3047h6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterstitialAdEventListener f23691a;

    public C3063i6(InterstitialAdEventListener adEventListener) {
        Intrinsics.f(adEventListener, "adEventListener");
        this.f23691a = adEventListener;
    }

    @Override // com.inmobi.media.AbstractC3327z
    public final void a(Object obj, Map params) {
        InMobiInterstitial ad = (InMobiInterstitial) obj;
        Intrinsics.f(ad, "ad");
        Intrinsics.f(params, "params");
        this.f23691a.onAdClicked(ad, params);
    }

    @Override // com.inmobi.media.AbstractC3327z
    public final void b(Object obj, AdMetaInfo info) {
        InMobiInterstitial ad = (InMobiInterstitial) obj;
        Intrinsics.f(ad, "ad");
        Intrinsics.f(info, "info");
        this.f23691a.onAdLoadSucceeded(ad, info);
    }

    @Override // com.inmobi.media.AbstractC3327z
    public final void a(Object obj, AdMetaInfo info) {
        InMobiInterstitial ad = (InMobiInterstitial) obj;
        Intrinsics.f(ad, "ad");
        Intrinsics.f(info, "info");
        this.f23691a.onAdFetchSuccessful(ad, info);
    }

    @Override // com.inmobi.media.AbstractC3327z
    public final void a(Object obj) {
        InMobiInterstitial ad = (InMobiInterstitial) obj;
        Intrinsics.f(ad, "ad");
        this.f23691a.onAdImpression(ad);
    }

    @Override // com.inmobi.media.AbstractC3327z
    public final void a(Object obj, InMobiAdRequestStatus status) {
        InMobiInterstitial ad = (InMobiInterstitial) obj;
        Intrinsics.f(ad, "ad");
        Intrinsics.f(status, "status");
        this.f23691a.onAdLoadFailed(ad, status);
    }

    @Override // com.inmobi.media.AbstractC3327z
    public final void a(Object obj, String data) {
        InMobiInterstitial ad = (InMobiInterstitial) obj;
        Intrinsics.f(ad, "ad");
        Intrinsics.f(data, "data");
        try {
            Class<?> cls = Class.forName("IMraidLog");
            Method declaredMethod = cls.getDeclaredMethod("imraidLog", InterstitialAdEventListener.class, InMobiInterstitial.class, String.class);
            Intrinsics.e(declaredMethod, "getDeclaredMethod(...)");
            declaredMethod.invoke(cls.newInstance(), this.f23691a, ad, data);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
