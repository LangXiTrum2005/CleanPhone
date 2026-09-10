package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k9.c0;
import l9.a;
import r9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzm extends a {
    public static final Parcelable.Creator<zzm> CREATOR = new zzo();
    public final long zzA;
    public final int zzB;
    public final Bundle zzC = new Bundle();
    public final int zza;

    @Deprecated
    public final long zzb;
    public final Bundle zzc;

    @Deprecated
    public final int zzd;
    public final List zze;
    public final boolean zzf;
    public final int zzg;
    public final boolean zzh;
    public final String zzi;

    @Nullable
    @Deprecated
    public final zzft zzj;
    public final Location zzk;
    public final String zzl;
    public final Bundle zzm;
    public final Bundle zzn;
    public final List zzo;
    public final String zzp;
    public final String zzq;

    @Deprecated
    public final boolean zzr;

    @Nullable
    public final zzc zzs;
    public final int zzt;

    @Nullable
    public final String zzu;
    public final List zzv;
    public final int zzw;

    @Nullable
    public final String zzx;
    public final int zzy;
    public final long zzz;

    public zzm(int i10, long j10, Bundle bundle, int i11, List list, boolean z10, int i12, boolean z11, String str, @Nullable zzft zzftVar, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z12, @Nullable zzc zzcVar, int i13, @Nullable String str5, List list3, int i14, @Nullable String str6, int i15, long j11, long j12, int i16) {
        this.zza = i10;
        this.zzb = j10;
        this.zzc = bundle == null ? new Bundle() : bundle;
        this.zzd = i11;
        this.zze = list;
        this.zzf = z10;
        this.zzg = i12;
        this.zzh = z11;
        this.zzi = str;
        this.zzj = zzftVar;
        this.zzk = location;
        this.zzl = str2;
        this.zzm = bundle2 == null ? new Bundle() : bundle2;
        this.zzn = bundle3;
        this.zzo = list2;
        this.zzp = str3;
        this.zzq = str4;
        this.zzr = z12;
        this.zzs = zzcVar;
        this.zzt = i13;
        this.zzu = str5;
        this.zzv = list3 == null ? new ArrayList() : list3;
        this.zzw = i14;
        this.zzx = str6;
        this.zzy = i15;
        this.zzz = j11;
        this.zzA = j12;
        this.zzB = i16;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzm) {
            return zza(obj) && this.zzz == ((zzm) obj).zzz;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Long.valueOf(this.zzb), this.zzc, Integer.valueOf(this.zzd), this.zze, Boolean.valueOf(this.zzf), Integer.valueOf(this.zzg), Boolean.valueOf(this.zzh), this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzp, this.zzq, Boolean.valueOf(this.zzr), Integer.valueOf(this.zzt), this.zzu, this.zzv, Integer.valueOf(this.zzw), this.zzx, Integer.valueOf(this.zzy), Long.valueOf(this.zzz), Long.valueOf(this.zzA), Integer.valueOf(this.zzB)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int iR = b.R(parcel, 20293);
        b.Q(parcel, 1, 4);
        parcel.writeInt(i11);
        long j10 = this.zzb;
        b.Q(parcel, 2, 8);
        parcel.writeLong(j10);
        b.C(parcel, 3, this.zzc);
        int i12 = this.zzd;
        b.Q(parcel, 4, 4);
        parcel.writeInt(i12);
        b.L(parcel, 5, this.zze);
        boolean z10 = this.zzf;
        b.Q(parcel, 6, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i13 = this.zzg;
        b.Q(parcel, 7, 4);
        parcel.writeInt(i13);
        boolean z11 = this.zzh;
        b.Q(parcel, 8, 4);
        parcel.writeInt(z11 ? 1 : 0);
        b.J(parcel, 9, this.zzi);
        b.I(parcel, 10, this.zzj, i10);
        b.I(parcel, 11, this.zzk, i10);
        b.J(parcel, 12, this.zzl);
        b.C(parcel, 13, this.zzm);
        b.C(parcel, 14, this.zzn);
        b.L(parcel, 15, this.zzo);
        b.J(parcel, 16, this.zzp);
        b.J(parcel, 17, this.zzq);
        boolean z12 = this.zzr;
        b.Q(parcel, 18, 4);
        parcel.writeInt(z12 ? 1 : 0);
        b.I(parcel, 19, this.zzs, i10);
        int i14 = this.zzt;
        b.Q(parcel, 20, 4);
        parcel.writeInt(i14);
        b.J(parcel, 21, this.zzu);
        b.L(parcel, 22, this.zzv);
        int i15 = this.zzw;
        b.Q(parcel, 23, 4);
        parcel.writeInt(i15);
        b.J(parcel, 24, this.zzx);
        int i16 = this.zzy;
        b.Q(parcel, 25, 4);
        parcel.writeInt(i16);
        long j11 = this.zzz;
        b.Q(parcel, 26, 8);
        parcel.writeLong(j11);
        long j12 = this.zzA;
        b.Q(parcel, 27, 8);
        parcel.writeLong(j12);
        int i17 = this.zzB;
        b.Q(parcel, 28, 4);
        parcel.writeInt(i17);
        b.S(parcel, iR);
    }

    public final boolean zza(Object obj) {
        if (!(obj instanceof zzm)) {
            return false;
        }
        zzm zzmVar = (zzm) obj;
        return this.zza == zzmVar.zza && this.zzb == zzmVar.zzb && com.google.android.gms.ads.internal.util.client.zzp.zza(this.zzc, zzmVar.zzc) && this.zzd == zzmVar.zzd && c0.l(this.zze, zzmVar.zze) && this.zzf == zzmVar.zzf && this.zzg == zzmVar.zzg && this.zzh == zzmVar.zzh && c0.l(this.zzi, zzmVar.zzi) && c0.l(this.zzj, zzmVar.zzj) && c0.l(this.zzk, zzmVar.zzk) && c0.l(this.zzl, zzmVar.zzl) && com.google.android.gms.ads.internal.util.client.zzp.zza(this.zzm, zzmVar.zzm) && com.google.android.gms.ads.internal.util.client.zzp.zza(this.zzn, zzmVar.zzn) && c0.l(this.zzo, zzmVar.zzo) && c0.l(this.zzp, zzmVar.zzp) && c0.l(this.zzq, zzmVar.zzq) && this.zzr == zzmVar.zzr && this.zzt == zzmVar.zzt && c0.l(this.zzu, zzmVar.zzu) && c0.l(this.zzv, zzmVar.zzv) && this.zzw == zzmVar.zzw && c0.l(this.zzx, zzmVar.zzx) && this.zzy == zzmVar.zzy && this.zzB == zzmVar.zzB;
    }

    public final boolean zzb() {
        return zzc() || zzd();
    }

    public final boolean zzc() {
        return this.zzc.getBoolean("is_sdk_preload", false);
    }

    public final boolean zzd() {
        return this.zzc.getBoolean("zenith_v2", false);
    }
}
