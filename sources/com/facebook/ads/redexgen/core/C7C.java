package com.facebook.ads.redexgen.core;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7C, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7C extends C2329hB {
    public InterfaceC2172ee A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A08(NativeAdLayout nativeAdLayout, C2300gi c2300gi, NativeAd nativeAd, C1764Vd c1764Vd) {
        C1994bk c1994bk = new C1994bk(c2300gi);
        MediaView mediaView = new MediaView(c2300gi);
        AdOptionsView adOptionsView = new AdOptionsView(c2300gi, nativeAd, nativeAdLayout);
        c1764Vd.A09(adOptionsView, 28);
        this.A00 = new F2(c2300gi, nativeAd, c1764Vd, UK.A0L(nativeAd.getInternalNativeAd()).A1C(), c1994bk, mediaView, adOptionsView);
        YB.A0N(nativeAdLayout, c1764Vd.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, c1994bk, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.C1670Rm, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
