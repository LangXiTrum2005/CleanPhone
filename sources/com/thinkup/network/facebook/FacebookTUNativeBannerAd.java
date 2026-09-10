package com.thinkup.network.facebook;

import android.content.Context;
import android.view.View;
import com.facebook.ads.NativeBannerAd;

/* JADX INFO: loaded from: classes6.dex */
public class FacebookTUNativeBannerAd extends FacebookTUBaseNativeAd<NativeBannerAd> {
    private final String mo;

    public FacebookTUNativeBannerAd(Context context, NativeBannerAd nativeBannerAd) {
        super(context, nativeBannerAd, false);
        this.mo = "FacebookTUNativeBannerAd";
    }

    @Override // com.thinkup.network.facebook.FacebookTUBaseNativeAd, com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.nativead.unitgroup.o, com.thinkup.core.api.ITUThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        return null;
    }
}
