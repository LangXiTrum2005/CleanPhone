package com.facebook.ads.redexgen.core;

import android.os.Parcel;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ia, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1430Ia {
    public final int A00;
    public final long A01;

    public C1430Ia(int i2, long j) {
        this.A00 = i2;
        this.A01 = j;
    }

    public /* synthetic */ C1430Ia(int i2, long j, IZ iz) {
        this(i2, j);
    }

    public static C1430Ia A00(Parcel parcel) {
        return new C1430Ia(parcel.readInt(), parcel.readLong());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
    }
}
