package com.facebook.ads.redexgen.core;

import com.facebook.ads.redexgen.core.AbstractC1165Eh;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Eh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1165Eh<T extends AbstractC1165Eh<T>> {
    public final int A00;
    public final int A01;
    public final C2691qI A02;
    public final C2654pg A03;

    public abstract int A08();

    public abstract boolean A09(T t);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Eh != com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TrackInfo<T extends com.facebook.ads.redexgen.X.Eh<T>> */
    public AbstractC1165Eh(int i, C2654pg c2654pg, int i2) {
        this.A00 = i;
        this.A03 = c2654pg;
        this.A01 = i2;
        this.A02 = c2654pg.A08(i2);
    }
}
