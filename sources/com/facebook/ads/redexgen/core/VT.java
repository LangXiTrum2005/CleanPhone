package com.facebook.ads.redexgen.core;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class VT implements View.OnTouchListener {
    public final /* synthetic */ C1784Vz A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public VT(C1784Vz c1784Vz, boolean z2, boolean z3) {
        this.A00 = c1784Vz;
        this.A02 = z2;
        this.A01 = z3;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.A02) {
            return false;
        }
        if (this.A01 && C1750Up.A1X(this.A00.A04)) {
            return false;
        }
        return true;
    }
}
