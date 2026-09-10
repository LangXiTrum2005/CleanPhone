package com.facebook.ads.redexgen.core;

import android.os.Parcel;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class IX {
    public final int A00;
    public final long A01;
    public final long A02;

    public IX(int i2, long j, long j2) {
        this.A00 = i2;
        this.A02 = j;
        this.A01 = j2;
    }

    public /* synthetic */ IX(int i2, long j, long j2, IW iw) {
        this(i2, j, j2);
    }

    public static IX A00(Parcel parcel) {
        return new IX(parcel.readInt(), parcel.readLong(), parcel.readLong());
    }

    public final void A01(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
    }
}
