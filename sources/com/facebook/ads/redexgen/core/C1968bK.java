package com.facebook.ads.redexgen.core;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1968bK implements LayoutTransition.TransitionListener {
    public final /* synthetic */ C1969bL A00;

    public C1968bK(C1969bL c1969bL) {
        this.A00 = c1969bL;
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i2) {
        ((AbstractC1963bF) this.A00.A00.A00).A09.setAlpha(1.0f);
        this.A00.A00.A00.A0Q.setAlpha(1.0f);
        this.A00.A00.A00.A0P.setAlpha(1.0f);
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i2) {
    }
}
