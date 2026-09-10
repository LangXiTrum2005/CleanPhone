package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d01 extends l9.a {
    public static final Parcelable.Creator<d01> CREATOR = new gj(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f13325b;

    public d01(int i10, byte[] bArr) {
        this.f13324a = i10;
        this.f13325b = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.Q(parcel, 1, 4);
        parcel.writeInt(this.f13324a);
        r9.b.D(parcel, 2, this.f13325b);
        r9.b.S(parcel, iR);
    }
}
