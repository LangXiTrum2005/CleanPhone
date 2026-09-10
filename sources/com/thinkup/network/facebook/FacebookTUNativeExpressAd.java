package com.thinkup.network.facebook;

import android.content.Context;
import android.view.View;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdView;

/* JADX INFO: loaded from: classes6.dex */
public class FacebookTUNativeExpressAd extends FacebookTUBaseNativeAd<NativeAd> {
    private final String mm;
    View mo;

    public FacebookTUNativeExpressAd(Context context, NativeAd nativeAd) {
        super(context, nativeAd, true);
        this.mm = "FacebookTUNativeExpressAd";
    }

    @Override // com.thinkup.network.facebook.FacebookTUBaseNativeAd, com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.nativead.unitgroup.o, com.thinkup.core.api.ITUThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        T t;
        try {
            if (!this.f42550n || (t = this.o) == 0 || !(t instanceof NativeAd)) {
                return null;
            }
            if (this.mo == null) {
                this.mo = NativeAdView.render(this.m, (NativeAd) t);
            }
            return this.mo;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
