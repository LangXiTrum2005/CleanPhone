package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import l9.a;
import r9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzl extends a {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final float zze;
    public final int zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    public zzl(boolean z10, boolean z11, String str, boolean z12, float f10, int i10, boolean z13, boolean z14, boolean z15) {
        this.zza = z10;
        this.zzb = z11;
        this.zzc = str;
        this.zzd = z12;
        this.zze = f10;
        this.zzf = i10;
        this.zzg = z13;
        this.zzh = z14;
        this.zzi = z15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10 = this.zza;
        int iR = b.R(parcel, 20293);
        b.Q(parcel, 2, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.zzb;
        b.Q(parcel, 3, 4);
        parcel.writeInt(z11 ? 1 : 0);
        b.J(parcel, 4, this.zzc);
        boolean z12 = this.zzd;
        b.Q(parcel, 5, 4);
        parcel.writeInt(z12 ? 1 : 0);
        float f10 = this.zze;
        b.Q(parcel, 6, 4);
        parcel.writeFloat(f10);
        int i11 = this.zzf;
        b.Q(parcel, 7, 4);
        parcel.writeInt(i11);
        boolean z13 = this.zzg;
        b.Q(parcel, 8, 4);
        parcel.writeInt(z13 ? 1 : 0);
        boolean z14 = this.zzh;
        b.Q(parcel, 9, 4);
        parcel.writeInt(z14 ? 1 : 0);
        boolean z15 = this.zzi;
        b.Q(parcel, 10, 4);
        parcel.writeInt(z15 ? 1 : 0);
        b.S(parcel, iR);
    }

    public zzl(boolean z10, boolean z11, boolean z12, float f10, int i10, boolean z13, boolean z14, boolean z15) {
        this(z10, z11, null, z12, f10, -1, z13, z14, z15);
    }
}
