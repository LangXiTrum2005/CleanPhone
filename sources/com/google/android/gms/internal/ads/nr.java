package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class nr extends l9.a {
    public static final Parcelable.Creator<nr> CREATOR = new gj(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f17920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f17921c;

    public nr(String str, String[] strArr, String[] strArr2) {
        this.f17919a = str;
        this.f17920b = strArr;
        this.f17921c = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.J(parcel, 1, this.f17919a);
        r9.b.K(parcel, 2, this.f17920b);
        r9.b.K(parcel, 3, this.f17921c);
        r9.b.S(parcel, iR);
    }
}
