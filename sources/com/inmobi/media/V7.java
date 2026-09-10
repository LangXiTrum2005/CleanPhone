package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.listeners.NativeAdEventListener;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class V7 extends U7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NativeAdEventListener f23300a;

    public V7(NativeAdEventListener adEventListener) {
        Intrinsics.f(adEventListener, "adEventListener");
        this.f23300a = adEventListener;
    }

    @Override // com.inmobi.media.AbstractC3327z
    public final void a(Object obj, AdMetaInfo info) {
        InMobiNative ad = (InMobiNative) obj;
        Intrinsics.f(ad, "ad");
        Intrinsics.f(info, "info");
        this.f23300a.onAdFetchSuccessful(ad, info);
    }

    @Override // com.inmobi.media.AbstractC3327z
    public final void b(Object obj, AdMetaInfo info) {
        InMobiNative ad = (InMobiNative) obj;
        Intrinsics.f(ad, "ad");
        Intrinsics.f(info, "info");
        this.f23300a.onAdLoadSucceeded(ad, info);
    }

    @Override // com.inmobi.media.AbstractC3327z
    public final void a(Object obj) {
        InMobiNative ad = (InMobiNative) obj;
        Intrinsics.f(ad, "ad");
        this.f23300a.onAdImpression(ad);
    }

    @Override // com.inmobi.media.AbstractC3327z
    public final void a(Object obj, InMobiAdRequestStatus status) {
        InMobiNative ad = (InMobiNative) obj;
        Intrinsics.f(ad, "ad");
        Intrinsics.f(status, "status");
        this.f23300a.onAdLoadFailed(ad, status);
    }

    @Override // com.inmobi.media.AbstractC3327z
    public final void a(Object obj, String data) {
        InMobiNative ad = (InMobiNative) obj;
        Intrinsics.f(ad, "ad");
        Intrinsics.f(data, "data");
        try {
            Class<?> cls = Class.forName("IMraidLog");
            Method declaredMethod = cls.getDeclaredMethod("imraidLog", NativeAdEventListener.class, InMobiNative.class, String.class);
            Intrinsics.e(declaredMethod, "getDeclaredMethod(...)");
            declaredMethod.invoke(cls.newInstance(), this.f23300a, ad, data);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
