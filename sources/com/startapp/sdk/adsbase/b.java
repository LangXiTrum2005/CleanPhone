package com.startapp.sdk.adsbase;

import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import com.startapp.sdk.internal.ii;
import com.startapp.sdk.internal.lc;
import com.startapp.sdk.internal.y6;
import com.startapp.sdk.internal.z6;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements lc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdPreferences f40628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f40629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f40630c;
    public final /* synthetic */ Ad d;

    public b(Ad ad, AdPreferences adPreferences, a aVar, String str) {
        this.d = ad;
        this.f40628a = adPreferences;
        this.f40629b = aVar;
        this.f40630c = str;
    }

    @Override // com.startapp.sdk.internal.lc
    public final void a(MetaDataRequest$RequestReason metaDataRequest$RequestReason, boolean z2) {
        ((z6) ((y6) this.d.eventTracer.a())).c(this, ii.m);
        this.d.loadAds(this.f40628a, this.f40629b, this.f40630c);
    }

    @Override // com.startapp.sdk.internal.lc
    public final void a() {
        ((z6) ((y6) this.d.eventTracer.a())).c(this, ii.f41111n);
        this.d.loadAds(this.f40628a, this.f40629b, this.f40630c);
    }
}
