package com.thinkup.network.facebook;

import android.content.Context;
import com.facebook.ads.Ad;
import com.facebook.ads.NativeAd;

/* JADX INFO: loaded from: classes6.dex */
public class FacebookTUNativeAd extends FacebookTUBaseNativeAd<NativeAd> {
    private final String mo;

    public FacebookTUNativeAd(Context context, NativeAd nativeAd) {
        super(context, nativeAd, false);
        this.mo = "FacebookTUNativeAd";
    }

    @Override // com.thinkup.network.facebook.FacebookTUBaseNativeAd, com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad) {
        T t = this.o;
        if (t != 0 && (t instanceof NativeAd)) {
            NativeAd nativeAd = (NativeAd) t;
            if (nativeAd.getAdCreativeType() == NativeAd.AdCreativeType.VIDEO) {
                this.mAdSourceType = "1";
            } else if (nativeAd.getAdCreativeType() == NativeAd.AdCreativeType.IMAGE) {
                this.mAdSourceType = "2";
            }
        }
        super.onAdLoaded(ad);
    }
}
