package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class xz extends l9.a {
    public static final Parcelable.Creator<xz> CREATOR = new gj(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzr f22048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzm f22049d;

    public xz(String str, String str2, zzr zzrVar, zzm zzmVar) {
        this.f22046a = str;
        this.f22047b = str2;
        this.f22048c = zzrVar;
        this.f22049d = zzmVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.J(parcel, 1, this.f22046a);
        r9.b.J(parcel, 2, this.f22047b);
        r9.b.I(parcel, 3, this.f22048c, i10);
        r9.b.I(parcel, 4, this.f22049d, i10);
        r9.b.S(parcel, iR);
    }
}
