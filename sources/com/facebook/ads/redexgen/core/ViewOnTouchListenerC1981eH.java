package com.facebook.ads.redexgen.core;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC1981eH implements View.OnTouchListener {
    public final /* synthetic */ C1982eI A00;

    public ViewOnTouchListenerC1981eH(C1982eI c1982eI) {
        this.A00 = c1982eI;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.A00.A01 = System.currentTimeMillis();
            C1982eI.A00(this.A00);
            this.A00.A06.ABp(this.A00.A03.A2E(), new C1788b9().A03(this.A00.getViewabilityChecker()).A02(this.A00.getTouchDataRecorder()).A05());
            return false;
        }
        return false;
    }
}
