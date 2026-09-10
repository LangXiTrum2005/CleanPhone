package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i7 extends l9.a {
    public static final Parcelable.Creator<i7> CREATOR = new j7(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f23577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f23578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f23579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f23580e;

    public i7(long j10, long j11, boolean z10, Bundle bundle, String str) {
        this.f23576a = j10;
        this.f23577b = j11;
        this.f23578c = z10;
        this.f23579d = bundle;
        this.f23580e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.Q(parcel, 1, 8);
        parcel.writeLong(this.f23576a);
        r9.b.Q(parcel, 2, 8);
        parcel.writeLong(this.f23577b);
        r9.b.Q(parcel, 3, 4);
        parcel.writeInt(this.f23578c ? 1 : 0);
        r9.b.C(parcel, 7, this.f23579d);
        r9.b.J(parcel, 8, this.f23580e);
        r9.b.S(parcel, iR);
    }
}
