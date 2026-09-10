package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class as extends l9.a {
    public static final Parcelable.Creator<as> CREATOR = new gj(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f12503b;

    public as(Bundle bundle, String str) {
        this.f12502a = str;
        this.f12503b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.J(parcel, 1, this.f12502a);
        r9.b.C(parcel, 2, this.f12503b);
        r9.b.S(parcel, iR);
    }
}
