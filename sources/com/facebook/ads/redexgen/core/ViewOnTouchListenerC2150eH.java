package com.facebook.ads.redexgen.core;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC2150eH implements View.OnTouchListener {
    public final /* synthetic */ C2151eI A00;

    public ViewOnTouchListenerC2150eH(C2151eI c2151eI) {
        this.A00 = c2151eI;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.A00.A01 = System.currentTimeMillis();
            C2151eI.A00(this.A00);
            this.A00.A06.ABp(this.A00.A03.A2E(), new C1957b9().A03(this.A00.getViewabilityChecker()).A02(this.A00.getTouchDataRecorder()).A05());
            return false;
        }
        return false;
    }
}
