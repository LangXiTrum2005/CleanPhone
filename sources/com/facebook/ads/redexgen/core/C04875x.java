package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C04875x {
    public int A00;
    public int A01;
    public int A02;
    public int A03;

    private final C04875x A00(C6K c6k, int i) {
        View view = c6k.A0H;
        this.A01 = view.getLeft();
        this.A03 = view.getTop();
        this.A02 = view.getRight();
        this.A00 = view.getBottom();
        return this;
    }

    public final C04875x A01(C6K c6k) {
        return A00(c6k, 0);
    }
}
