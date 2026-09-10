package com.facebook.ads.redexgen.core;

import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1760iv implements AR {
    public final /* synthetic */ MediaViewVideoRendererApi A00;
    public final /* synthetic */ C1755iq A01;

    public C1760iv(C1755iq c1755iq, MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        this.A01 = c1755iq;
        this.A00 = mediaViewVideoRendererApi;
    }

    @Override // com.facebook.ads.redexgen.core.AR
    public final void AIa() {
        this.A00.setVolume(1.0f);
    }

    @Override // com.facebook.ads.redexgen.core.AR
    public final void AIf(NativeAd nativeAd) {
        this.A01.A0I(C1744ie.A0L(nativeAd.getInternalNativeAd()), new C1756ir(C1744ie.A0L(nativeAd.getInternalNativeAd())));
    }

    @Override // com.facebook.ads.redexgen.core.AR
    public final void AJd() {
        this.A01.A0D();
    }
}
