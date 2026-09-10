package com.applovin.impl;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
abstract class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.applovin.impl.sdk.l f9985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Activity f9986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final com.applovin.impl.sdk.ad.b f9987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ViewGroup f9988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final FrameLayout.LayoutParams f9989e;

    public x1(com.applovin.impl.sdk.ad.b bVar, Activity activity, com.applovin.impl.sdk.l lVar) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        this.f9989e = layoutParams;
        this.f9987c = bVar;
        this.f9985a = lVar;
        this.f9986b = activity;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f9988d = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setLayoutParams(layoutParams);
    }

    public void a(View view) {
        this.f9988d.removeView(view);
    }

    public void a(com.applovin.impl.adview.g gVar) {
        if (gVar == null || gVar.getParent() != null) {
            return;
        }
        a(this.f9987c.n(), (this.f9987c.s0() ? 3 : 5) | 48, gVar);
    }

    public void a(com.applovin.impl.sdk.ad.b.d dVar, int i10, com.applovin.impl.adview.g gVar) {
        gVar.a(dVar.f9368a, dVar.f9372e, dVar.f9371d, i10);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gVar.getLayoutParams());
        int i11 = dVar.f9370c;
        layoutParams.setMargins(i11, dVar.f9369b, i11, 0);
        layoutParams.gravity = i10;
        this.f9988d.addView(gVar, layoutParams);
    }
}
