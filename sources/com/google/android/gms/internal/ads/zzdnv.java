package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdnv {
    zzbkz zza;
    zzbkw zzb;
    zzblm zzc;
    zzblj zzd;
    zzbqh zze;
    final SimpleArrayMap zzf = new SimpleArrayMap(0);
    final SimpleArrayMap zzg = new SimpleArrayMap(0);

    public final zzdnv zza(zzbkz zzbkzVar) {
        this.zza = zzbkzVar;
        return this;
    }

    public final zzdnv zzb(zzbkw zzbkwVar) {
        this.zzb = zzbkwVar;
        return this;
    }

    public final zzdnv zzc(zzblm zzblmVar) {
        this.zzc = zzblmVar;
        return this;
    }

    public final zzdnv zzd(zzblj zzbljVar) {
        this.zzd = zzbljVar;
        return this;
    }

    public final zzdnv zze(zzbqh zzbqhVar) {
        this.zze = zzbqhVar;
        return this;
    }

    public final zzdnv zzf(String str, zzblf zzblfVar, zzblc zzblcVar) {
        this.zzf.put(str, zzblfVar);
        if (zzblcVar != null) {
            this.zzg.put(str, zzblcVar);
        }
        return this;
    }

    public final zzdnw zzg() {
        return new zzdnw(this, null);
    }
}
