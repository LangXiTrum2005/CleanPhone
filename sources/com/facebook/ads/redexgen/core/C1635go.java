package com.facebook.ads.redexgen.core;

import android.hardware.display.DisplayManager;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.go, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1635go implements DisplayManager.DisplayListener {
    public final DisplayManager A00;
    public final /* synthetic */ C1637gq A01;

    public C1635go(C1637gq c1637gq, DisplayManager displayManager) {
        this.A01 = c1637gq;
        this.A00 = displayManager;
    }

    public final void A00() {
        this.A00.registerDisplayListener(this, null);
    }

    public final void A01() {
        this.A00.unregisterDisplayListener(this);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i != 0) {
            return;
        }
        this.A01.A03();
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
