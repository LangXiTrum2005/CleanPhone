package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* JADX INFO: loaded from: classes6.dex */
public final class r1 extends o8 {
    public int r;
    public boolean s;
    public int t;

    public r1(Context context, lb lbVar, lb lbVar2, lb lbVar3, lb lbVar4, lb lbVar5, lb lbVar6, lb lbVar7, lb lbVar8, lb lbVar9, int i2) {
        super(context, AdPreferences.Placement.INAPP_BANNER, lbVar, lbVar2, lbVar3, lbVar4, lbVar5, lbVar6, lbVar7, lbVar8, lbVar9);
        this.r = i2;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final b2 createService(AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        if (str != null) {
            return new y7(this.context, this, adEventListener, this.networkApiExecutor, this.eventTracer, this.webViewCacheLoader, str);
        }
        Context context = this.context;
        lb lbVar = this.httpClient;
        lb lbVar2 = this.networkApiExecutor;
        lb lbVar3 = this.eventTracer;
        lb lbVar4 = this.motionProcessor;
        lb lbVar5 = this.webViewCacheLoader;
        int i2 = this.r;
        this.r = i2 + 1;
        return new z7(context, this, adPreferences, adEventListener, lbVar, lbVar2, lbVar3, lbVar4, lbVar5, i2);
    }
}
