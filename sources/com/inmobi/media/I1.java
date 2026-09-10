package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.listeners.BannerAdEventListener;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class I1 extends H1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BannerAdEventListener f22875a;

    public I1(BannerAdEventListener adEventListener) {
        Intrinsics.f(adEventListener, "adEventListener");
        this.f22875a = adEventListener;
    }

    @Override // com.inmobi.media.AbstractC3327z
    public final void a(Object obj, Map params) {
        InMobiBanner ad = (InMobiBanner) obj;
        Intrinsics.f(ad, "ad");
        Intrinsics.f(params, "params");
        this.f22875a.onAdClicked(ad, params);
    }

    @Override // com.inmobi.media.AbstractC3327z
    public final void b(Object obj, AdMetaInfo info) {
        InMobiBanner ad = (InMobiBanner) obj;
        Intrinsics.f(ad, "ad");
        Intrinsics.f(info, "info");
        this.f22875a.onAdLoadSucceeded(ad, info);
    }

    @Override // com.inmobi.media.AbstractC3327z
    public final void a(Object obj, AdMetaInfo info) {
        InMobiBanner ad = (InMobiBanner) obj;
        Intrinsics.f(ad, "ad");
        Intrinsics.f(info, "info");
        this.f22875a.onAdFetchSuccessful(ad, info);
    }

    @Override // com.inmobi.media.AbstractC3327z
    public final void a(Object obj) {
        InMobiBanner ad = (InMobiBanner) obj;
        Intrinsics.f(ad, "ad");
        this.f22875a.onAdImpression(ad);
    }

    @Override // com.inmobi.media.AbstractC3327z
    public final void a(Object obj, InMobiAdRequestStatus status) {
        InMobiBanner ad = (InMobiBanner) obj;
        Intrinsics.f(ad, "ad");
        Intrinsics.f(status, "status");
        this.f22875a.onAdLoadFailed(ad, status);
    }

    @Override // com.inmobi.media.AbstractC3327z
    public final void a(Object obj, String data) {
        InMobiBanner ad = (InMobiBanner) obj;
        Intrinsics.f(ad, "ad");
        Intrinsics.f(data, "data");
        try {
            Class<?> cls = Class.forName("IMraidLog");
            Method declaredMethod = cls.getDeclaredMethod("imraidLog", BannerAdEventListener.class, InMobiBanner.class, String.class);
            Intrinsics.e(declaredMethod, "getDeclaredMethod(...)");
            declaredMethod.invoke(cls.newInstance(), this.f22875a, ad, data);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
