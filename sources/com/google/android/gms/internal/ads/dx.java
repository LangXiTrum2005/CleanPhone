package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class dx extends l9.a {
    public static final Parcelable.Creator<dx> CREATOR = new gj(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f13753b;

    public dx(List list, boolean z10) {
        this.f13752a = z10;
        this.f13753b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.Q(parcel, 2, 4);
        parcel.writeInt(this.f13752a ? 1 : 0);
        r9.b.L(parcel, 3, this.f13753b);
        r9.b.S(parcel, iR);
    }
}
