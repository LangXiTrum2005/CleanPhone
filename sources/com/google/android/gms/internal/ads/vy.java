package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class vy extends l9.a {
    public static final Parcelable.Creator<vy> CREATOR = new gj(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21316b;

    public vy(String str, String str2) {
        this.f21315a = str;
        this.f21316b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.J(parcel, 1, this.f21315a);
        r9.b.J(parcel, 2, this.f21316b);
        r9.b.S(parcel, iR);
    }

    public vy(ServerSideVerificationOptions serverSideVerificationOptions) {
        this(serverSideVerificationOptions.getUserId(), serverSideVerificationOptions.getCustomData());
    }
}
