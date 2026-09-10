package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends l9.a {
    public static final Parcelable.Creator<d> CREATOR = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f22801b;

    public d() {
        this.f22800a = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.Q(parcel, 1, 4);
        parcel.writeInt(this.f22800a);
        r9.b.J(parcel, 2, this.f22801b);
        r9.b.S(parcel, iR);
    }

    public d(int i10, String str) {
        this.f22800a = i10;
        this.f22801b = str;
    }
}
