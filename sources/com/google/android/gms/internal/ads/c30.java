package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c30 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bz f13005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g30 f13006b;

    public c30(g30 g30Var, bz bzVar) {
        this.f13005a = bzVar;
        this.f13006b = g30Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f13006b.Q(view, this.f13005a, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
