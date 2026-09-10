package com.startapp.sdk.internal;

import android.graphics.Point;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerOptions;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class jk implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeakReference f41165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Point f41166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BannerOptions f41167c;
    public final /* synthetic */ com.startapp.sdk.ads.banner.bannerstandard.e d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kk f41168e;

    public jk(kk kkVar, WeakReference weakReference, Point point, BannerOptions bannerOptions, com.startapp.sdk.ads.banner.bannerstandard.e eVar) {
        this.f41168e = kkVar;
        this.f41165a = weakReference;
        this.f41166b = point;
        this.f41167c = bannerOptions;
        this.d = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lk lkVarA = hk.a((View) this.f41165a.get(), this.f41166b, this.f41167c, new AtomicReference(), true);
        this.d.a(lkVarA.d == null, lkVarA);
        this.f41168e.f41191a.postDelayed(this, 100L);
    }
}
