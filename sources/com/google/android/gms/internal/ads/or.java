package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class or extends l9.a {
    public static final Parcelable.Creator<or> CREATOR = new gj(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f18343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f18344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f18345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f18346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f18347h;

    public or(boolean z10, String str, int i10, byte[] bArr, String[] strArr, String[] strArr2, boolean z11, long j10) {
        this.f18340a = z10;
        this.f18341b = str;
        this.f18342c = i10;
        this.f18343d = bArr;
        this.f18344e = strArr;
        this.f18345f = strArr2;
        this.f18346g = z11;
        this.f18347h = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.Q(parcel, 1, 4);
        parcel.writeInt(this.f18340a ? 1 : 0);
        r9.b.J(parcel, 2, this.f18341b);
        r9.b.Q(parcel, 3, 4);
        parcel.writeInt(this.f18342c);
        r9.b.D(parcel, 4, this.f18343d);
        r9.b.K(parcel, 5, this.f18344e);
        r9.b.K(parcel, 6, this.f18345f);
        r9.b.Q(parcel, 7, 4);
        parcel.writeInt(this.f18346g ? 1 : 0);
        r9.b.Q(parcel, 8, 8);
        parcel.writeLong(this.f18347h);
        r9.b.S(parcel, iR);
    }
}
