package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhas {
    public static zzhai zza(String str) throws GeneralSecurityException {
        try {
            try {
                try {
                    zzhpj zzhpjVarZze = zzhpj.zze(zzgzw.zza(str).zzb().zzaN(), zziab.zza());
                    for (zzhpi zzhpiVar : zzhpjVarZze.zzb()) {
                        if (zzhpiVar.zzb().zzc() == zzhoz.UNKNOWN_KEYMATERIAL || zzhpiVar.zzb().zzc() == zzhoz.SYMMETRIC || zzhpiVar.zzb().zzc() == zzhoz.ASYMMETRIC_PRIVATE) {
                            throw new GeneralSecurityException("keyset contains key material of type " + zzhpiVar.zzb().zzc().name() + " for type url " + zzhpiVar.zzb().zza());
                        }
                    }
                    return zzhai.zza(zzhpjVarZze);
                } catch (zzibg unused) {
                    throw new GeneralSecurityException("invalid keyset");
                }
            } catch (zzibg unused2) {
                throw new GeneralSecurityException("invalid keyset");
            }
        } catch (IOException unused3) {
            throw new GeneralSecurityException("Parse keyset failed");
        }
    }
}
