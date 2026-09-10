package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import l9.a;
import r9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzc extends a {
    public static final Parcelable.Creator<zzc> CREATOR = new zzd();
    private final String zza;
    private final int zzb;

    public zzc(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = b.R(parcel, 20293);
        b.J(parcel, 1, this.zza);
        int i11 = this.zzb;
        b.Q(parcel, 2, 4);
        parcel.writeInt(i11);
        b.S(parcel, iR);
    }

    public final int zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }
}
