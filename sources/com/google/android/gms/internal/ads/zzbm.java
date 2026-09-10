package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbm {
    public final int zza;
    private final zzbg zzb;
    private final boolean zzc;
    private final int[] zzd;
    private final boolean[] zze;

    static {
        String str = zzfj.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public zzbm(zzbg zzbgVar, boolean z2, int[] iArr, boolean[] zArr) {
        int i2 = zzbgVar.zza;
        this.zza = i2;
        zzgqa.zza(i2 == iArr.length && i2 == zArr.length);
        this.zzb = zzbgVar;
        this.zzc = z2 && i2 > 1;
        this.zzd = (int[]) iArr.clone();
        this.zze = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbm.class == obj.getClass()) {
            zzbm zzbmVar = (zzbm) obj;
            if (this.zzc == zzbmVar.zzc && this.zzb.equals(zzbmVar.zzb) && Arrays.equals(this.zzd, zzbmVar.zzd) && Arrays.equals(this.zze, zzbmVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode() * 31;
        int[] iArr = this.zzd;
        int iHashCode2 = Arrays.hashCode(iArr) + ((iHashCode + (this.zzc ? 1 : 0)) * 31);
        return Arrays.hashCode(this.zze) + (iHashCode2 * 31);
    }

    public final zzv zza(int i2) {
        return this.zzb.zza(i2);
    }

    public final boolean zzb() {
        for (boolean z2 : this.zze) {
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzc(int i2) {
        return this.zze[i2];
    }

    public final int zzd() {
        return this.zzb.zzc;
    }
}
