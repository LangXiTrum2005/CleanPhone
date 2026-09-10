package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgmh {
    private static final zzgmh zza = new zzgmh();
    private final AtomicReference zzb = new AtomicReference(new zzgnb(new zzgmy(null), null));

    public static zzgmh zza() {
        return zza;
    }

    public final Class zzb(Class cls) throws GeneralSecurityException {
        return ((zzgnb) this.zzb.get()).zza(cls);
    }

    public final Object zzc(zzgdx zzgdxVar, Class cls) throws GeneralSecurityException {
        return ((zzgnb) this.zzb.get()).zzb(zzgdxVar, cls);
    }

    public final Object zzd(zzgnf zzgnfVar, Class cls) throws GeneralSecurityException {
        return ((zzgnb) this.zzb.get()).zzc(zzgnfVar, cls);
    }

    public final synchronized void zze(zzgmx zzgmxVar) throws GeneralSecurityException {
        zzgmy zzgmyVar = new zzgmy((zzgnb) this.zzb.get(), null);
        zzgmyVar.zza(zzgmxVar);
        this.zzb.set(new zzgnb(zzgmyVar, null));
    }

    public final synchronized void zzf(zzgng zzgngVar) throws GeneralSecurityException {
        zzgmy zzgmyVar = new zzgmy((zzgnb) this.zzb.get(), null);
        zzgmyVar.zzb(zzgngVar);
        this.zzb.set(new zzgnb(zzgmyVar, null));
    }
}
