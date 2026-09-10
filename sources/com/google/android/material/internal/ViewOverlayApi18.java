package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* JADX INFO: loaded from: classes4.dex */
class ViewOverlayApi18 implements ViewOverlayImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewOverlay f19353a;

    public ViewOverlayApi18(View view) {
        this.f19353a = view.getOverlay();
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public final void a(Drawable drawable) {
        this.f19353a.add(drawable);
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public final void b(Drawable drawable) {
        this.f19353a.remove(drawable);
    }
}
