package com.facebook.ads.redexgen.core;

import android.media.Spatializer;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1400cy implements Spatializer.OnSpatializerStateChangedListener {
    public final /* synthetic */ C1401cz A00;
    public final /* synthetic */ C04845u A01;

    public C1400cy(C1401cz c1401cz, C04845u c04845u) {
        this.A00 = c1401cz;
        this.A01 = c04845u;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.A01.A0L();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.A01.A0L();
    }
}
