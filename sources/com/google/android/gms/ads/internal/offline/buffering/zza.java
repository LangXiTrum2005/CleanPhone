package com.google.android.gms.ads.internal.offline.buffering;

import android.os.Parcel;
import android.os.Parcelable;
import l9.a;
import r9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zza extends a {
    public static final Parcelable.Creator<zza> CREATOR = new zzb();
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zza(String str, String str2, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int iR = b.R(parcel, 20293);
        b.J(parcel, 1, str);
        b.J(parcel, 2, this.zzb);
        b.J(parcel, 3, this.zzc);
        b.S(parcel, iR);
    }
}
