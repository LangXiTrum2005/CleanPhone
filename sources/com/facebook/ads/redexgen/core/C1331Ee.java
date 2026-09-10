package com.facebook.ads.redexgen.core;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ee, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1331Ee implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ C1332Ef A00;
    public final /* synthetic */ C12179h A01;

    public C1331Ee(C1332Ef c1332Ef, C12179h c12179h) {
        this.A00 = c1332Ef;
        this.A01 = c12179h;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z2) {
        this.A01.A0L();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z2) {
        this.A01.A0L();
    }
}
