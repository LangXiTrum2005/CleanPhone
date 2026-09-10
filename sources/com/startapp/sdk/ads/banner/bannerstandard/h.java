package com.startapp.sdk.ads.banner.bannerstandard;

import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.ea;
import com.startapp.sdk.internal.h7;
import com.startapp.sdk.internal.i7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h implements Function1 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ AdUnitConfig f40465Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ MetaData e0;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;

    public /* synthetic */ h(Object obj, Object obj2, AdUnitConfig adUnitConfig, int i2, MetaData metaData, int i3) {
        this.X = i3;
        this.f0 = obj;
        this.g0 = obj2;
        this.f40465Y = adUnitConfig;
        this.Z = i2;
        this.e0 = metaData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.X) {
            case 0:
                MetaData metaData = this.e0;
                ea eaVar = (ea) obj;
                return ((BannerStandard) this.f0).lambda$loadExternalInline$0((i7) this.g0, this.f40465Y, this.Z, metaData, eaVar);
            default:
                MetaData metaData2 = this.e0;
                h7 h7Var = (h7) obj;
                return ((StartAppAd) this.f0).a((AdEventListener) this.g0, this.f40465Y, this.Z, metaData2, h7Var);
        }
    }
}
