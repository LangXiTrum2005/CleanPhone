package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ta extends l9.a {
    public static final Parcelable.Creator<ta> CREATOR = new j7(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f23987a;

    public ta(byte[] bArr) {
        this.f23987a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.D(parcel, 2, this.f23987a);
        r9.b.S(parcel, iR);
    }
}
