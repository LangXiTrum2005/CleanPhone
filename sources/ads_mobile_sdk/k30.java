package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import kurbash.formularize;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.MutablePropertyReference1Impl;
import p002kotlin.jvm.internal.polloi;

/* JADX INFO: loaded from: classes.dex */
public final class k30 extends mj implements acidy.attabal {
    public static final /* synthetic */ formularize[] g = {polloi.competently(new MutablePropertyReference1Impl(k30.class, "adEventCallback", "getAdEventCallback()Lcom/google/android/libraries/ads/mobile/sdk/nativead/NativeAdEventCallback;", 0)), polloi.competently(new MutablePropertyReference1Impl(k30.class, "onCustomClickListener", "getOnCustomClickListener()Lcom/google/android/libraries/ads/mobile/sdk/nativead/OnCustomClickListener;", 0))};
    public final InternalNativeAd b;
    public final vw2 c;
    public final vw2 d;
    public final String e;
    public final id1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k30(InternalNativeAd internalNativeAd) {
        super(internalNativeAd);
        Intrinsics.checkNotNullParameter(internalNativeAd, "internalNativeAd");
        this.b = internalNativeAd;
        this.c = new vw2(new i30(this), null);
        this.d = new vw2(new j30(this), null);
        this.e = internalNativeAd.getF19437saneness().c;
        this.f = new id1(internalNativeAd);
    }
}
