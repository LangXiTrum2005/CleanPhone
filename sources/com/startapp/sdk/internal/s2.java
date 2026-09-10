package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

/* JADX INFO: loaded from: classes6.dex */
public final class s2 implements AdEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w2 f41464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f41465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x2 f41466c;

    public s2(x2 x2Var, w2 w2Var, boolean z2) {
        this.f41466c = x2Var;
        this.f41464a = w2Var;
        this.f41465b = z2;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
        x2 x2Var = this.f41466c;
        x2Var.o = null;
        x2Var.a(null, this.f41465b);
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        a0.b(this.f41466c.f41653a, this.f41464a, ad, true);
    }
}
