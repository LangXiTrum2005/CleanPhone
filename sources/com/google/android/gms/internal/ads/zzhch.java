package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhch {
    public static final /* synthetic */ int zza = 0;
    private static final zzhjs zzb = zzhjs.zzd(zzhce.zza, zzhcd.class, zzgzq.class);
    private static final zzgzy zzc = zzhij.zze("type.googleapis.com/google.crypto.tink.AesGcmKey", zzgzq.class, zzhoz.SYMMETRIC, zzhnq.zze());
    private static final zzhiw zzd = zzhcg.zza;
    private static final zzhhz zze = zzhcf.zza;
    private static final int zzf = 2;

    public static void zza(boolean z2) throws GeneralSecurityException {
        int i2 = zzf;
        if (!zzhhb.zza(i2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i3 = zzhfm.zza;
        zzhfm.zza(zzhje.zza());
        zzhjb.zza().zzb(zzb);
        zzhja zzhjaVarZza = zzhja.zza();
        HashMap map = new HashMap();
        map.put("AES128_GCM", zzhei.zza);
        zzhci zzhciVar = new zzhci(null);
        zzhciVar.zzb(12);
        zzhciVar.zza(16);
        zzhciVar.zzc(16);
        zzhcj zzhcjVar = zzhcj.zzc;
        zzhciVar.zzd(zzhcjVar);
        map.put("AES128_GCM_RAW", zzhciVar.zze());
        map.put("AES256_GCM", zzhei.zzb);
        zzhci zzhciVar2 = new zzhci(null);
        zzhciVar2.zzb(12);
        zzhciVar2.zza(32);
        zzhciVar2.zzc(16);
        zzhciVar2.zzd(zzhcjVar);
        map.put("AES256_GCM_RAW", zzhciVar2.zze());
        zzhjaVarZza.zzd(Collections.unmodifiableMap(map));
        zzhix.zza().zzb(zzd, zzhck.class);
        zzhiv.zza().zzb(zze, zzhck.class);
        zzhia.zza().zzf(zzc, i2, true);
    }
}
