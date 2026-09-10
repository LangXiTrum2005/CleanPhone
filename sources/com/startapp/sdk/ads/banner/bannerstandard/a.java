package com.startapp.sdk.ads.banner.bannerstandard;

import com.startapp.sdk.internal.zf;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements zf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerStandard f40453a;

    public a(BannerStandard bannerStandard) {
        this.f40453a = bannerStandard;
    }

    @Override // com.startapp.sdk.internal.zf
    public final void a(String str) {
        this.f40453a.onImpressionSent(str);
    }
}
