package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* JADX INFO: loaded from: classes6.dex */
public final class we extends na {
    public we(Context context, lb lbVar, lb lbVar2, lb lbVar3, lb lbVar4, lb lbVar5, lb lbVar6, lb lbVar7, lb lbVar8, lb lbVar9) {
        super(context, AdPreferences.Placement.INAPP_NATIVE, lbVar, lbVar2, lbVar3, lbVar4, lbVar5, lbVar6, lbVar7, lbVar8, lbVar9);
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final b2 createService(AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        setErrorMessage("Disabled");
        return null;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final void load(AdPreferences adPreferences, AdEventListener adEventListener) {
        setErrorMessage("Disabled");
        if (adEventListener != null) {
            adEventListener.onFailedToReceiveAd(this);
        }
    }
}
