package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ex extends l9.a {
    public static final Parcelable.Creator<ex> CREATOR = new gj(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14101a;

    public ex(String str) {
        this.f14101a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.J(parcel, 1, this.f14101a);
        r9.b.S(parcel, iR);
    }
}
