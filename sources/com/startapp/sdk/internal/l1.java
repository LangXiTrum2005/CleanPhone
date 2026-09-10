package com.startapp.sdk.internal;

import android.view.View;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;

/* JADX INFO: loaded from: classes6.dex */
public final class l1 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f41196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BannerStandard f41197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.banner.b f41198c;

    public l1(com.startapp.sdk.ads.banner.b bVar, BannerStandard bannerStandard) {
        this.f41198c = bVar;
        this.f41197b = bannerStandard;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.f41196a) {
            return;
        }
        this.f41196a = true;
        this.f41197b.removeOnAttachStateChangeListener(this);
        this.f41197b.onReceiveAd(this.f41198c.f40426b.d);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
