package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* JADX INFO: loaded from: classes6.dex */
public final class x7 extends u1 {
    public final int m;

    public x7(Context context, b1 b1Var, AdPreferences adPreferences, AdEventListener adEventListener, lb lbVar, lb lbVar2, lb lbVar3, lb lbVar4, int i2) {
        super(context, b1Var, adPreferences, adEventListener, AdPreferences.Placement.INAPP_BANNER, lbVar, lbVar2, lbVar3, lbVar4);
        this.m = i2;
    }

    @Override // com.startapp.sdk.internal.u1
    public final void a(Ad ad) {
    }

    @Override // com.startapp.sdk.adsbase.c
    public final com.startapp.sdk.adsbase.model.a c() {
        b1 b1Var = (b1) this.f40632b;
        f1 f1Var = new f1();
        a((com.startapp.sdk.adsbase.model.a) f1Var);
        f1Var.t0 = BannerMetaData.c().a().a();
        f1Var.E0 = this.m;
        f1Var.V0 = b1Var.f40826c;
        f1Var.f(this.f40631a);
        return f1Var;
    }
}
