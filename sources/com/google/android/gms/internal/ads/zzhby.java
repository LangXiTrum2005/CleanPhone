package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhby {
    public static final /* synthetic */ int zza = 0;
    private static final zzhjs zzb = zzhjs.zzd(zzhbw.zza, zzhbv.class, zzgzq.class);
    private static final zzgzy zzc = zzhij.zze("type.googleapis.com/google.crypto.tink.AesEaxKey", zzgzq.class, zzhoz.SYMMETRIC, zzhnk.zzg());
    private static final zzhhz zzd = zzhbx.zza;

    public static void zza(boolean z2) throws GeneralSecurityException {
        if (!zzhhb.zza(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        int i2 = zzhff.zza;
        zzhff.zza(zzhje.zza());
        zzhjb.zza().zzb(zzb);
        zzhja zzhjaVarZza = zzhja.zza();
        HashMap map = new HashMap();
        map.put("AES128_EAX", zzhei.zzc);
        zzhbz zzhbzVar = new zzhbz(null);
        zzhbzVar.zzb(16);
        zzhbzVar.zza(16);
        zzhbzVar.zzc(16);
        zzhca zzhcaVar = zzhca.zzc;
        zzhbzVar.zzd(zzhcaVar);
        map.put("AES128_EAX_RAW", zzhbzVar.zze());
        map.put("AES256_EAX", zzhei.zzd);
        zzhbz zzhbzVar2 = new zzhbz(null);
        zzhbzVar2.zzb(16);
        zzhbzVar2.zza(32);
        zzhbzVar2.zzc(16);
        zzhbzVar2.zzd(zzhcaVar);
        map.put("AES256_EAX_RAW", zzhbzVar2.zze());
        zzhjaVarZza.zzd(Collections.unmodifiableMap(map));
        zzhiv.zza().zzb(zzd, zzhcb.class);
        zzhia.zza().zzb(zzc, true);
    }
}
