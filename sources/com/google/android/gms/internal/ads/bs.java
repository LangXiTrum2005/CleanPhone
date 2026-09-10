package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class bs extends l9.a {
    public static final Parcelable.Creator<bs> CREATOR = new gj(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12874d;

    public bs(String str, int i10, int i11, int i12) {
        this.f12871a = i10;
        this.f12872b = i11;
        this.f12873c = str;
        this.f12874d = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.Q(parcel, 1, 4);
        parcel.writeInt(this.f12872b);
        r9.b.J(parcel, 2, this.f12873c);
        r9.b.Q(parcel, 3, 4);
        parcel.writeInt(this.f12874d);
        r9.b.Q(parcel, 1000, 4);
        parcel.writeInt(this.f12871a);
        r9.b.S(parcel, iR);
    }
}
