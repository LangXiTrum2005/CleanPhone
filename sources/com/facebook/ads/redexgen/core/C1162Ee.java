package com.facebook.ads.redexgen.core;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ee, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1162Ee implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ C1163Ef A00;
    public final /* synthetic */ C10489h A01;

    public C1162Ee(C1163Ef c1163Ef, C10489h c10489h) {
        this.A00 = c1163Ef;
        this.A01 = c10489h;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.A01.A0L();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.A01.A0L();
    }
}
