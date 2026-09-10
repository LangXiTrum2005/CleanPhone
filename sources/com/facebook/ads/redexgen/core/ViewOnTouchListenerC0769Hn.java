package com.facebook.ads.redexgen.core;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC0769Hn implements View.OnTouchListener {
    public final /* synthetic */ C0770Ho A00;

    public ViewOnTouchListenerC0769Hn(C0770Ho c0770Ho) {
        this.A00 = c0770Ho;
    }

    public /* synthetic */ ViewOnTouchListenerC0769Hn(C0770Ho c0770Ho, C0841Kh c0841Kh) {
        this(c0770Ho);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.A00.A01 = System.currentTimeMillis();
            C0770Ho.A00(this.A00);
            this.A00.A07.ABE(this.A00.A04.A1g(), new FB().A03(this.A00.getViewabilityChecker()).A02(this.A00.getTouchDataRecorder()).A05());
            return false;
        }
        return false;
    }
}
