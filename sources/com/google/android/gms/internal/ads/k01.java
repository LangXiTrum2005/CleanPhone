package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k01 extends l9.a {
    public static final Parcelable.Creator<k01> CREATOR = new gj(23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16240e;

    public k01(String str, int i10, int i11, int i12, String str2) {
        this.f16236a = i10;
        this.f16237b = i11;
        this.f16238c = str;
        this.f16239d = str2;
        this.f16240e = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.Q(parcel, 1, 4);
        parcel.writeInt(this.f16236a);
        r9.b.Q(parcel, 2, 4);
        parcel.writeInt(this.f16237b);
        r9.b.J(parcel, 3, this.f16238c);
        r9.b.J(parcel, 4, this.f16239d);
        r9.b.Q(parcel, 5, 4);
        parcel.writeInt(this.f16240e);
        r9.b.S(parcel, iR);
    }
}
