package com.facebook.ads.redexgen.core;

import android.os.Parcel;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1104Vi {
    public final int A00;
    public final long A01;
    public final long A02;

    public C1104Vi(int i, long j, long j2) {
        this.A00 = i;
        this.A02 = j;
        this.A01 = j2;
    }

    public /* synthetic */ C1104Vi(int i, long j, long j2, C1103Vh c1103Vh) {
        this(i, j, j2);
    }

    public static C1104Vi A00(Parcel parcel) {
        return new C1104Vi(parcel.readInt(), parcel.readLong(), parcel.readLong());
    }

    public final void A01(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
    }
}
