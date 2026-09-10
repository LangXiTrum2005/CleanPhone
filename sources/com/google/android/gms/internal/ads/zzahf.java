package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzahf {
    protected final zzaga zza;

    public zzahf(zzaga zzagaVar) {
        this.zza = zzagaVar;
    }

    public abstract boolean zza(zzer zzerVar) throws zzat;

    public abstract boolean zzb(zzer zzerVar, long j) throws zzat;

    public final boolean zzf(zzer zzerVar, long j) throws zzat {
        return zza(zzerVar) && zzb(zzerVar, j);
    }
}
