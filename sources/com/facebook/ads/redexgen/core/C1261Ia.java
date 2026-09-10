package com.facebook.ads.redexgen.core;

import android.os.Parcel;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ia, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1261Ia {
    public final int A00;
    public final long A01;

    public C1261Ia(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public /* synthetic */ C1261Ia(int i, long j, IZ iz) {
        this(i, j);
    }

    public static C1261Ia A00(Parcel parcel) {
        return new C1261Ia(parcel.readInt(), parcel.readLong());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
    }
}
