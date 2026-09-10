package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class yx extends l9.a {
    public static final Parcelable.Creator<yx> CREATOR = new gj(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzm f22391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22392b;

    public yx(zzm zzmVar, String str) {
        this.f22391a = zzmVar;
        this.f22392b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.I(parcel, 2, this.f22391a, i10);
        r9.b.J(parcel, 3, this.f22392b);
        r9.b.S(parcel, iR);
    }
}
