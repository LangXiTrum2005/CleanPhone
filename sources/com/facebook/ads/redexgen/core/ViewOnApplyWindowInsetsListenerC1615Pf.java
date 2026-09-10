package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnApplyWindowInsetsListenerC1615Pf implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ PR A00;
    public final /* synthetic */ C0n A01;

    public ViewOnApplyWindowInsetsListenerC1615Pf(C0n c0n, PR pr) {
        this.A01 = c0n;
        this.A00 = pr;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C1631Py compatInsets = this.A00.ACw(view, C1631Py.A00(windowInsets));
        return (WindowInsets) C1631Py.A01(compatInsets);
    }
}
