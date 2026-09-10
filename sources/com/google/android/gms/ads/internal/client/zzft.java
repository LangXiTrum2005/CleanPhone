package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import l9.a;
import r9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class zzft extends a {
    public static final Parcelable.Creator<zzft> CREATOR = new zzfu();
    public final String zza;

    public zzft(String str) {
        this.zza = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int iR = b.R(parcel, 20293);
        b.J(parcel, 15, str);
        b.S(parcel, iR);
    }
}
