package com.startapp.sdk.ads.nativead;

import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeAdDetails f40512a;

    public h(NativeAdDetails nativeAdDetails) {
        this.f40512a = nativeAdDetails;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f40512a.startOmAdSession();
        this.f40512a.startCheckingVisibility();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f40512a.stopCheckingVisibility();
        this.f40512a.finishOmAdSession();
    }
}
