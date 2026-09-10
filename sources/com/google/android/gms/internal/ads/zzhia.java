package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhia {
    private static final Logger zza = Logger.getLogger(zzhia.class.getName());
    private static final zzhia zzd = new zzhia();
    private final ConcurrentMap zzb = new ConcurrentHashMap();
    private final ConcurrentMap zzc = new ConcurrentHashMap();

    public static zzhia zza() {
        return zzd;
    }

    private final synchronized zzgzy zzg(String str) throws GeneralSecurityException {
        ConcurrentMap concurrentMap;
        concurrentMap = this.zzb;
        if (!concurrentMap.containsKey(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 98);
            sb.append("No key manager found for key type ");
            sb.append(str);
            sb.append(", see https://developers.google.com/tink/faq/registration_errors");
            throw new GeneralSecurityException(sb.toString());
        }
        return (zzgzy) concurrentMap.get(str);
    }

    private final synchronized void zzh(zzgzy zzgzyVar, boolean z2, boolean z3) throws GeneralSecurityException {
        try {
            String strZzb = zzgzyVar.zzb();
            if (z3) {
                ConcurrentMap concurrentMap = this.zzc;
                if (concurrentMap.containsKey(strZzb) && !((Boolean) concurrentMap.get(strZzb)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(strZzb));
                }
            }
            ConcurrentMap concurrentMap2 = this.zzb;
            zzgzy zzgzyVar2 = (zzgzy) concurrentMap2.get(strZzb);
            if (zzgzyVar2 != null && !zzgzyVar2.getClass().equals(zzgzyVar.getClass())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(strZzb));
                throw new GeneralSecurityException("typeUrl (" + strZzb + ") is already registered with " + zzgzyVar2.getClass().getName() + ", cannot be re-registered with " + zzgzyVar.getClass().getName());
            }
            concurrentMap2.putIfAbsent(strZzb, zzgzyVar);
            this.zzc.put(strZzb, Boolean.valueOf(z3));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb(zzgzy zzgzyVar, boolean z2) throws GeneralSecurityException {
        zzf(zzgzyVar, 1, z2);
    }

    public final zzgzy zzc(String str, Class cls) throws GeneralSecurityException {
        zzgzy zzgzyVarZzg = zzg(str);
        if (zzgzyVarZzg.zzc().equals(cls)) {
            return zzgzyVarZzg;
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(zzgzyVarZzg.getClass());
        String string = zzgzyVarZzg.zzc().toString();
        StringBuilder sb = new StringBuilder(Z.d(strValueOf, name.length() + 53, 23) + string.length());
        androidx.media3.extractor.text.ttml.a.C(sb, "Primitive type ", name, " not supported by key manager of type ", strValueOf);
        throw new GeneralSecurityException(android.support.v4.media.a.r(sb, ", which only supports: ", string));
    }

    public final zzgzy zzd(String str) throws GeneralSecurityException {
        return zzg(str);
    }

    public final boolean zze(String str) {
        return ((Boolean) this.zzc.get(str)).booleanValue();
    }

    public final synchronized void zzf(zzgzy zzgzyVar, int i2, boolean z2) throws GeneralSecurityException {
        if (!zzhhb.zza(i2)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        zzh(zzgzyVar, false, z2);
    }
}
