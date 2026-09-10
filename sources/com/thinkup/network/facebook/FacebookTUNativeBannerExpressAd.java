package com.thinkup.network.facebook;

import android.content.Context;
import android.view.View;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.NativeBannerAdView;

/* JADX INFO: loaded from: classes6.dex */
public class FacebookTUNativeBannerExpressAd extends FacebookTUBaseNativeAd<NativeBannerAd> {
    View mm;
    private final String mn;
    NativeBannerAdView.Type mo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FacebookTUNativeBannerExpressAd(Context context, NativeBannerAd nativeBannerAd, String str) {
        super(context, nativeBannerAd, true);
        byte b2 = 1;
        this.mn = "FacebookTUNativeBannerExpressAd";
        NativeBannerAdView.Type type = NativeBannerAdView.Type.HEIGHT_50;
        this.mo = type;
        str.getClass();
        switch (str.hashCode()) {
            case 1691:
                b2 = !str.equals("50") ? (byte) -1 : (byte) 0;
                break;
            case 48625:
                if (!str.equals("100")) {
                    b2 = -1;
                }
                break;
            case 48687:
                b2 = !str.equals("120") ? (byte) -1 : (byte) 2;
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                this.mo = type;
                break;
            case 1:
                this.mo = NativeBannerAdView.Type.HEIGHT_100;
                break;
            case 2:
                this.mo = NativeBannerAdView.Type.HEIGHT_120;
                break;
        }
    }

    @Override // com.thinkup.network.facebook.FacebookTUBaseNativeAd, com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.nativead.unitgroup.o, com.thinkup.core.api.ITUThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        T t;
        try {
            if (!this.f42550n || (t = this.o) == 0 || !(t instanceof NativeBannerAd)) {
                return null;
            }
            if (this.mm == null) {
                this.mm = NativeBannerAdView.render(this.m, (NativeBannerAd) t, this.mo);
            }
            return this.mm;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
