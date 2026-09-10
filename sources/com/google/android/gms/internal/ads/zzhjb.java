package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhjb {
    private static final zzhjb zza = new zzhjb();
    private final AtomicReference zzb = new AtomicReference(new zzhjw(new zzhjt(null), null));

    public static zzhjb zza() {
        return zza;
    }

    public final synchronized void zzb(zzhjs zzhjsVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzhjt zzhjtVar = new zzhjt((zzhjw) atomicReference.get(), null);
        zzhjtVar.zza(zzhjsVar);
        atomicReference.set(new zzhjw(zzhjtVar, null));
    }

    public final synchronized void zzc(zzhjy zzhjyVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzhjt zzhjtVar = new zzhjt((zzhjw) atomicReference.get(), null);
        zzhjtVar.zzb(zzhjyVar);
        atomicReference.set(new zzhjw(zzhjtVar, null));
    }

    public final Object zzd(zzgzx zzgzxVar, Class cls) throws GeneralSecurityException {
        return ((zzhjw) this.zzb.get()).zzb(zzgzxVar, cls);
    }

    public final Object zze(zzhih zzhihVar, zzhip zzhipVar, Class cls) throws GeneralSecurityException {
        return ((zzhjw) this.zzb.get()).zzc(zzhihVar, zzhipVar, cls);
    }
}
