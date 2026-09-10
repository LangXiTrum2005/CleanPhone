package com.startapp.sdk.internal;

import android.view.View;
import com.startapp.sdk.ads.banner.BannerListener;

/* JADX INFO: loaded from: classes6.dex */
public final class m1 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f41236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1 f41237b;

    public m1(n1 n1Var) {
        this.f41237b = n1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.f41236a) {
            return;
        }
        this.f41236a = true;
        this.f41237b.f41263c.f40472b.removeOnAttachStateChangeListener(this);
        com.startapp.sdk.ads.banner.d dVar = this.f41237b.f41263c;
        BannerListener bannerListener = dVar.f40471a;
        if (bannerListener != null) {
            bannerListener.onReceiveAd(dVar.f40472b);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
