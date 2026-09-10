package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhje {
    private static final zzhje zza = (zzhje) zzhkk.zza(zzhjd.zza);
    private final AtomicReference zzb = new AtomicReference(new zzhki(new zzhkf(), null));

    public static zzhje zza() {
        return zza;
    }

    public final synchronized void zzb(zzhig zzhigVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzhkf zzhkfVar = new zzhkf((zzhki) atomicReference.get());
        zzhkfVar.zza(zzhigVar);
        atomicReference.set(new zzhki(zzhkfVar, null));
    }

    public final synchronized void zzc(zzhid zzhidVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzhkf zzhkfVar = new zzhkf((zzhki) atomicReference.get());
        zzhkfVar.zzb(zzhidVar);
        atomicReference.set(new zzhki(zzhkfVar, null));
    }

    public final synchronized void zzd(zzhjl zzhjlVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzhkf zzhkfVar = new zzhkf((zzhki) atomicReference.get());
        zzhkfVar.zzc(zzhjlVar);
        atomicReference.set(new zzhki(zzhkfVar, null));
    }

    public final synchronized void zze(zzhji zzhjiVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzhkf zzhkfVar = new zzhkf((zzhki) atomicReference.get());
        zzhkfVar.zzd(zzhjiVar);
        atomicReference.set(new zzhki(zzhkfVar, null));
    }

    public final boolean zzf(zzhke zzhkeVar) {
        return ((zzhki) this.zzb.get()).zza(zzhkeVar);
    }

    public final zzgzx zzg(zzhke zzhkeVar, @Nullable zzhar zzharVar) throws GeneralSecurityException {
        return ((zzhki) this.zzb.get()).zzb(zzhkeVar, zzharVar);
    }

    public final zzhke zzh(zzgzx zzgzxVar, Class cls, @Nullable zzhar zzharVar) throws GeneralSecurityException {
        return ((zzhki) this.zzb.get()).zzc(zzgzxVar, cls, zzharVar);
    }

    public final boolean zzi(zzhke zzhkeVar) {
        return ((zzhki) this.zzb.get()).zzd(zzhkeVar);
    }

    public final zzhan zzj(zzhke zzhkeVar) throws GeneralSecurityException {
        return ((zzhki) this.zzb.get()).zze(zzhkeVar);
    }

    public final zzhke zzk(zzhan zzhanVar, Class cls) throws GeneralSecurityException {
        return ((zzhki) this.zzb.get()).zzf(zzhanVar, cls);
    }
}
