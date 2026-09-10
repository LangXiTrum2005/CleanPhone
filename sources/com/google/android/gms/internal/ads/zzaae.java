package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaae {
    public final int zza;
    public final zzml[] zzb;
    public final zzzw[] zzc;
    public final zzbn zzd;
    public final Object zze;

    public zzaae(zzml[] zzmlVarArr, zzzw[] zzzwVarArr, zzbn zzbnVar, Object obj) {
        int length = zzmlVarArr.length;
        zzgqa.zza(length == zzzwVarArr.length);
        this.zzb = zzmlVarArr;
        this.zzc = (zzzw[]) zzzwVarArr.clone();
        this.zzd = zzbnVar;
        this.zze = obj;
        this.zza = length;
    }

    public final boolean zza(int i2) {
        return this.zzb[i2] != null;
    }

    public final boolean zzb(zzaae zzaaeVar, int i2) {
        return zzaaeVar != null && Objects.equals(this.zzb[i2], zzaaeVar.zzb[i2]) && Objects.equals(this.zzc[i2], zzaaeVar.zzc[i2]);
    }
}
