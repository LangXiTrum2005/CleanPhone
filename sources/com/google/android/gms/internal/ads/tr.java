package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class tr extends l9.a {
    public static final Parcelable.Creator<tr> CREATOR = new gj(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f20466d;

    public tr(String str, int i10, String str2, boolean z10) {
        this.f20463a = str;
        this.f20464b = z10;
        this.f20465c = i10;
        this.f20466d = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.J(parcel, 1, this.f20463a);
        r9.b.Q(parcel, 2, 4);
        parcel.writeInt(this.f20464b ? 1 : 0);
        r9.b.Q(parcel, 3, 4);
        parcel.writeInt(this.f20465c);
        r9.b.J(parcel, 4, this.f20466d);
        r9.b.S(parcel, iR);
    }
}
