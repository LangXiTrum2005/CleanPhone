package com.facebook.ads.redexgen.core;

import android.os.Parcel;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1107Vl {
    public final int A00;
    public final long A01;

    public C1107Vl(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public /* synthetic */ C1107Vl(int i, long j, C1106Vk c1106Vk) {
        this(i, j);
    }

    public static C1107Vl A00(Parcel parcel) {
        return new C1107Vl(parcel.readInt(), parcel.readLong());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
    }
}
