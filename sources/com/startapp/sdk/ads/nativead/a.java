package com.startapp.sdk.ads.nativead;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.internal.lb;
import com.startapp.sdk.internal.qd;
import com.startapp.sdk.internal.u1;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends u1 {
    public final NativeAdPreferences m;

    public a(Context context, qd qdVar, AdPreferences adPreferences, AdEventListener adEventListener, lb lbVar, lb lbVar2, lb lbVar3, lb lbVar4, NativeAdPreferences nativeAdPreferences) {
        super(context, qdVar, adPreferences, adEventListener, AdPreferences.Placement.INAPP_NATIVE, lbVar, lbVar2, lbVar3, lbVar4);
        this.m = nativeAdPreferences != null ? nativeAdPreferences : new NativeAdPreferences();
    }

    @Override // com.startapp.sdk.internal.u1
    public final void a(Ad ad) {
    }

    @Override // com.startapp.sdk.adsbase.c
    public final com.startapp.sdk.adsbase.model.a c() {
        com.startapp.sdk.adsbase.model.a aVarC = super.c();
        if (aVarC == null) {
            return null;
        }
        aVarC.t0 = this.m.getAdsNumber();
        if (this.m.getImageSize() != null) {
            aVarC.L = this.m.getImageSize().getWidth();
            aVarC.M = this.m.getImageSize().getHeight();
        } else {
            int primaryImageSize = this.m.getPrimaryImageSize();
            if (primaryImageSize == -1) {
                primaryImageSize = 2;
            }
            aVarC.P0 = Integer.toString(primaryImageSize);
            int secondaryImageSize = this.m.getSecondaryImageSize();
            aVarC.Q0 = Integer.toString(secondaryImageSize != -1 ? secondaryImageSize : 2);
        }
        if (this.m.isContentAd()) {
            aVarC.R0 = this.m.isContentAd();
        }
        return aVarC;
    }
}
