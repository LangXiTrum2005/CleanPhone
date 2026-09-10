package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import l9.a;
import r9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzv extends a {
    public static final Parcelable.Creator<zzv> CREATOR = new zzw();
    public final String zza;
    public long zzb;

    @Nullable
    public zze zzc;
    public final Bundle zzd;
    public final String zze;
    public final String zzf;
    public final String zzg;
    public final String zzh;

    public zzv(String str, long j10, @Nullable zze zzeVar, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.zza = str;
        this.zzb = j10;
        this.zzc = zzeVar;
        this.zzd = bundle;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = str4;
        this.zzh = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int iR = b.R(parcel, 20293);
        b.J(parcel, 1, str);
        long j10 = this.zzb;
        b.Q(parcel, 2, 8);
        parcel.writeLong(j10);
        b.I(parcel, 3, this.zzc, i10);
        b.C(parcel, 4, this.zzd);
        b.J(parcel, 5, this.zze);
        b.J(parcel, 6, this.zzf);
        b.J(parcel, 7, this.zzg);
        b.J(parcel, 8, this.zzh);
        b.S(parcel, iR);
    }
}
