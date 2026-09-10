package com.startapp.sdk.ads.banner.bannerstandard;

import com.startapp.sdk.internal.lk;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerStandard.a f40462a;

    public e(BannerStandard.a aVar) {
        this.f40462a = aVar;
    }

    public final void a(boolean z2, lk lkVar) {
        this.f40462a.fireViewableChangeEvent(z2);
        this.f40462a.fireExposureChangeEvent(lkVar);
        if (z2) {
            BannerStandard.this.proceedWithImpression();
        }
    }
}
