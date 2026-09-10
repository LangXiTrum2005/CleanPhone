package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ke2 extends ei {
    public final na2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke2(d41 internalBannerAd, cg2 view, na2 adLoader) {
        super(internalBannerAd, view);
        Intrinsics.checkNotNullParameter(internalBannerAd, "internalBannerAd");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(adLoader, "adLoader");
        this.e = adLoader;
    }

    @Override // ads_mobile_sdk.ei
    public final d41 a() {
        return (d41) this.e.v.a("The backing field has not yet been initialized.");
    }
}
