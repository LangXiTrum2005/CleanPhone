package com.facebook.ads.redexgen.core;

import com.facebook.ads.redexgen.core.AbstractC1334Eh;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Eh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1334Eh<T extends AbstractC1334Eh<T>> {
    public final int A00;
    public final int A01;
    public final C2860qI A02;
    public final C2823pg A03;

    public abstract int A08();

    public abstract boolean A09(T t);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Eh != com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TrackInfo<T extends com.facebook.ads.redexgen.X.Eh<T>> */
    public AbstractC1334Eh(int i2, C2823pg c2823pg, int i3) {
        this.A00 = i2;
        this.A03 = c2823pg;
        this.A01 = i3;
        this.A02 = c2823pg.A08(i3);
    }
}
