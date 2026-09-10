package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.cache.CachedVideoAd;

/* JADX INFO: loaded from: classes6.dex */
public final class gj implements ek {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ek f41021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CachedVideoAd f41022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f41023c;
    public final /* synthetic */ ij d;

    public gj(ij ijVar, ek ekVar, CachedVideoAd cachedVideoAd, Context context) {
        this.d = ijVar;
        this.f41021a = ekVar;
        this.f41022b = cachedVideoAd;
        this.f41023c = context;
    }

    @Override // com.startapp.sdk.internal.ek, com.startapp.sdk.internal.pe
    public final void a(String str) {
        ek ekVar = this.f41021a;
        if (ekVar != null) {
            ekVar.a(str);
        }
        if (str != null) {
            this.f41022b.a(System.currentTimeMillis());
            this.f41022b.a(str);
            ij ijVar = this.d;
            Context context = this.f41023c;
            CachedVideoAd cachedVideoAd = this.f41022b;
            ijVar.f41116a.remove(cachedVideoAd);
            ijVar.a(AdsCommonMetaData.k().F().c() - 1);
            ijVar.f41116a.add(cachedVideoAd);
            g7.b(context, "CachedAds", ijVar.f41116a);
        }
    }
}
