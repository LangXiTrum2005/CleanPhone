package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhiv {
    public static final /* synthetic */ int zza = 0;
    private static final zzhhz zzc = zzhiu.zza;
    private static final zzhiv zzd = zzd();
    private final Map zzb = new HashMap();

    public static zzhiv zza() {
        return zzd;
    }

    private static zzhiv zzd() {
        zzhiv zzhivVar = new zzhiv();
        try {
            zzhivVar.zzb(zzc, zzhin.class);
            return zzhivVar;
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException("unexpected error.", e2);
        }
    }

    private final synchronized zzgzx zze(zzhan zzhanVar, @Nullable Integer num) throws GeneralSecurityException {
        zzhhz zzhhzVar;
        zzhhzVar = (zzhhz) this.zzb.get(zzhanVar.getClass());
        if (zzhhzVar == null) {
            String string = zzhanVar.toString();
            StringBuilder sb = new StringBuilder(string.length() + 86);
            sb.append("Cannot create a new key for parameters ");
            sb.append(string);
            sb.append(": no key creator for this class was registered.");
            throw new GeneralSecurityException(sb.toString());
        }
        return zzhhzVar.zza(zzhanVar, num);
    }

    public final synchronized void zzb(zzhhz zzhhzVar, Class cls) throws GeneralSecurityException {
        try {
            Map map = this.zzb;
            zzhhz zzhhzVar2 = (zzhhz) map.get(cls);
            if (zzhhzVar2 != null && !zzhhzVar2.equals(zzhhzVar)) {
                String string = cls.toString();
                StringBuilder sb = new StringBuilder(string.length() + 60);
                sb.append("Different key creator for parameters class ");
                sb.append(string);
                sb.append(" already inserted");
                throw new GeneralSecurityException(sb.toString());
            }
            map.put(cls, zzhhzVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final zzgzx zzc(zzhan zzhanVar, @Nullable Integer num) throws GeneralSecurityException {
        return zze(zzhanVar, num);
    }
}
