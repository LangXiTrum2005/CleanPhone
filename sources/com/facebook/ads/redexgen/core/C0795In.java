package com.facebook.ads.redexgen.core;

import android.graphics.Paint;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.In, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0795In extends Paint {
    public final /* synthetic */ C0796Io A00;
    public final /* synthetic */ boolean A01;

    public C0795In(C0796Io c0796Io, boolean z) {
        this.A00 = c0796Io;
        this.A01 = z;
        setStyle(Paint.Style.FILL_AND_STROKE);
        setStrokeCap(Paint.Cap.ROUND);
        setStrokeWidth(3.0f);
        setAntiAlias(true);
        setColor(this.A01 ? -1 : -10066330);
    }
}
