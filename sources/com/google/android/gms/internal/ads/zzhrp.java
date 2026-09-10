package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhrp extends zzhtt {
    private final zzhrv zza;
    private final zzhxe zzb;

    private zzhrp(zzhrv zzhrvVar, zzhxe zzhxeVar) {
        this.zza = zzhrvVar;
        this.zzb = zzhxeVar;
    }

    public static zzhrp zzc(zzhrv zzhrvVar, zzhxe zzhxeVar) throws GeneralSecurityException {
        if (zzhxeVar.zzd() != 32) {
            int iZzd = zzhxeVar.zzd();
            throw new GeneralSecurityException(androidx.datastore.preferences.protobuf.a.g(iZzd, "Ed25519 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(iZzd).length() + 65)));
        }
        if (Arrays.equals(zzhrvVar.zzd().zzc(), zzhhm.zza(zzhhm.zzb(zzhxeVar.zzc(zzgzv.zza()))))) {
            return new zzhrp(zzhrvVar, zzhxeVar);
        }
        throw new GeneralSecurityException("Ed25519 keys mismatch");
    }

    @Override // com.google.android.gms.internal.ads.zzhtt, com.google.android.gms.internal.ads.zzgzx
    public final /* synthetic */ zzhan zza() {
        return this.zza.zzf();
    }

    public final zzhro zzd() {
        return this.zza.zzf();
    }

    public final zzhrv zze() {
        return this.zza;
    }

    public final zzhxe zzf() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhtt
    public final /* synthetic */ zzhtu zzg() {
        return this.zza;
    }
}
