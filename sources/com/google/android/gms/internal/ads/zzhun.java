package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhun implements zzhap {
    private zzhun(zzhap zzhapVar, byte[] bArr, byte[] bArr2) {
    }

    public static zzhap zzb(zzhim zzhimVar) throws GeneralSecurityException {
        zzhjz zzhjzVarZzc = zzhimVar.zzc(zzgzv.zza());
        return new zzhun((zzhap) zzhia.zza().zzc(zzhjzVarZzc.zzg(), zzhap.class).zza(zzhjzVarZzc.zzb()), zzhuo.zzc(zzhjzVarZzc), zzhuo.zzd(zzhjzVarZzc));
    }

    @Override // com.google.android.gms.internal.ads.zzhap
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }
}
