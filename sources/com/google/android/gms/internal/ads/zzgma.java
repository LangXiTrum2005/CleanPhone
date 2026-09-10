package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgma {
    public static final /* synthetic */ int zza = 0;
    private static final zzglz zzb = new zzglz() { // from class: com.google.android.gms.internal.ads.zzgly
        @Override // com.google.android.gms.internal.ads.zzglz
        public final zzgdx zza(zzgek zzgekVar, Integer num) throws GeneralSecurityException {
            int i = zzgma.zza;
            zzgsp zzgspVarZzc = ((zzgll) zzgekVar).zzb().zzc();
            zzgdy zzgdyVarZzb = zzgkz.zzc().zzb(zzgspVarZzc.zzi());
            if (!zzgkz.zzc().zze(zzgspVarZzc.zzi())) {
                throw new GeneralSecurityException("Creating new keys is not allowed.");
            }
            zzgsl zzgslVarZza = zzgdyVarZzb.zza(zzgspVarZzc.zzh());
            return new zzglk(zzgnh.zza(zzgslVarZza.zzg(), zzgslVarZza.zzf(), zzgslVarZza.zzb(), zzgspVarZzc.zzg(), num), zzgdw.zza());
        }
    };
    private static final zzgma zzc = zze();
    private final Map zzd = new HashMap();

    public static zzgma zzb() {
        return zzc;
    }

    private final synchronized zzgdx zzd(zzgek zzgekVar, @Nullable Integer num) throws GeneralSecurityException {
        zzglz zzglzVar;
        zzglzVar = (zzglz) this.zzd.get(zzgekVar.getClass());
        if (zzglzVar == null) {
            throw new GeneralSecurityException("Cannot create a new key for parameters " + zzgekVar.toString() + ": no key creator for this class was registered.");
        }
        return zzglzVar.zza(zzgekVar, num);
    }

    private static zzgma zze() {
        zzgma zzgmaVar = new zzgma();
        try {
            zzgmaVar.zzc(zzb, zzgll.class);
            return zzgmaVar;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("unexpected error.", e);
        }
    }

    public final zzgdx zza(zzgek zzgekVar, @Nullable Integer num) throws GeneralSecurityException {
        return zzd(zzgekVar, num);
    }

    public final synchronized void zzc(zzglz zzglzVar, Class cls) throws GeneralSecurityException {
        try {
            zzglz zzglzVar2 = (zzglz) this.zzd.get(cls);
            if (zzglzVar2 != null && !zzglzVar2.equals(zzglzVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + cls.toString() + " already inserted");
            }
            this.zzd.put(cls, zzglzVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
