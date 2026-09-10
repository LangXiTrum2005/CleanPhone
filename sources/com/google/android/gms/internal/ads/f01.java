package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f01 extends l9.a {
    public static final Parcelable.Creator<f01> CREATOR = new gj(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14147c;

    public f01(int i10, String str, String str2) {
        this.f14145a = i10;
        this.f14146b = str;
        this.f14147c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.Q(parcel, 1, 4);
        parcel.writeInt(this.f14145a);
        r9.b.J(parcel, 2, this.f14146b);
        r9.b.J(parcel, 3, this.f14147c);
        r9.b.S(parcel, iR);
    }
}
