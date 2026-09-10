package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class zzyq implements zzzw {
    protected final zzbg zza;
    protected final int zzb;
    protected final int[] zzc;
    private final zzv[] zzd;
    private int zze;

    public zzyq(zzbg zzbgVar, int[] iArr, int i2) {
        int length = iArr.length;
        zzgqa.zzi(length > 0);
        zzbgVar.getClass();
        this.zza = zzbgVar;
        this.zzb = length;
        this.zzd = new zzv[length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.zzd[i3] = zzbgVar.zza(iArr[i3]);
        }
        Arrays.sort(this.zzd, zzyp.zza);
        this.zzc = new int[this.zzb];
        for (int i4 = 0; i4 < this.zzb; i4++) {
            this.zzc[i4] = zzbgVar.zzb(this.zzd[i4]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzyq zzyqVar = (zzyq) obj;
            if (this.zza.equals(zzyqVar.zza) && Arrays.equals(this.zzc, zzyqVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zze;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = Arrays.hashCode(this.zzc) + (System.identityHashCode(this.zza) * 31);
        this.zze = iHashCode;
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final zzbg zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final zzv zzb(int i2) {
        return this.zzd[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzzw
    public final zzv zzc() {
        return this.zzd[0];
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final int zze() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final int zzf(int i2) {
        return this.zzc[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    public final int zzg(int i2) {
        for (int i3 = 0; i3 < this.zzb; i3++) {
            if (this.zzc[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzzw
    public final int zzh() {
        return this.zzc[0];
    }
}
