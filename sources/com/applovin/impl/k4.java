package com.applovin.impl;

import android.webkit.WebView;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class k4 extends h4 {
    public k4(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        super(appLovinNativeAdImpl);
    }

    @Override // com.applovin.impl.h4
    public AdSessionContext a(WebView webView) {
        try {
            return AdSessionContext.createNativeAdSessionContext(this.f8065b.g0().b(), this.f8065b.g0().a(), this.f8064a.getOpenMeasurementVerificationScriptResources(), this.f8064a.getOpenMeasurementContentUrl(), this.f8064a.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th2) {
            if (!com.applovin.impl.sdk.p.a()) {
                return null;
            }
            this.f8066c.a(this.f8067d, "Failed to create ad session context", th2);
            return null;
        }
    }

    @Override // com.applovin.impl.h4
    public AdSessionConfiguration a() {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.NATIVE_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false);
        } catch (Throwable th2) {
            if (!com.applovin.impl.sdk.p.a()) {
                return null;
            }
            this.f8066c.a(this.f8067d, "Failed to create ad session configuration", th2);
            return null;
        }
    }
}
