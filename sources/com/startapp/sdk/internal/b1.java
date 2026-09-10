package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* JADX INFO: loaded from: classes6.dex */
public final class b1 extends gb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f40825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f40826c;

    public b1(Context context, lb lbVar, lb lbVar2, lb lbVar3, lb lbVar4, lb lbVar5, lb lbVar6, lb lbVar7, lb lbVar8, lb lbVar9, int i2) {
        super(context, AdPreferences.Placement.INAPP_BANNER, lbVar, lbVar2, lbVar3, lbVar4, lbVar5, lbVar6, lbVar7, lbVar8, lbVar9);
        this.f40825b = i2;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final b2 createService(AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        Context context = this.context;
        lb lbVar = this.httpClient;
        lb lbVar2 = this.networkApiExecutor;
        lb lbVar3 = this.eventTracer;
        lb lbVar4 = this.motionProcessor;
        int i2 = this.f40825b;
        this.f40825b = i2 + 1;
        return new x7(context, this, adPreferences, adEventListener, lbVar, lbVar2, lbVar3, lbVar4, i2);
    }
}
