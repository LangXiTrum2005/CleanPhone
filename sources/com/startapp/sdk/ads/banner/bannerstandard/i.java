package com.startapp.sdk.ads.banner.bannerstandard;

import com.startapp.sdk.internal.i7;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i implements i7 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ BannerStandard f40466Y;
    public final /* synthetic */ String Z;

    public /* synthetic */ i(BannerStandard bannerStandard, String str, int i2) {
        this.X = i2;
        this.f40466Y = bannerStandard;
        this.Z = str;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.X) {
            case 0:
                return this.f40466Y.lambda$reload$2(this.Z, bool);
            default:
                return this.f40466Y.lambda$onFailedToReceiveBanner$3(this.Z, bool);
        }
    }
}
