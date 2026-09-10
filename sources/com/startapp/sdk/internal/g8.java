package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* JADX INFO: loaded from: classes6.dex */
public final class g8 extends t1 {
    public g8(Context context, ae aeVar, AdPreferences adPreferences, AdEventListener adEventListener, lb lbVar, lb lbVar2, lb lbVar3, lb lbVar4, lb lbVar5) {
        super(context, aeVar, adPreferences, adEventListener, AdPreferences.Placement.INAPP_OVERLAY, lbVar, lbVar2, lbVar3, lbVar4, lbVar5, true);
    }

    @Override // com.startapp.sdk.adsbase.c
    /* JADX INFO: renamed from: c */
    public final void b(boolean z2) {
        super.b(z2);
        e(z2);
    }
}
