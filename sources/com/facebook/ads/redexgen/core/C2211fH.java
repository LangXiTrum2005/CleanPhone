package com.facebook.ads.redexgen.core;

import android.graphics.Paint;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2211fH extends Paint {
    public final /* synthetic */ C2212fI A00;
    public final /* synthetic */ boolean A01;

    public C2211fH(C2212fI c2212fI, boolean z2) {
        this.A00 = c2212fI;
        this.A01 = z2;
        setStyle(Paint.Style.FILL_AND_STROKE);
        setStrokeCap(Paint.Cap.ROUND);
        setStrokeWidth(3.0f);
        setAntiAlias(true);
        setColor(this.A01 ? -1 : -10066330);
    }
}
